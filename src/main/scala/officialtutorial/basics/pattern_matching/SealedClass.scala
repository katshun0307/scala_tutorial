package officialtutorial.basics.pattern_matching

import sun.text.resources.cldr.ur.FormatData_ur_IN

// in an sealed class, all subtypes must be declared in the same file
sealed abstract class Furniture

case class Couch() extends Furniture
case class Chair() extends Furniture

object SealedClass {
	def findPlaceToSit(piece: Furniture): String = piece match {
		case a : Couch => "Sit on the couch"
		case _ : Chair => "Sit on the chair"
	}
}
