import org.scalatest._
import flatspec._
import matchers._

class LetterValueSumSpec extends AnyFlatSpec with should.Matchers {

  import LetterValueSum._

  "letterSum" should "find the sum of the values of the letters in string" in {
    letterSum("") shouldBe 0
    letterSum("z") shouldBe 26
    letterSum("zzz") shouldBe 26 * 3
  }
}
