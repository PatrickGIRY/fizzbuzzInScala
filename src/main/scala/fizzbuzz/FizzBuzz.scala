package fizzbuzz

object FizzBuzz {
  def printIt(number: Int) : String = number match {
    case n if n % 3 == 0 => "FIZZ"
    case n => n.toString
  }

}
