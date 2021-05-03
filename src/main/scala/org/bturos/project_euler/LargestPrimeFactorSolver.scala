package org.bturos.project_euler

import org.bturos.project_euler.utils.PrimeNumberValidator

import scala.annotation.tailrec

class LargestPrimeFactorSolver(primeNumberFinder: PrimeNumberValidator) {
  def findLargestPrimeFactorOf(number: Long): Long = {
    divideByFactor(number, 2, List())
      .filter(primeNumberFinder.isPrimeNumber)
      .max
  }

  @tailrec
  private def divideByFactor(number: Long, factor: Long, factors: List[Long]): List[Long] = {
    if (number == 1) factors
    else if (number % factor == 0) divideByFactor(number / factor, factor, factor :: factors)
    else divideByFactor(number, findNextFactor(factor), factors)
  }

  private def findNextFactor(currentFactor: Long) = if (currentFactor == 2) 3 else currentFactor + 2
}
