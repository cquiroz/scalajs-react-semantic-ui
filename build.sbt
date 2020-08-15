val reactJS      = "16.13.1"
val scalaJsReact = "1.7.5"
val FUILess      = "2.8.6"
val reactSUI     = "1.1.1"
val Toasts       = "0.6.5"

parallelExecution in (ThisBuild, Test) := false

cancelable in Global := true

resolvers in Global += Resolver.sonatypeRepo("public")

addCommandAlias(
  "restartWDS",
  "; demo/fastOptJS::stopWebpackDevServer; demo/fastOptJS::startWebpackDevServer; ~demo/fastOptJS"
)

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
    .enablePlugins(ScalaJSBundlerPlugin)
    .settings(commonSettings: _*)
    .settings(
      version in webpack := "4.43.0",
      version in startWebpackDevServer := "3.11.0",
      webpackConfigFile in fastOptJS := Some(
        baseDirectory.value / "webpack" / "dev.webpack.config.js"
      ),
      webpackConfigFile in fullOptJS := Some(
        baseDirectory.value / "webpack" / "prod.webpack.config.js"
      ),
      webpackMonitoredDirectories += (resourceDirectory in Compile).value,
      webpackResources := (baseDirectory.value / "webpack") * "*.js",
      includeFilter in webpackMonitoredFiles := "*",
      webpackExtraArgs := Seq("--progress"),
      // webpackExtraArgs                       := Seq("--progress", "--display", "verbose"),
      useYarn := true,
      webpackBundlingMode in fastOptJS := BundlingMode.LibraryOnly(),
      webpackBundlingMode in fullOptJS := BundlingMode.Application,
      test := {},
      scalaJSLinkerConfig in (Compile, fastOptJS) ~= { _.withSourceMap(false) },
      scalaJSLinkerConfig in (Compile, fullOptJS) ~= { _.withSourceMap(false) },
      // NPM libs for development, mostly to let webpack do its magic
      npmDevDependencies in Compile ++= Seq(
        "postcss-loader"                     -> "3.0.0",
        "autoprefixer"                       -> "9.7.6",
        "url-loader"                         -> "4.1.0",
        "file-loader"                        -> "6.0.0",
        "css-loader"                         -> "3.5.3",
        "style-loader"                       -> "1.2.1",
        "less"                               -> "3.11.1",
        "less-loader"                        -> "6.1.0",
        "webpack-merge"                      -> "4.2.2",
        "mini-css-extract-plugin"            -> "0.9.0",
        "webpack-dev-server-status-bar"      -> "1.1.2",
        "cssnano"                            -> "4.1.10",
        "uglifyjs-webpack-plugin"            -> "2.2.0",
        "html-webpack-plugin"                -> "4.3.0",
        "optimize-css-assets-webpack-plugin" -> "5.0.3",
        "favicons-webpack-plugin"            -> "3.0.1",
        "why-did-you-update"                 -> "1.0.8"
      ),
      npmDependencies in Compile ++= Seq(
        "react"                 -> reactJS,
        "react-dom"             -> reactJS,
        "fomantic-ui-less"      -> FUILess,
        "react-semantic-toasts" -> Toasts
      ),
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
      version in webpack := "4.43.0",
      version in startWebpackDevServer := "3.11.0",
      version in installJsdom := "16.2.2",
      // Requires the DOM for tests
      requireJsDomEnv in Test := true,
      // Remove the following when a new scalajs-bundler is released.
      // See https://github.com/scalacenter/scalajs-bundler/issues/332
      Test / jsEnv := new build.JSDOMNodeJSEnv(
        build.JSDOMNodeJSEnv.Config((Test / installJsdom).value)
      ),
      // Compile tests to JS using fast-optimisation
      // scalaJSStage in Test            := FastOptStage,
      npmDependencies in Compile ++= Seq(
        "react"                 -> reactJS,
        "react-dom"             -> reactJS,
        "semantic-ui-react"     -> reactSUI,
        "react-semantic-toasts" -> Toasts
      ),
      libraryDependencies ++= Seq(
        "com.github.japgolly.scalajs-react" %%% "core"      % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "extra"     % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "test"      % scalaJsReact % Test,
        "io.github.cquiroz.react"           %%% "common"    % "0.9.6",
        "com.lihaoyi"                       %%% "utest"     % "0.7.4"      % Test,
        "org.typelevel"                     %%% "cats-core" % "2.1.1"      % Test
      ),
      webpackConfigFile in Test := Some(baseDirectory.value / "test.webpack.config.js"),
      testFrameworks += new TestFramework("utest.runner.Framework")
    )

lazy val commonSettings = Seq(
  scalaVersion := "2.13.3",
  organization := "io.github.cquiroz.react",
  sonatypeProfileName := "io.github.cquiroz",
  description := "scala.js facade for react-semanticui",
  publishArtifact in Test := false,
  scalacOptions ~= (_.filterNot(
    Set(
      // By necessity facades will have unused params
      "-Wdead-code",
      "-Wunused:params",
      "-Wunused:explicits"
    )
  ))
)
