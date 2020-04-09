package officialtutorial.basics.singleton

import officialtutorial.basics.singleton.Logger.info

class Project(name: String, daysToComplete: Int)

class Test {
	val proj1 = new Project("OCaml", 4)
	val proj2 = new Project("Scala", daysToComplete = 43)
	info("Created Projects")
}


object SingletonEx extends App {
	val test = new Test()
	val scalaCenterEmail = Email.fromString("scala.center@epfl.ch")
	scalaCenterEmail match {
		case Some(email) => println(
			s"""Registered an email
				 | Username: ${email.username}
				 | Domain name: ${email.domainName}
				 |""".stripMargin
		)
		case None => println("Error: Could not parse email")
	}
}

