name := "Scala-Blockchain"

version := "0.1"

//scalaVersion := "2.11.6"
scalaVersion := "2.12.6"



libraryDependencies ++= Seq(
  "org.rudogma" %% "supertagged" % "1.4",
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.scorexfoundation" %% "scrypto" % "2.1.2",
  "org.scorexfoundation" %% "iodb" % "0.3.2",
  "net.debasishg" %% "redisclient" % "3.7"

 )
//"org.scorexfoundation" % "iodb_2.12" % "0.4.0"

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

/*unmanagedBase := baseDirectory.value / "lib"
unmanagedJars in Compile += file(Path.userHome +"lib/scorex-basics_2.11-1.3.0-M1.jar")*/
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.4"