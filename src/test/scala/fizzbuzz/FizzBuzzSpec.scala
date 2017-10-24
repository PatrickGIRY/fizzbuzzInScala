package fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "number 1" should "print \"1\"" in {
    FizzBuzz.printIt(1) shouldEqual "1"
  }
  "number 2" should "print \"2\"" in {
    FizzBuzz.printIt(2) shouldEqual "2"
  }
}
