package officialtutorial.basics

object IdFactory {
	private var counter = 0

	def create(): Int = {
		counter += 1
		counter
	}
}

object ObjectEx extends App {
	val newId1 = IdFactory.create()
	val newId2 = IdFactory.create()
	println("the ids are " + newId1 + " and " + newId2)
}
