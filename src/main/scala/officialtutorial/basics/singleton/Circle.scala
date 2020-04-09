package officialtutorial.basics.singleton

import scala.math._

case class Circle(radius: Double){
	import Circle.calculateArea
	def area: Double = calculateArea(radius)
}

object Circle {
	private def calculateArea(radius: Double) =
		Pi * pow(radius, 2.0)
}

