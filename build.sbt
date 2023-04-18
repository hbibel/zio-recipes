val scala3Version = "3.2.2"

val zioVersion = "2.0.13"

lazy val root = project
  .in(file("."))
  .settings(
    name         := "zio-recipes",
    version      := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"         % zioVersion,
      "dev.zio" %% "zio-streams" % zioVersion,
      "dev.zio" %% "zio-test"    % zioVersion % Test
    )
  )
