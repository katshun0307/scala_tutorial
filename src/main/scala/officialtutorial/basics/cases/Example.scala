package officialtutorial.basics.cases

case class Book(isbn: String)

case class Message(sender: String, recipient: String, body: String)

object Example extends App {
	val frankenstein = Book("978-0486282114")
	val message = Message("guillaume@quebec.ca",
		"jorge@catalonia.es",
		"Ça va ?")
	println(message.sender)
	var same_message = message.copy(sender = "Shuntaro")
	println(s"message: $message, \nsame_message: $same_message")
}

