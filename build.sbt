import org.scalajs.linker.interface.ModuleSplitStyle

val reactJS  = "17.0.2"
val FUILess  = "2.8.7"
val reactSUI = "2.0.3"

val scalaJsReact       = "2.0.0"
val scalaJSReactCommon = "0.14.6"
val cats               = "2.6.1"
val munit              = "0.7.29"

cancelable in Global := true

resolvers in Global += Resolver.sonatypeRepo("public")

ThisBuild / turbo := true

Global / onChangedBuildSource := ReloadOnSourceChanges

// sbt-release-early
inThisBuild(
  List(
    homepage   := Some(url("https://github.com/cquiroz/scalajs-react-semantic-ui")),
    licenses   := Seq("BSD 3-Clause License" -> url("https://opensource.org/licenses/BSD-3-Clause")),
    developers := List(
      Developer("cquiroz",
                "Carlos Quiroz",
                "carlos.m.quiroz@gmail.com",
                url("https://github.com/cquiroz")
      )
    ),
    scmInfo    := Some(
      ScmInfo(url("https://github.com/cquiroz/scalajs-react-semantic-ui"),
              "scm:git:git@github.com:cquiroz/scalajs-react-semantic-ui.git"
      )
    )
  )
)

val root =
  project
    .in(file("."))
    .settings(commonSettings: _*)
    .aggregate(facade, demo)
    .settings(
      name            := "scalajs-react-semantic-ui",
      // No, SBT, we don't want any artifacts for root.
      // No, not even an empty jar.
      publish         := {},
      publishLocal    := {},
      publishArtifact := false,
      Keys.`package`  := file("")
    )

lazy val demo =
  project
    .in(file("demo"))
    .enablePlugins(ScalaJSPlugin)
    .settings(commonSettings: _*)
    .settings(
      test            := {},
      Compile / fastLinkJS / scalaJSLinkerConfig ~= { _.withSourceMap(false) },
      Compile / fullLinkJS / scalaJSLinkerConfig ~= { _.withSourceMap(false) },
      scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
      Compile / fastLinkJS / scalaJSLinkerConfig ~= (_.withModuleSplitStyle(
        ModuleSplitStyle.SmallestModules
      )),
      Compile / fullLinkJS / scalaJSLinkerConfig ~= (_.withModuleSplitStyle(
        ModuleSplitStyle.FewestModules
      )),
      publish / skip  := true,
      publish         := {},
      publishLocal    := {},
      publishArtifact := false,
      Keys.`package`  := file("")
    )
    .dependsOn(facade)

lazy val facade =
  project
    .in(file("facade"))
    .enablePlugins(ScalaJSBundlerPlugin)
    .settings(commonSettings: _*)
    .settings(
      name                            := "react-semantic-ui",
      webpack / version               := "4.44.1",
      startWebpackDevServer / version := "3.11.0",
      installJsdom / version          := "16.4.0",
      // Requires the DOM for tests
      Test / requireJsDomEnv          := true,
      // Compile tests to JS using fast-optimisation
      Test / scalaJSStage             := FastOptStage,
      Compile / npmDependencies ++= Seq(
        "react"             -> reactJS,
        "react-dom"         -> reactJS,
        "semantic-ui-react" -> reactSUI,
        "chokidar"          -> "3.4.2"
      ),
      libraryDependencies ++= Seq(
        "com.github.japgolly.scalajs-react" %%% "core"      % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "extra"     % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "test"      % scalaJsReact % Test,
        "io.github.cquiroz.react"           %%% "common"    % scalaJSReactCommon,
        "org.scalameta"                     %%% "munit"     % munit        % Test,
        "org.typelevel"                     %%% "cats-core" % cats         % Test
      ),
      Test / webpackConfigFile        := Some(baseDirectory.value / "test.webpack.config.js"),
      testFrameworks += new TestFramework("utest.runner.Framework"),
      testFrameworks += new TestFramework("munit.Framework")
    )

lazy val commonSettings = Seq(
  scalaVersion           := "2.13.7",
  organization           := "io.github.cquiroz.react",
  sonatypeProfileName    := "io.github.cquiroz",
  description            := "scala.js facade for react-semanticui",
  Test / publishArtifact := false,
  scalacOptions ~= (_.filterNot(
    Set(
      // By necessity facades will have unused params
      "-Wdead-code",
      "-Wunused:params",
      "-Wunused:explicits"
    )
  ))
)
