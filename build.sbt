val reactJS = "15.6.1"
val scalaJsReact = "1.1.1"
val SUI = "2.2.14"
val reactSUI = "0.78.3"

parallelExecution in (ThisBuild, Test) := false

cancelable in Global := true

lazy val semanticdbScalacSettings = Seq(
  addCompilerPlugin("org.scalameta" % "semanticdb-scalac" % "2.1.2" cross CrossVersion.full),
  scalacOptions ++= Seq(
    "-Yrangepos",
    "-Xplugin-require:semanticdb"
  )
)

addCommandAlias("restartWDS", "; demo/fastOptJS::stopWebpackDevServer; demo/fastOptJS::startWebpackDevServer")

val root =
  project.in(file("."))
    .settings(commonSettings: _*)
    .aggregate(facade, demo)
    .settings(
      name                 := "root",
      // No, SBT, we don't want any artifacts for root.
      // No, not even an empty jar.
      publish              := {},
      publishLocal         := {},
      publishArtifact      := false,
      Keys.`package`       := file(""))

lazy val demo =
  project.in(file("demo"))
    .enablePlugins(GitVersioning)
    .enablePlugins(GitBranchPrompt)
    .enablePlugins(ScalaJSBundlerPlugin)
    .settings(commonSettings: _*)
    .settings(
      version in webpack                     := "3.5.5",
      version in startWebpackDevServer       := "2.7.1",
      webpackConfigFile in fastOptJS         := Some(baseDirectory.value / "webpack" / "webpack-dev.config.js"),
      webpackConfigFile in fullOptJS         := Some(baseDirectory.value / "webpack" / "webpack-prod.config.js"),
      webpackMonitoredDirectories            += (resourceDirectory in Compile).value,
      webpackResources                       := (baseDirectory.value / "webpack") * "*.js",
      includeFilter in webpackMonitoredFiles := "*",
      webpackExtraArgs                       := Seq("--progress"),
      // webpackExtraArgs                       := Seq("--progress", "--display", "verbose"),
      useYarn                                := true,
      webpackBundlingMode in fastOptJS       := BundlingMode.LibraryOnly(),
      webpackBundlingMode in fullOptJS       := BundlingMode.Application,
      test                                   := {},
      emitSourceMaps                         := false,
      npmDevDependencies in Compile         ++= Seq(
        "compression-webpack-plugin" -> "1.0.0",
        "clean-webpack-plugin" -> "0.1.16",
        "css-loader" -> "0.28.9",
        "less" -> "2.3.1",
        "less-loader" -> "4.0.5",
        "extract-text-webpack-plugin" -> "3.0.2",
        "file-loader" -> "0.11.2",
        "html-webpack-plugin" -> "2.30.1",
        "copy-webpack-plugin" -> "4.4.1",
        "url-loader" -> "0.6.2",
        "style-loader" -> "0.18.2",
        "uglifyjs-webpack-plugin" -> "0.4.6",
        "webpack-merge" -> "4.1.0",
        "webpack-dev-server-status-bar" -> "1.0.0",
        "cssnano" -> "3.10.0",
        "optimize-css-assets-webpack-plugin" -> "3.2.0",
        "webpack-bundle-analyzer" -> "2.10.0",
        "duplicate-package-checker-webpack-plugin" -> "2.1.0"
      ),
      npmDependencies in Compile            ++= Seq(
        "react"           -> reactJS,
        "react-dom"       -> reactJS,
        "semantic-ui-less" -> SUI
      ),
      // don't publish the demo
      publish                                := {},
      publishLocal                           := {},
      publishArtifact                        := false,
      Keys.`package`                         := file("")
    )
    .dependsOn(facade)

lazy val facade =
  project.in(file("facade"))
    .enablePlugins(GitVersioning)
    .enablePlugins(GitBranchPrompt)
    .enablePlugins(ScalaJSBundlerPlugin)
    .settings(commonSettings: _*)
    .settings(
      name                            := "scalajs-react-semantic-ui",
      version in webpack                     := "3.5.5",
      version in startWebpackDevServer       := "2.7.1",
      // Requires the DOM for tests
      requiresDOM in Test             := true,
      // Compile tests to JS using fast-optimisation
      // scalaJSStage in Test            := FastOptStage,
      npmDependencies in Compile     ++= Seq(
        "react"             -> reactJS,
        "react-dom"         -> reactJS,
        "semantic-ui-react" -> reactSUI
      ),
      libraryDependencies            ++= Seq(
        "com.github.japgolly.scalajs-react" %%% "core"       % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "extra"      % scalaJsReact,
        "com.github.japgolly.scalajs-react" %%% "test"       % scalaJsReact % Test,
        "com.lihaoyi"                       %%% "utest"      % "0.6.0" % Test,
        "org.typelevel"                     %%% "cats-core"  % "1.0.1" % Test
      ),
      webpackConfigFile in Test       := Some(baseDirectory.value / "test.webpack.config.js"),
      testFrameworks                  += new TestFramework("utest.runner.Framework")
    )

