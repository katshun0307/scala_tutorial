package officialtutorial.basics.traits

trait DefaultGreeter {
	def greet(name: String): Unit
}

class CustomizableGreeter(prefix: String, suffix: String) extends DefaultGreeter {
	override def greet(name: String): Unit = {
		println(prefix + name + suffix)
	}
}

// Traits become especially useful as generic types and with abstract methods.
trait Iterator[A] {
	def hasNext: Boolean

	def next(): A
}

class IntIterator(to: Int) extends Iterator[Int] {
	private var current = 0

	override def hasNext: Boolean = current < to

	override def next(): Int =
		if (hasNext) {
			val t = current
			current += 1
			t
		} else {
			0
		}
}

object TraitEx extends App {
	val greeter1 = new CustomizableGreeter("How are you, ", "?")
	greeter1.greet("Scala Developer")

	val iterator = new IntIterator(5)
	println(iterator.next())
	println(iterator.next())
}
