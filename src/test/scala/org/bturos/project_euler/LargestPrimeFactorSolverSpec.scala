package org.bturos.project_euler

import org.bturos.project_euler.utils.PrimeNumberValidator

class LargestPrimeFactorSolverSpec extends BaseEulerProblemSolverSpec {
  it should "Find the largest prime factor of 42" in {
    // given
    val primeNumberFinder = new PrimeNumberValidator()
    val solver = new LargestPrimeFactorSolver(primeNumberFinder)

    // when
    val result = solver.findLargestPrimeFactorOf(42)

    // then
    result shouldBe 7
  }

  it should "Find the largest prime factor of 600851475143" in {
    // given
    val primeNumberFinder = new PrimeNumberValidator()
    val solver = new LargestPrimeFactorSolver(primeNumberFinder)

    // when
    val result = solver.findLargestPrimeFactorOf(600851475143L)

    // then
    result shouldBe 7
  }
}