lazy val commonSettings = Seq(
  scalaVersion            := "2.12.4",
  organization            := "io.github.cquiroz",
  description             := "scala.js facade for react-semanticui",
  homepage                := Some(url("https://github.com/cquiroz/scalajs-react-semantic-ui")),
  licenses                := Seq("BSD 3-Clause License" -> url("https://opensource.org/licenses/BSD-3-Clause")),
  useGpg                  := true,
  publishArtifact in Test := false,
  publishMavenStyle       := true,
  publishTo               := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
    },
  pomExtra                := pomData,
  pomIncludeRepository    := { _ => false },
  scalacOptions           := Seq(
      "-deprecation",                      // Emit warning and location for usages of deprecated APIs.
      "-encoding", "utf-8",                // Specify character encoding used by source files.
      "-explaintypes",                     // Explain type errors in more detail.
      "-feature",                          // Emit warning and location for usages of features that should be imported explicitly.
      "-language:existentials",            // Existential types (besides wildcard types) can be written and inferred
      "-language:experimental.macros",     // Allow macro definition (besides implementation and application)
      "-language:higherKinds",             // Allow higher-kinded types
      "-language:implicitConversions",     // Allow definition of implicit functions called views
      "-unchecked",                        // Enable additional warnings where generated code depends on assumptions.
      "-Xcheckinit",                       // Wrap field accessors to throw an exception on uninitialized access.
      "-Xfatal-warnings",                  // Fail the compilation if there are any warnings.
      "-Xfuture",                          // Turn on future language features.
      "-Xlint:adapted-args",               // Warn if an argument list is modified to match the receiver.
      "-Xlint:by-name-right-associative",  // By-name parameter of right associative operator.
      "-Xlint:constant",                   // Evaluation of a constant arithmetic expression results in an error.
      "-Xlint:delayedinit-select",         // Selecting member of DelayedInit.
      "-Xlint:doc-detached",               // A Scaladoc comment appears to be detached from its element.
      "-Xlint:inaccessible",               // Warn about inaccessible types in method signatures.
      "-Xlint:infer-any",                  // Warn when a type argument is inferred to be `Any`.
      "-Xlint:missing-interpolator",       // A string literal appears to be missing an interpolator id.
      "-Xlint:nullary-override",           // Warn when non-nullary `def f()' overrides nullary `def f'.
      "-Xlint:nullary-unit",               // Warn when nullary methods return Unit.
      "-Xlint:option-implicit",            // Option.apply used implicit view.
      "-Xlint:package-object-classes",     // Class or object defined in package object.
      "-Xlint:poly-implicit-overload",     // Parameterized overloaded implicit methods are not visible as view bounds.
      "-Xlint:private-shadow",             // A private field (or class parameter) shadows a superclass field.
      "-Xlint:stars-align",                // Pattern sequence wildcard must align with sequence component.
      "-Xlint:type-parameter-shadow",      // A local type parameter shadows a type already in scope.
      "-Xlint:unsound-match",              // Pattern match may not be typesafe.
      "-Yno-adapted-args",                 // Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver.
      "-Ypartial-unification",             // Enable partial unification in type constructor inference
      "-Ywarn-extra-implicit",             // Warn when more than one implicit parameter section is defined.
      "-Ywarn-inaccessible",               // Warn about inaccessible types in method signatures.
      "-Ywarn-infer-any",                  // Warn when a type argument is inferred to be `Any`.
      "-Ywarn-nullary-override",           // Warn when non-nullary `def f()' overrides nullary `def f'.
      "-Ywarn-nullary-unit",               // Warn when nullary methods return Unit.
      "-Ywarn-numeric-widen",              // Warn when numerics are widened.
      "-Ywarn-unused:implicits",           // Warn if an implicit parameter is unused.
      "-Ywarn-unused:imports",             // Warn if an import selector is not referenced.
      "-Ywarn-unused:locals",              // Warn if a local definition is unused.
      // "-Ywarn-unused:params",              // Warn if a value parameter is unused.
      "-Ywarn-unused:patvars",             // Warn if a variable bound in a pattern is unused.
      "-Ywarn-unused:privates",            // Warn if a private member is unused.
      "-Ywarn-value-discard",              // Warn when non-Unit expression results are unused.
      "-P:scalajs:sjsDefinedByDefault"
    ),
    // Settings to use git to define the version of the project
    git.useGitDescribe := true,
    git.formattedShaVersion := git.gitHeadCommit.value map { sha => s"v$sha" },
    git.uncommittedSignifier in ThisBuild := Some("UNCOMMITTED"),
    useGpg := true
  ) ++ semanticdbScalacSettings ++ scalafixSettings

lazy val pomData =
  <developers>
    <developer>
      <id>cquiroz</id>
      <name>Carlos Quiroz</name>
      <url>https://github.com/cquiroz</url>
      <roles>
        <role>Project Lead</role>
      </roles>
    </developer>
  </developers>
