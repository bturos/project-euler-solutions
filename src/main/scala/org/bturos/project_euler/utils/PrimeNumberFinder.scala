package org.bturos.project_euler.utils

import scala.annotation.tailrec

class PrimeNumberFinder {
  def isPrimeNumber(number: Long): Boolean = {
    if (number % 2 == 0) false
    else testPrimeNumber(number, 1)
  }

  @tailrec
  private def testPrimeNumber(number: Long, divisor: Long): Boolean = {
    if (number == divisor) true
    else if (divisor != 1 && number % divisor == 0) false
    else testPrimeNumber(number, divisor + 2)
  }
}