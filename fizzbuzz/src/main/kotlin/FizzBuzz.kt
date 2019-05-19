package io.github.jangalinski.playground.jqwik.fizzbuzz


fun fizzBuzz(number: Int) : String {
  val by3 = number % 3 == 0
  val by5 = number % 5 == 0

  return when {
    by3 && by5 -> "FizzBuzz"
    by5 -> "Buzz"
    by3 -> "Fizz"
    else -> "$number"
  }
}

fun main() {
  println("fizzBuzz(1)=${fizzBuzz(1)}")
}