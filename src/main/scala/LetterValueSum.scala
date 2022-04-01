object LetterValueSum extends App {

  def letterSum(letters: String): Int = letters.map(_.toInt - 96).foldLeft(0)(_ + _)

}
