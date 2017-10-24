package fizzbuzz

object FizzBuzz {
  def printIt(number: Int) : String = number match {
    case 15 => "FIZZBUZZ"
    case n if n % 3 == 0 => "FIZZ"
    case n if n % 5 == 0 => "BUZZ"
    case n => n.toString
  }

}
