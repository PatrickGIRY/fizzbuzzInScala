package fizzbuzz

object FizzBuzz {
  def printIt(number: Int) : String = number match {
    case 3 => "FIZZ"
    case _ => number.toString
  }

}
