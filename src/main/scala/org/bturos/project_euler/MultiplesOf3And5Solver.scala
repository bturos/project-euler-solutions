package org.bturos.project_euler

import scala.annotation.tailrec

class MultiplesOf3And5Solver {
  def findSumOf3Or5MultiplesBelow(threshold: Long): Long = {
    processNumber(1, 0, threshold)
  }

  @tailrec
  private def processNumber(currentNumber: Long, currentSum: Long, threshold: Long): Long = {
    if (currentNumber > threshold - 1) currentSum
    else if (isMultipleOf3Or5(currentNumber))
      processNumber(currentNumber + 1, currentSum + currentNumber, threshold)
    else
      processNumber(currentNumber + 1, currentSum, threshold)
  }

  private def isMultipleOf3Or5(number: Long) = number % 3 == 0 || number % 5 == 0
}
