package com.cds.learnscala

import scala.io.StdIn
import scala.math._

object Main {

  def testPrint(): Unit = {
    println("Hello" (4))
    println("Hello".charAt(4))
    printf("Hello, %s!, You are %d years old!", "anancds\n", 43)
  }

  def testReadLine(): Unit = {
    val name = StdIn.readLine("Your name: ")
    print("Your age: ")
    val age = StdIn.readInt()
    printf("Hello, %s! Next year, your will be %d.\n", name, age + 1)
  }

  def testFor(): Unit = {
    val s = "Hello"
    var sum = 0
    for (i <- 0 until s.length) {
      sum += i
    }
    printf("the sum is : %d\n", sum)
  }

  def testFor2(): Unit = {
    for (i <- 1 to 3; j <- 1 to 3)
      print((10 * i + j) + " ")
    println()

    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 * i + j) + " ")

    println()

    for (i <- 1 to 3; from = 4-i; j <- from to 3 )
      print((10 * i + j) + " ")
  }

  def main(args: Array[String]): Unit = {
    //    testPrint()
    //    testReadLine()
    //    testFor()
    testFor2()
  }


}
