import akka.actor.{Actor, Props, ActorSystem}
import service.Flickr

object Main extends App {
  val system = ActorSystem("FotoFSSystem")
  val fotoFS = system.actorOf(Props[FotoFS], name = "FotoFS")

  class FotoFS extends Actor {
    val filesystem = system.actorOf(Props[Filesystem], name = "filesystem")
    val flickr = system.actorOf(Props[Flickr], name = "Flickr")

    override def receive: Receive = {
      case _ => {}
    }
  }
}