package fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "number 1" should "print \"1\"" in {
    FizzBuzz.printIt(1) shouldEqual "1"
  }
}
