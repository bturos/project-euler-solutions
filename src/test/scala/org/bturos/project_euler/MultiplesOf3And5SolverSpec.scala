package org.bturos.project_euler

class MultiplesOf3And5SolverSpec extends BaseEulerProblemSolverSpec {
  it should "Sum of all the multiples of 3 or 5 below 10" in {
    // given
    val solver = new MultiplesOf3And5Solver()

    // when
    val result = solver.findSumOf3Or5MultiplesBelow(10)

    // then
    result shouldBe 23
  }

  it should "Sum of all the multiples of 3 or 5 below 1000" in {
    // given
    val solver = new MultiplesOf3And5Solver()

    // when
    val result = solver.findSumOf3Or5MultiplesBelow(1000)

    // then
    result shouldBe 233168
  }
}
