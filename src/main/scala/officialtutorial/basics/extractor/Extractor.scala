package officialtutorial.basics.extractor

import scala.util.Random

object CustomerID {

	def apply(name: String): String = {
		s"$name--${Random.nextLong}"
	}

	def unapply(customerID: String): Option[String] = {
		val stringArray: Array[String] = customerID.split("--")
		if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
	}
}

object Extractor extends App {
	val customer1ID = CustomerID("Hoge")
	println(s"customer id is $customer1ID")
	println("name of customer is...")
	customer1ID match {
		case CustomerID(name) => println(name)
		case _ => println("Could not extract customerID")
	}
}
