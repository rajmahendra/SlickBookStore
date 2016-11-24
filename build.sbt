import sbt.Keys._

name := "SlickBookStore"
scalaVersion := "2.11.1"

lazy val baseSettings = Seq(
  organization := "in.rajmahendra",
  version := "1.0",
  scalaVersion := "2.11.1"
)

lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-Xcheckinit", "-encoding", "utf8", "-feature")
)

/*   WEB PROJECT SETTINGS START */
lazy val web = project.settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(
      "org.webjars" %% "webjars-play" % "2.3.0",
      "org.webjars" % "bootstrap" % "3.0.2",
      "org.asciidoctor" % "asciidoctorj" % "1.5.4",
      "org.webjars" % "holderjs" % "2.1.0"
    )
  ).enablePlugins(PlayScala)
  .enablePlugins(SbtTwirl)
  .dependsOn(slick)
/*   WEB PROJECT SETTINGS END */

/*   SLICK PROJECT SETTINGS START */
lazy val slick = project.settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(  "com.typesafe.play" %% "play-slick" % "1.1.0",
      "com.typesafe.play" %% "play-slick-evolutions" % "1.1.0")
  )
/*   SLICK PROJECT SETTINGS END */



scalacOptions ++= Seq("-Xcheckinit", "-encoding", "utf8", "-feature")

