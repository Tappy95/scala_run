object Solution4 {
  def romanToInt(s: String): Int = {
    val dic = Map("I" -> 1, "IV" -> 4, "V" -> 5, "IX" -> 9, "X" -> 10, "XL" -> 40, "L" -> 50, "XC" -> 90, "C" -> 100, "CD" -> 400, "D" -> 500, "CM" -> 900, "M" -> 1000)
    var a = 0
    val buffer = scala.collection.mutable.ArrayBuffer[Int]()
    val ss = s + "1"
    while (a < ss.length - 1) {
      val s_son = s.slice(a, a + 2)
      if (dic.contains(s_son)) {
        buffer += dic(s_son)
        println(s_son, dic(s_son))
        a += 2
      } else {
        buffer += dic(ss(a).toString)
        println(ss(a).toString, dic(ss(a).toString))
        a += 1
      }
    }
    buffer.sum
  }

  def main(args: Array[String]): Unit = {
    println(romanToInt("MCMXCIV"))
    //    val a = "asdfasdf"
    //    println(a.slice(0->1))
  }
}