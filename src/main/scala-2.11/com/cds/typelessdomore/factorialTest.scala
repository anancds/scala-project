package com.cds.typelessdomore

object factorialTest {

  def factorial(i: Int): Long = {
    def fact(i: Int, accumulator: Long): Long = {
      if (i <= 1) accumulator
      else fact(i -1, i * accumulator)
    }
    fact(i, 1L)
  }

  def main(args: Array[String]) {

    println(factorial(5))

  }
}
