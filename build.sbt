name := "Software-Defined-Infrastructure"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "com.lihaoyi" %% "ujson" % "0.6.6"
//Uncomment to enable logging
//libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "org.jvnet.hudson" % "ganymed-ssh-2" % "build260"
libraryDependencies += "net.liftweb" %% "lift-json-ext" % "3.3.0"
libraryDependencies += "net.liftweb" %% "lift-json" % "3.3.0"
