package org.bturos.project_euler.utils

import org.bturos.project_euler.BaseEulerProblemSolverSpec

class PrimeNumberValidatorSpec extends BaseEulerProblemSolverSpec {
  it should "Find prime numbers in specified range" in {
    // given
    val finder = new PrimeNumberValidator()

    // when
    val results: Map[Int, Boolean] = (1 to 20)
      .map(number => (number, finder.isPrimeNumber(number)))
      .toMap
    
    // then
    results(1) shouldBe true
    results(2) shouldBe false
    results(3) shouldBe true
    results(4) shouldBe false
    results(5) shouldBe true
    results(6) shouldBe false
    results(7) shouldBe true
    results(8) shouldBe false
    results(9) shouldBe false
    results(10) shouldBe false
    results(11) shouldBe true
    results(12) shouldBe false
    results(13) shouldBe true
    results(14) shouldBe false
    results(15) shouldBe false
    results(16) shouldBe false
    results(17) shouldBe true
    results(18) shouldBe false
    results(19) shouldBe true
    results(20) shouldBe false
  }
}
