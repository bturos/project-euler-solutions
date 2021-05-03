package org.bturos.project_euler

import org.bturos.project_euler.utils.PrimeNumberValidator

import scala.annotation.tailrec

class NthPrimeNumberSolver(primeNumberValidator: PrimeNumberValidator) {
  def findNthPrimeNumber(nth: Int): Long = {
    if (nth == 1) 2
    else findNextPrimeNumber(2, 1, nth)
  }

  @tailrec
  private def findNextPrimeNumber(currentNumber: Long, numberOfPrimesFound: Int, nth: Int): Long = {
    if (primeNumberValidator.isPrimeNumber(currentNumber))
      if (numberOfPrimesFound == nth - 1) currentNumber 
      else findNextPrimeNumber(currentNumber + 1, numberOfPrimesFound + 1, nth)
    else findNextPrimeNumber(currentNumber + 1, numberOfPrimesFound, nth)
  }
}
