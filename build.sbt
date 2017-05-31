name := "scala-project"

version := "1.0"

scalaVersion := "2.11.8"
//libraryDependencies += "org.scala-lang" % "scala-library" % "2.12.0-M4"
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.6"
//libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalamock" % "scalamock-scalatest-support_2.11" % "3.5.0"
libraryDependencies += "org.json4s" % "json4s-jackson_2.11" % "3.3.0"
libraryDependencies += "org.scalacheck" % "scalacheck_2.11" % "1.13.5"
libraryDependencies ++= {
  val sprayV = "1.3.3"
  Seq(
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "io.spray" %% "spray-testkit" % sprayV % "test"
  )
}
