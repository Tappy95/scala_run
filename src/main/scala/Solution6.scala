import scala.collection.mutable.ArrayBuffer

object Solution6 {
  def isValid(s: String): Boolean = {
    val parent_dic = Map(
      "(" -> ")",
      "[" -> "]",
      "{" -> "}",
      "_" -> "_"
    )
    var stack = ArrayBuffer("_")
    for (i <- s) {
      //      println(stack)
      if (parent_dic.contains(i.toString)) {
        stack += i.toString
      } else if (i.toString == parent_dic(stack.last)) {
          stack = stack.slice(0, stack.size-1)
      } else {
        return false
      }
    }
    stack.length == 1
  }

  def main(args: Array[String]): Unit = {
    println(isValid("()"))
  }
}