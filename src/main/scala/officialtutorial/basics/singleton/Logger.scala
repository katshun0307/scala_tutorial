package officialtutorial.basics.singleton

object Logger {
	def info(message: String): Unit =
		println(s"INFO: $message")
}
