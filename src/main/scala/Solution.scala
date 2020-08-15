object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for (i <- nums.indices) {
      for (j <- (i+1) until nums.length) {
        if (nums(i) + nums(j) == target) {
          return Array(i, j)
        }
      }
    }
    Array()
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(2,3,7)
    val result = twoSum(nums,9)
    println(result.toList)
  }
}