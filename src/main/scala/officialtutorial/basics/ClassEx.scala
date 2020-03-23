package officialtutorial.basics

class Point(var x: Int = 0, var y: Int = 0) {

	def move(dx: Int, dy: Int): Unit = {
		x += dx
		y += dy
	}

	override def toString: String =
		s"($x, $y)"
}

class PrivatePoint {
	private var _x = 0
	private var _y = 0
	private val bound = 100

	def x = _x

	def x_=(newValue: Int) = {
		if (newValue < bound) _x = newValue else printWarning
	}

	def y = _y

	def y_=(newValue: Int) {
		if (newValue < bound) _y = newValue else printWarning
	}

	private def printWarning = println("WARNING: out of bounds")
}

object ClassEx extends App {
	{
		val p1 = new Point(2, 3)
		println(p1.toString)
		val p2 = new Point(y = 2)
		println(p2.toString)
		p2.move(3, 4)
		println(p2.toString)
	}
	{
		val pp1 = new PrivatePoint()
		pp1.x = 99
		pp1.y = 101
		println("x is " + pp1.x + "and y = " + pp1.y)
	}
}
