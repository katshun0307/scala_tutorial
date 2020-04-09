package officialtutorial.basics.pattern_matching

abstract class Device

case class Phone(model: String) extends Device{
	def screenOff = "Turning Screen Off"
}

case class Computer(model: String) extends Device{
	def screenSaverOn = "Turning Screen Saver On"
}

object TypeOnlyMatching extends App {
	def goIdle(d: Device): String =
	d match {
		case p: Phone => p.screenOff
		case c: Computer => c.screenSaverOn
	}
	println(goIdle(Computer("Macbook")))
}
