package officialtutorial.basics.currying

object Example extends App {
	val numbers = List.range(0, 12)
	val res = numbers.foldLeft(0)((m, n) => m + n)
	println(res)
	val numberFunc = numbers.foldLeft(List[Int]()) _
	val squares = numberFunc((xs, x) => xs :+ x*x)
	val cubes = numberFunc((xs, x) => xs :+ x*x*x)
	println(s"squares: $squares,\ncubes: $cubes")
}
