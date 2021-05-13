import org.scalajs.linker.interface.ModuleSplitStyle

val reactJS      = "16.13.1"
val scalaJsReact = "1.7.7"
val FUILess      = "2.8.7"
val reactSUI     = "2.0.3"
val Toasts       = "0.6.5"

cancelable in Global := true

resolvers in Global += Resolver.sonatypeRepo("public")

ThisBuild / turbo := true

Global / onChangedBuildSource := ReloadOnSourceChanges

// sbt-release-early
inThisBuild(
  List(
    homepage := Some(url("https://github.com/cquiroz/scalajs-react-semantic-ui")),
    licenses := Seq("BSD 3-Clause License" -> url("https://opensource.org/licenses/BSD-3-Clause")),
    developers := List(
      Developer("cquiroz",
                "Carlos Quiroz",
                "carlos.m.quiroz@gmail.com",
                url("https://github.com/cquiroz")
      )
    ),
    scmInfo := Some(
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
      name := "scalajs-react-semantic-ui",
      // No, SBT, we don't want any artifacts for root.
      // No, not even an empty jar.
      publish := {},
      publishLocal := {},
      publishArtifact := false,
      Keys.`package` := file("")
    )

lazy val demo =
  project
    .in(file("demo"))
    .enablePlugins(ScalaJSPlugin)
    .settings(commonSettings: _*)
    .settings(
      test := {},
      Compile / fastLinkJS / scalaJSLinkerConfig ~= { _.withSourceMap(false) },
      Compile / fullLinkJS / scalaJSLinkerConfig ~= { _.withSourceMap(false) },
      scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
      Compile / fastLinkJS / scalaJSLinkerConfig ~= (_.withModuleSplitStyle(ModuleSplitStyle.SmallestModules)),
      Compile / fullLinkJS / scalaJSLinkerConfig ~= (_.withModuleSplitStyle(ModuleSplitStyle.FewestModules)),
      publish / skip := true,
      // // NPM libs for development, mostly to let webpack do its magic
      // npmDevDependencies in Compile ++= Seq(
      //   "postcss-loader"                     -> "3.0.0",
      //   "autoprefixer"                       -> "9.7.6",
      //   "url-loader"                         -> "4.1.0",
      //   "file-loader"                        -> "6.0.0",
      //   "css-loader"                         -> "3.5.3",
      //   "style-loader"                       -> "1.2.1",
      //   "less"                               -> "3.11.1",
      //   "less-loader"                        -> "6.1.0",
      //   "webpack-merge"                      -> "4.2.2",
      //   "mini-css-extract-plugin"            -> "0.9.0",
      //   "webpack-dev-server-status-bar"      -> "1.1.2",
      //   "cssnano"                            -> "4.1.10",
      //   "uglifyjs-webpack-plugin"            -> "2.2.0",
      //   "html-webpack-plugin"                -> "4.3.0",
      //   "optimize-css-assets-webpack-plugin" -> "5.0.3",
      //   "favicons-webpack-plugin"            -> "3.0.1",
      //   "why-did-you-update"                 -> "1.0.8"
      // ),
      // npmDependencies in Compile ++= Seq(
      //   "react"                 -> reactJS,
      //   "react-dom"             -> reactJS,
      //   "fomantic-ui-less"      -> FUILess,
      //   "create-react-context"  -> "0.3.0",
      //   "prop-types"            -> "15.7.2",
      //   "react-semantic-toasts" -> Toasts
      // ),
      // don't publish the demo
      publish := {},
      publishLocal := {},
      publishArtifact := false,
      Keys.`package` := file("")
    )
    .dependsOn(facade)

lazy val facade =
  project
    .in(file("facade"))
    .enablePlugins(ScalaJSBundlerPlugin)
    .settings(commonSettings: _*)
    .settings(
      name := "react-semantic-ui",
      webpack / version := "4.44.1",
      startWebpackDevServer / version := "3.11.0",
      installJsdom / version := "16.4.0",
      // Requires the DOM for tests
      Test / requireJsDomEnv := true,
      // Compile tests to JS using fast-optimisation
      Test / scalaJSStage := FastOptStage,
      Compile / npmDependencies ++= Seq(
        "react"                 -> reactJS,
        "react-dom"             -> reactJS,
        "semantic-ui-react"     -> reactSUI,
        "react-semantic-toasts" -> Toasts,
        "chokidar"              -> "3.4.2"
      ),
      libraryDependencies ++= Seq(
        "com.github.japgolly.scalajs-react" %%% "core"      % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "extra"     % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "test"      % scalaJsReact % Test,
        "io.github.cquiroz.react"           %%% "common"    % "0.11.3",
        "org.scalameta"                     %%% "munit"     % "0.7.26"     % Test,
        "com.lihaoyi"                       %%% "utest"     % "0.7.9"      % Test,
        "org.typelevel"                     %%% "cats-core" % "2.6.0"      % Test
      ),
      Test / webpackConfigFile := Some(baseDirectory.value / "test.webpack.config.js"),
      testFrameworks += new TestFramework("utest.runner.Framework"),
      testFrameworks += new TestFramework("munit.Framework")
    )

lazy val commonSettings = Seq(
  scalaVersion := "2.13.5",
  organization := "io.github.cquiroz.react",
  sonatypeProfileName := "io.github.cquiroz",
  description := "scala.js facade for react-semanticui",
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
