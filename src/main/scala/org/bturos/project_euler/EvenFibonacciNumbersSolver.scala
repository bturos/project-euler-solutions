package org.bturos.project_euler

import scala.annotation.tailrec

class EvenFibonacciNumbersSolver {
  def findSumOfEvenNumbersLessThan(threshold: Long): Long = processNumber(2, 1, 2, threshold)

  @tailrec
  private def processNumber(prevNumber: Long, prevPrevNumber: Long, currentSum: Long, threshold: Long): Long = {
    if (prevNumber > threshold) currentSum
    else processNumber(prevNumber + prevPrevNumber, prevNumber, updateSumIfNeeded(currentSum, prevNumber + prevPrevNumber), threshold)
  }
  
  private def updateSumIfNeeded(currentSum: Long, newFibonacciNumber: Long): Long =
    if (isEven(newFibonacciNumber)) currentSum + newFibonacciNumber else currentSum

  private def isEven(number: Long) = number % 2 == 0
}
