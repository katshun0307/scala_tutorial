package chapter1.tutorial10

import com.typesafe.scalalogging
import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging extends App with LazyLogging {
	logger.info("Hello World from Scala logging")
}
