object AddMember {

  class Rational(n: Int, d: Int) {
    require(d != 0)
    private val g = gcd(n.abs, d.abs)
    val number = n / g
    val denom = d / g

    override def toString: String = number + "/" + denom

    def +(that: Rational): Rational = {
      new Rational(
        number * that.denom + that.number * denom,
        denom * that.denom
      )
    }

    def +(i: Int): Rational = {
      new Rational(
        number + i * denom,
        denom
      )
    }

    def this(n: Int) = this(n, 1)

    private def gcd(a: Int, b: Int): Int = {
      if (b == 0)
        a
      else
        gcd(b, a % b)
    }

    def lessThan(that: Rational): Boolean = {
      number * that.denom < that.number * denom
    }

    def max(that: Rational): Rational = {
      if (lessThan(that))
        that
      else
        this
    }
  }

  implicit def intToRational(x:Int) = new Rational(x)

  def main(args: Array[String]): Unit = {

//    val oneHalf = new Rational(10, 20)
//    val twoHalf = new Rational(20, 30)
//    val result = oneHalf + twoHalf


//    println(1 + oneHalf)

    val args = Array("chips")
    val firstArg = if (args.length>0) args(0) else ""
    firstArg match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")
    }

  }
}