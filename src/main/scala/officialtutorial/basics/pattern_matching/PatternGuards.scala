package officialtutorial.basics.pattern_matching

import MatchCase.show_notification

object PatternGuards extends App {
	def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
		notification match {
			case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
				"You got an email from a VIP"
			case SMS(number, _) if importantPeopleInfo.contains(number) =>
				"You got a call from a VIP"
			case other =>
				show_notification(other)
		}
	}

	val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

	val someSms = SMS("123-4567", "Are you there?")
	val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
	val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
	val importantSms = SMS("867-5309", "I'm here! Where are you?")

	println(showImportantNotification(someSms, importantPeopleInfo)) //prints You got an SMS from 123-4567! Message: Are you there?
	println(showImportantNotification(someVoiceRecording, importantPeopleInfo)) //prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
	println(showImportantNotification(importantEmail, importantPeopleInfo)) //prints You got an email from special someone!

	println(showImportantNotification(importantSms, importantPeopleInfo))

}
