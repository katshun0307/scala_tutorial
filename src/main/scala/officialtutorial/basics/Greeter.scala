package officialtutorial.basics

class Greeter(prefix: String, suffix: String){
	def greet(name: String): Unit ={
		println(prefix + name + suffix)
	}
}

object Greeter extends App {
	println("hello")
	val greeter_instance = new Greeter(prefix = "Hello, ", suffix = "!!!")
	greeter_instance.greet("Shuntaro")
}
