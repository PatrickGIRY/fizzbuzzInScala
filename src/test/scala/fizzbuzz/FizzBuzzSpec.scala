package fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}
