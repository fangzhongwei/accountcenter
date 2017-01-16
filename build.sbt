lazy val commonSettings = Seq(
  javacOptions ++= Seq("-encoding", "UTF-8"),
  organization := "com.lawsofnature.account",
  version := "1.0",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "net.codingwell" % "scala-guice_2.11" % "4.1.0",
    "org.scala-lang" % "scala-library" % "2.11.8",
    "com.zeroc" % "ice" % "3.6.2"
  )
)

lazy val accountcommonlib = (project in file("accountcommonlib")).settings(commonSettings: _*).settings(
  name := """accountcommonlib""",
  libraryDependencies ++= Seq(
  )
)
lazy val accountclient = (project in file("accountclient")).settings(commonSettings: _*).settings(
  name := """accountclient""",
  libraryDependencies ++= Seq(
    "com.lawsofnature.common" % "common-ice_2.11" % "1.0",
    "com.lawsofnature.account" % "accountcommonlib_2.11" % "1.0"
  )
)

lazy val accountserver = (project in file("accountserver")).settings(commonSettings: _*).settings(
  name := """accountserver""",
  libraryDependencies ++= Seq(
    "com.lawsofnature.common" % "common-ice_2.11" % "1.0",
    "com.lawsofnature.common" % "common-mysql_2.11" % "1.0",
    "com.lawsofnature.account" % "accountcommonlib_2.11" % "1.0"
  )
)
