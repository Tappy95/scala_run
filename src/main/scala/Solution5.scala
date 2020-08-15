object Solution5 {

  import scala.util.control.Breaks._

  def longestCommonPrefix(strs: Array[String]): String = {
    println(strs.length)
    var prefix = ""
    if (strs.length != 0) {
      prefix = strs(0)
    }
    breakable {
      for (x <- strs) {
        prefix = lcp(str1 = prefix, str2 = x)
        if (prefix.length == 0) {
          break
        }
      }
    }
    prefix
  }

  def lcp(str1: String, str2: String): String = {
    val length = math.min(str1.length, str2.length)
    var index = 0
    while (index < length && str1(index) == str2(index)) {
      index += 1
    }
    println(str1.slice(0, index))
    str1.slice(0, index)
  }

  def main(args: Array[String]): Unit = {
    println(longestCommonPrefix(Array()))
  }
}