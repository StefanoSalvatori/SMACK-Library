package esempi

import cluster.MesosClusterBuilder
import smack.SmackEnvironment

object StartSmack extends App {
  override def main(args: Array[String]) = {
    val mesos = new MesosClusterBuilder()
      .setClusterName("Mesos-Cluster")
      .setMasters(List("138.68.96.19"))
      .setAgents(List("46.101.185.12", "46.101.208.135"))
      .setConnection("root", "private_key_openssh", "")
      .build()
    val smack = new SmackEnvironment(mesos,"CassandraCluster","KafkaCluster")
    smack.startCassandraDatabase(1, 2, 2048)
    //smack.startKafkaCluster("KafkaCluster",3, 2, 1024)
    //smack.startSparkFramework()
  }
}
