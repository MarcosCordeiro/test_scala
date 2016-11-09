object Demo {
   def main(args: Array[String]) {
      val foo =
      def isFoo(number: Int) = number % 3 == 0
      def isBar(number: Int) = number % 7 == 0
      def isFooBar(number: Int) = number % 21 == 0

      for (person <- List(alice, bob, charlie)) {
         person match {
            case Person("Alice", 25) => println("Hi Alice!")
            case Person("Bob", 32) => println("Hi Bob!")
            case Person(name, age) => println(
               "Age: " + age + " year, name: " + name + "?")
         }
      }
   }
   case class Foobar(number: Int, result: Int)
}

object IsEven {
    def main(args: Array[String]): Unit = {
        def isFoo(number: Int) = number % 3 == 0
        def isBar(number: Int) = number % 7 == 0
        def isFooBar(number: Int) = number % 21 == 0

        val n = args(0).toInt
        n match {
            case isFooBar(n) => println("foobar")
            case isBar(n) => println("bar")
            case isFoo(n) => println("foo")
            case _ => println(n)
        }
    }
}
