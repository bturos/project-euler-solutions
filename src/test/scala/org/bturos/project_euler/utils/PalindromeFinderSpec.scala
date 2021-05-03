package org.bturos.project_euler.utils

import org.bturos.project_euler.BaseEulerProblemSolverSpec
import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor2}

class PalindromeFinderSpec extends BaseEulerProblemSolverSpec with TableDrivenPropertyChecks {
  private val possiblePalindroms: TableFor2[String, Boolean] = Table(
    ("number", "isPalindrome"),
    ("0", true),
    ("1", true),
    ("10", false),
    ("11", true),
    ("42", false),
    ("100", false),
    ("101", true),
    ("1053", false),
    ("5335", true),
    ("12345", false),
    ("30103", true)
  )

  forAll(possiblePalindroms) { (number: String, expectedDecision: Boolean) =>
    it should s"correctly classify a $number as (non)palindrome" in {
      // given
      val finder = new PalindromeFinder()

      // when
      val result = finder.isPalindrome(number)

      // then
      result shouldBe expectedDecision
    }
  }
}
