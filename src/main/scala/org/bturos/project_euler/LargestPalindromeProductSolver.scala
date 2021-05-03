package org.bturos.project_euler

import org.bturos.project_euler.utils.PalindromeFinder

class LargestPalindromeProductSolver(palindromeFinder: PalindromeFinder) {
  def findLargestPalindromeProductOfNDigitNumbers(digits: Int): Long = {
    (for {
      range1 <- (Math.pow(10, digits).asInstanceOf[Long] - 1 to 1 by -1).toList
      range2 <- (Math.pow(10, digits).asInstanceOf[Long] - 1 to 1 by -1).toList
    } yield range1 * range2)
      .filter(product => palindromeFinder.isPalindrome(product.toString))
      .max
  }
}
