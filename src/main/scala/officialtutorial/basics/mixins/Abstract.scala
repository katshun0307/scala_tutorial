package officialtutorial.basics.mixins

abstract class AbsIterator {
	type T

	def hasNext: Boolean

	def next(): T
}

class StringIterator(s: String) extends AbsIterator {
	type T = Char
	private var i = 0

	override def hasNext: Boolean = i < s.length

	override def next(): Char = {
		val ch = s charAt (i)
		i += 1
		ch
	}
}

trait RichIterator extends AbsIterator {
	def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}

class RichStringIterator extends StringIterator("scala") with RichIterator

object Abstract extends App {
	val richStringIterator =  new RichStringIterator
	println(richStringIterator.hasNext)
	richStringIterator.foreach(c => println(s"<<<<<<<$c>>>>>>>"))
}
