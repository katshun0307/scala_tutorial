package chapter1.tutorial06

object HelloWorldWithArguments extends App {
	println("Hello World from App with Arguments")

	println("The arguments for this app are")
	println(args.mkString(","))
}
