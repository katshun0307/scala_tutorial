package officialtutorial.basics.higherorder

case class WeeklyWeatherForecast(temperatures: Seq[Double]){
	private def convertCtoF(temp: Double) = temp * 1.8 + 32

	def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
}

object SalaryRaiser {
	def smallPromotion(salaries: List[Double]) =
		salaries.map(_ * 1.1)

	def greatPromotion (salaries: List[Double]) =
		salaries.map(s => s * math.log(s))

	def hugePromotion (salaries: List[Double]) =
		salaries.map(math.pow(_, 2))
}

object UrlBuilder {
	def buildURL(ssl: Boolean, domainName: String) : (String, String) => String = {
		val schema = if (ssl) "https" else "http"
		(endpoint: String, query: String) => s"$schema://$domainName/$endpoint?$query"
	}
}

object Main extends App {
	val salaries = Seq(20000, 70000, 50000)
	def doubleSalary: Int => Int = (x:Int) => 2 * x
	val newSalaries: Seq[Int] = salaries.map(doubleSalary)

	val subBuilder = UrlBuilder.buildURL(true, "example.com")
	println(subBuilder("index.html", "id=1"))
}
