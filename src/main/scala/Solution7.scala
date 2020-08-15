object Solution7 {
  class ListNode(_x:Int=0,_next:ListNode = null){
    var next:ListNode = _next
    var x: Int = _x
  }

  def mergeTwoLists(k1:ListNode, k2:ListNode): ListNode = {
    if (k1==null) return k2
    if (k2==null) return k1
    var newHead = new ListNode(-1)
    var newTail = newHead
    var head1 = k1
    var head2 = k2
    while (head1 != null && head2!=null) {
      if (head1.x < head2.x) {
        newTail.next = head1
        newTail = newTail.next
        head1 = head1.next
      }else {
        newTail.next = head2
        newTail = newTail.next
        head2 = head2.next
      }
    }
    if (head1 == null) {
      newTail.next == head2
    }else {
      newTail.next == head1
    }
    return newHead.next
  }

  def main(args: Array[String]): Unit = {
    var param1 = new ListNode()
//    println(mergeTwoLists(Array(1,2,5,6), Array(3,2,5,6)))
  }
}
