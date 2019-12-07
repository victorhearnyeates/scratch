package maths

import scala.annotation.tailrec

object PascalsTriangle {
  def triangle(row: Int): List[Int] = {
    @tailrec
    def loop(input: List[Int], acc: List[Int], count: Int): List[Int] = {
      if (count == 0) input
      else {
        input match {
          case h :: Nil => loop(0 :: h :: acc, Nil, count - 1)
          case h :: t => loop(t, h + t.head :: acc, count)
        }
      }
    }
    loop(List(1), Nil, row + 1).tail
  }


}
