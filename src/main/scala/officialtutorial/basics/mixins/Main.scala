package officialtutorial.basics.mixins

abstract class A{
	val message: String
}

class B extends A{
	override val message: String = "I am an instance of class B"
}

trait C extends A{
	def loudMessage = message.toUpperCase()
}

// class D has ...
// superclass B
// mixin C
class D extends B with C

object Main extends App {
	val d = new D()
	println(d.message)
	println(d.loudMessage)
}
