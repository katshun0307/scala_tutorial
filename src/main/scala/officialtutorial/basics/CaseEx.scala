package officialtutorial.basics

case class PointObject(x: Int, y: Int)

object CaseEx extends App {
	val point = PointObject(1, 2)
	val anotherPoint = PointObject(3, 4)
	val yetAnotherPoint = PointObject(1, 2)

	println("point and yet another point are ")
	val hoge = if (point == yetAnotherPoint) {
		"the same"
	} else {
		"not the same"
	}
	println(hoge)
}
