package officialtutorial.basics.pattern_matching

import officialtutorial.basics.pattern_matching.Example.x

import scala.util.Random


object Example extends App {
	val x: Int = Random.nextInt(10)

	def match_test(x: Int): String = x match {
		case 0 => "zero"
		case 1 => "one"
		case 2 => "two"
		case _ => "other"
	}

	println(match_test(2))
	println(match_test(5))

}
