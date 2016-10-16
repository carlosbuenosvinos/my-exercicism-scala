import scala.annotation.tailrec

object Hamming {
  def compute(s1: String, s2: String): Int = {
    if (s1.length != s2.length) throw new IllegalArgumentException
    
    @tailrec
    def go(l1: List[Char], l2: List[Char], acc: Int): Int = {
      if (l1.isEmpty) acc
      else go(l1.tail, l2.tail, acc + (if (l1.head == l2.head) 0 else 1))
    }
    
    go(s1.toList, s2.toList, 0)
  }
}
