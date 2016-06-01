package com.cds.learnscala

import java.text.MessageFormat

import scala.io.StdIn

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

    for (i <- 1 to 3; from = 4 - i; j <- from to 3)
      print((10 * i + j) + " ")

    println()

    val a = for (i <- 1 to 10)
      yield i % 3

    println(a)
  }

  def decorate(str: String, left: String = "[", right: String = "]") = {
    println(left + str + right)
  }

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) {
      result += arg
    }
    println(result)
  }

  def recursiveSum(args: Int*): Int = {
    if (args.isEmpty) 0
    else {
      args.head + recursiveSum(args.tail: _*)
    }
  }

  def testMessageFormat(): Unit = {
    val str = MessageFormat
      .format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef])
    println(str)
  }

  def main(args: Array[String]): Unit = {
    //    testPrint()
    //    testReadLine()
    //    testFor()
    //    testFor2()
    //    decorate("abc")
    //    sum(2, 3, 4)
    //    sum(1 to 6: _*)
    //    recursiveSum(3, 4, 5, 6)

    testMessageFormat()
  }


}
