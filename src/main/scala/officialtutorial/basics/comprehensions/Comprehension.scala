package officialtutorial.basics.comprehensions

case class User(name: String, age: Int)

object Comprehension extends App {
	val userBase = List(User("Travis", 28),
		User("Kelly", 33),
		User("Jeniffer", 44),
		User("Dennis", 23))

	val twenties = for (user <- userBase if (user.age >= 20 && user.age < 30))
		yield user.name

	val everyone = for (user <- userBase) yield user.name

	twenties.foreach((name => println(name)))
	println("------")
	everyone.foreach(name => println(name))

	def foo(n: Int, v: Int) =
		for (i <- 0 until n; j <- 0 until n if i + j == v)
			yield (i, j)

	foo(5, 5).foreach({
		case (i, j) => println(s"($i, $j)")
	})
}
