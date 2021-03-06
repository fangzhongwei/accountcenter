lazy val commonSettings = Seq(
  javacOptions ++= Seq("-encoding", "UTF-8"),
  organization := "com.jxjxgo.account",
  version := "1.0",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "net.codingwell" % "scala-guice_2.11" % "4.1.0",
    "org.scala-lang" % "scala-library" % "2.11.8",
    "com.jxjxgo.common" % "common-finagle-thrift_2.11" % "1.0"
  )
)

lazy val accountcommonlib = (project in file("accountcommonlib")).settings(commonSettings: _*).settings(
  name := """accountcommonlib""",
  libraryDependencies ++= Seq(
  )
)

lazy val accountserver = (project in file("accountserver")).settings(commonSettings: _*).settings(
  name := """accountserver""",
  mainClass in (Compile, run) := Some("com.jxjxgo.accountcenter.server.ApplicationServer"),
  libraryDependencies ++= Seq(
    "com.jxjxgo.common" % "common-db_2.11" % "1.0",
    "com.jxjxgo.common" % "common-error_2.11" % "1.0",
    "com.jxjxgo.common" % "common-utils_2.11" % "1.0",
    "com.jxjxgo.account" % "accountcommonlib_2.11" % "1.0"
  )
)
