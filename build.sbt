name := "Scala-Blockchain"

version := "0.1"

//scalaVersion := "2.11.6"
scalaVersion := "2.12.6"

//resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
libraryDependencies ++= Seq(
  "org.rudogma" %% "supertagged" % "1.4"
//  "org.consensusresearch" %% "scorex-basics_2.11" % "1.2.8",
//  "org.consensusresearch" %% "scorex-consensus_2.11" % "1.2.8",
//  "org.consensusresearch" %% "scorex-perma_2.11" % "1.2.+",
//  "org.consensusresearch" %% "scorex-transaction_2.11" % "1.2.8"

)