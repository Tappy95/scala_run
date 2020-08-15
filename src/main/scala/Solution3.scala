object Solution3 {
  def isPalindrome(x: Int): Boolean = {
    val t = x.toString
    return t == t.reverse
  }

  def main(args: Array[String]): Unit = {
    println(isPalindrome(232))
  }
}