import akka.actor.{Actor, Props, ActorSystem}
import service.Flickr

object Main extends App {
  val system = ActorSystem("foto-fs-system")
  val fotoFS = system.actorOf(Props[FotoFS], name = "foto-fs")

  class FotoFS extends Actor {
    val filesystem = system.actorOf(Props[Filesystem], name = "filesystem")
    val flickr = system.actorOf(Props[Flickr], name = "flickr")

    override def receive: Receive = {
      case _ => {}
    }
  }
}