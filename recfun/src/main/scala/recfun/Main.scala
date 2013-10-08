package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def checkBalance(chars: List[Char], numOpens: Int): Boolean = {
      if (chars.isEmpty) {
        isBalanced(numOpens)
      } else {
        val head = chars.head
        val n =
          if (head == '(') numOpens + 1
          else if (head == ')') numOpens - 1
          else numOpens
        if (n >= 0) checkBalance(chars.tail, n)
        else false
      }
    }

    def isBalanced(numOpens: Int) = numOpens == 0

    checkBalance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def count(capacity: Int, changes: List[Int]): Int = {
      if (capacity == 0)
        1
      else if (capacity < 0)
        0
      else if (changes.isEmpty && capacity >= 1)
        0
      else
        count(capacity, changes.tail) + count(capacity - changes.head, changes)
    }

    count(money, coins.sortWith(_.compareTo(_) < 0))
  }
}
