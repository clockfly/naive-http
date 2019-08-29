name := "naive-http"

version := "104-clockfly"
organization := "com.github.clockfly"
scalaVersion := "2.12.6"
publishMavenStyle := true

libraryDependencies ++= Seq(
  "org.eclipse.jetty.orbit" % "javax.servlet" % "2.5.0.v201103041518" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
