import sbt._

class MyProject(info: ProjectInfo)
  extends DefaultProject(info)
  with AkkaProject
  with IdeaProject { 
    val akkaStm = akkaModule("stm")
    val akkaTypedActor = akkaModule("typed-actor")
    val akkaRemote = akkaModule("remote")
    val akkaHttp = akkaModule("http")
    val akkaAmqp = akkaModule("amqp")
    val akkaCamel = akkaModule("camel")
    val akkaSpring = akkaModule("spring")
    val akkaJta = akkaModule("jta")
    val scalaToolsSnapshots = "Scala Tools Snapshots" at  "http://scala-tools.org/repo-snapshots/"
    val specs = "org.scala-tools.testing" % "specs_2.8.1" % "1.6.8-SNAPSHOT" % "test"
}
