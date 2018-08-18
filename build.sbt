name := "stypes-spark"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0"

libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % sparkVersion
  , "org.apache.spark" %% "spark-sql" % sparkVersion
  , "junit" % "junit" % "4.10" % "test"
  , "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  , "ch.qos.logback" % "logback-classic" % "1.2.3"
)

