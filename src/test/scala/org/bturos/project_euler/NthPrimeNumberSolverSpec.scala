package org.bturos.project_euler

import org.bturos.project_euler.utils.PrimeNumberValidator
import org.scalatest.prop.TableDrivenPropertyChecks

class NthPrimeNumberSolverSpec extends BaseEulerProblemSolverSpec with TableDrivenPropertyChecks {
  private val primes = Table[Int, Long](
    ("order", "number"),
    (1, 2),
    (2, 3),
    (3, 5),
    (4, 7),
    (5, 11),
    (6, 13),
    (7, 17),
    (8, 19),
    (1000, 7919),
    (10001, 104743)
  )
  
  forAll (primes) { (order: Int, number: Long) =>
    it should s"find $order prime number with value of $number" in {
      // given
      val primeNumberValidator = new PrimeNumberValidator
      val solver = new NthPrimeNumberSolver(primeNumberValidator)

      // when
      val result = solver.findNthPrimeNumber(order)

      // then
      result shouldBe number
    }
  }
}
