name := "accountcenter"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.36",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0-M1",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.slick" %% "slick" % "3.2.0-M1",
  //  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "net.codingwell" %% "scala-guice" % "4.0.1"
)

libraryDependencies += "com.zeroc" % "ice" % "3.6.2"
libraryDependencies += "com.lawsofnature.member" % "memberclient_2.11" % "1.0-SNAPSHOT"
// https://mvnrepository.com/artifact/com.typesafe.slick/slick-codegen_2.11
libraryDependencies += "com.typesafe.slick" % "slick-codegen_2.11" % "3.2.0-M1" % "test"
// https://mvnrepository.com/artifact/com.typesafe/config
libraryDependencies += "com.typesafe" % "config" % "1.3.1"
libraryDependencies += "com.lawsofnature.common" % "common-rabbitmq_2.12.0-RC2" % "1.0"
// https://mvnrepository.com/artifact/org.springframework.security/spring-security-crypto
libraryDependencies += "org.springframework.security" % "spring-security-crypto" % "4.2.0.RELEASE"

libraryDependencies += "com.lawsofnature.common" % "common-mysql_2.11" % "1.0"