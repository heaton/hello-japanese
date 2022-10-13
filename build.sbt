ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "me.heaton"
ThisBuild / organizationName := "Heaton"

lazy val root = (project in file("."))
  .settings(
    name := "help-japanese",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
  )
