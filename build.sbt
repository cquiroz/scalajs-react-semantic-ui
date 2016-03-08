enablePlugins(ScalaJSPlugin)

name := "scalajs-react-semantic-uid"

jsDependencies += RuntimeDOM

libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "0.10.4"
)

lazy val commonSettings = Seq(
  organization := "edu.gemini",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.7"
)

lazy val root = project.in(file("."))
    .aggregate(core, examples)
    .settings(commonSettings: _*)

lazy val core = project.in(file("core"))
    .settings(commonSettings: _*)
    .settings(
      libraryDependencies ++= Seq(
        "com.github.japgolly.scalajs-react" %%% "core" % "0.10.4")
    ).enablePlugins(ScalaJSPlugin)

lazy val examples = project.in(file("examples"))
    .settings(commonSettings: _*)
    .settings(
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.9.0",
        "com.github.japgolly.scalajs-react" %%% "core" % "0.10.4"),
      jsDependencies ++= Seq(
        "org.webjars.bower" % "react" % "0.14.7" / "react-with-addons.js" minified "react-with-addons.min.js" commonJSName "React",
        "org.webjars.bower" % "react" % "0.14.7" / "react-dom.js" minified "react-dom.min.js" dependsOn "react-with-addons.js" commonJSName "ReactDOM"
      ),
  //persistLauncher in Compile := true,
      skip in packageJSDependencies := false
).dependsOn(core).enablePlugins(ScalaJSPlugin)

workbenchSettings

bootSnippet := "ExampleApp().main();"

localUrl := ("127.0.0.1", 12345)

refreshBrowsers <<= refreshBrowsers.triggeredBy(fastOptJS in Compile)
