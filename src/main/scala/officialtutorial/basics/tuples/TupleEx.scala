package officialtutorial.basics.tuples

object TupleEx extends App{
	val ingredient: (String, Int) = ("Sugar", 2)
	println(ingredient._1)
	println(ingredient._2)

	val (name, quantity) = ingredient
	println(name)
	println(quantity)

	val planets =
  List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
       ("Mars", 227.9), ("Jupiter", 778.3))
	planets.foreach({
		case ("Earth", distance) =>
			println(s"Our planet is $distance million kilometers from the sun.")
			case (p, d) => println(s"$p is $d million kilometers from the sun.")
	})
}
