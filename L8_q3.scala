object L8_q3 {

  def main(args: Array[String]): Unit = {
    object StringFormattingExample {
      def toUpper: String => String = _.toUpperCase

      def toLower: String => String = _.toLowerCase

      def formatNames(name: String)(formatFunction: String => String): String = {
        formatFunction(name)
      }

      def main(args: Array[String]): Unit = {
        val names = List("Benny", "Niroshan", "Saman", "Kumara")

        for (name <- names) {
          val formattedUpper = formatNames(name)(toUpper)
          val formattedLower = formatNames(name)(toLower)

          println(s"Original: $name")
          println(s"Formatted to Upper Case: $formattedUpper")
          println(s"Formatted to Lower Case: $formattedLower")
          println("=" * 20)
        }
      }
    }

  }

}
