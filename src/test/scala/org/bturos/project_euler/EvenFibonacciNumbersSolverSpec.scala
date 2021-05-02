package org.bturos.project_euler

class EvenFibonacciNumbersSolverSpec extends BaseEulerProblemSolverSpec {
  
  it should "Find the sum of even Fibonacci numbers not bigger than 20" in {
    // given
    val solver = new EvenFibonacciNumbersSolver()

    // when
    val result = solver.findSumOfEvenNumbersLessThan(20)

    // then
    result shouldBe 10
  }

  it should "Find the sum of even Fibonacci numbers not bigger than 50" in {
    // given
    val solver = new EvenFibonacciNumbersSolver()

    // when
    val result = solver.findSumOfEvenNumbersLessThan(50)

    // then
    result shouldBe 44
  }

  it should "Find the sum of even Fibonacci numbers not bigger than 4M" in {
    // given
    val solver = new EvenFibonacciNumbersSolver()

    // when
    val result = solver.findSumOfEvenNumbersLessThan(4000000)

    // then
    result shouldBe 4613732
  }
}
