package org.bturos.project_euler

import org.bturos.project_euler.utils.PalindromeFinder
import org.scalatest.prop.TableDrivenPropertyChecks

class LargestPalindromeProductSolverSpec extends BaseEulerProblemSolverSpec with TableDrivenPropertyChecks {
  private val largestProducts = Table[Int, Long](
    ("digits", "product"),
    (1, 9),
    (2, 9009),
    (3, 906609)
  )

  forAll(largestProducts) { (digits: Int, largestProduct: Long) =>
    it should s"properly find largest palindrome product of $digits digit numbers" in {
      // given
      val palindromeFinder = new PalindromeFinder
      val solver = new LargestPalindromeProductSolver(palindromeFinder)

      // when
      val result: Long = solver.findLargestPalindromeProductOfNDigitNumbers(digits)

      // then
      result shouldBe largestProduct
    }
  }
}
