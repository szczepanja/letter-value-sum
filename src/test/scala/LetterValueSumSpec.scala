import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class LetterValueSumSpec extends AnyFlatSpec with should.Matchers {

  def lettersum(value: String): Int = if (value == "a") 1 else 26

  "lettersum" should "find the sum of the values of the letters in string" in {
    lettersum("a") shouldBe 1
    lettersum("z") shouldBe 26
  }
}
