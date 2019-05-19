package io.github.jangalinski.playground.jqwik.fizzbuzz

import net.jqwik.api.*


class FizzBuzzTest {
  @Example
  fun `one is one`() = fizzBuzz(1) == "1"

  @Example
  fun `90 is FizzBuzz`() = fizzBuzz(90) == "FizzBuzz"

  @Property
  fun `every third element starts with Fizz`(@ForAll("divisibleBy3") number: Int) = fizzBuzz(number).startsWith("Fizz")

  @Provide
  fun divisibleBy3(): Arbitrary<Int> = Arbitraries.integers().between(1, 100).filter { i -> i!! % 3 == 0 }

  @Property
  fun `every fifth element ends with Buzz`(@ForAll("divisibleBy5") number: Int) = fizzBuzz(number).endsWith("Buzz")

  @Provide
  fun divisibleBy5(): Arbitrary<Int> = Arbitraries.integers().between(1, 100).filter { i -> i!! % 5 == 0 }

  @Property
  fun `every fifteenth element is FizzBuzz`(@ForAll("divisibleBy15") number: Int) = fizzBuzz(number) === "FizzBuzz"

  @Provide
  fun divisibleBy15(): Arbitrary<Int> = Arbitraries.integers().between(1, 100).filter { i -> i!! % 15 == 0 }


}