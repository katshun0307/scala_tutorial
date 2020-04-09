package officialtutorial.basics.pattern_matching

abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification

object MatchCase extends App {
	def show_notification(notification: Notification): String = {
		notification match {
			case Email(sender, title, _) =>
				"You got a message: %s from %s".format(title, sender)
			case SMS(number, message) =>
				"SMS from %s ... %s".format(number, message)
			case VoiceRecording(contactName, link) =>
				"You received a Voice Recording from %s! Click the link to hear it: %s".format(contactName, link)
		}
	}

	val someSms = SMS("12345", "Are you there?")
	val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
	println(show_notification(someSms))
	println(show_notification(someVoiceRecording))
	println("hoge fuga")
}