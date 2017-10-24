package fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "number 1" should "print \"1\"" in {
    FizzBuzz.printIt(1) shouldEqual "1"
  }
  "number 2" should "print \"2\"" in {
    FizzBuzz.printIt(2) shouldEqual "2"
  }
  "number 3" should "print \"FIZZ\"" in {
    FizzBuzz.printIt(3) shouldEqual "FIZZ"
  }
  "number 6" should "print \"FIZZ\"" in {
    FizzBuzz.printIt(6) shouldEqual "FIZZ"
  }
  "number 5" should "print \"BUZZ\"" in {
    FizzBuzz.printIt(5) shouldEqual "BUZZ"
  }
  "number 10" should "print \"BUZZ\"" in {
    FizzBuzz.printIt(10) shouldEqual "BUZZ"
  }
  "number 15" should "print \"FIZZBUZZ\"" in {
    FizzBuzz.printIt(15) shouldEqual "FIZZBUZZ"
  }
}
