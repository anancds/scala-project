package com.cds.learnscala.test.funTest

import scala.math._

object FunctionTest {

  def test(): Unit = {
    val num = 3.14
    val fun = ceil _

    println(fun(num))

    println(Array(3.14, 1.42, 2.0).map(fun).toBuffer)

    println((1 to 9).filter(_ % 2 == 0))

    println((1 to 9).reduceLeft(_ * _))
    println((1 to 9).product)

    println("Mary has a little lamb".split(" ").sortWith(_.length > _.length).toBuffer)

  }

  def mulBy(factor: Double) = (x: Double) => factor * x

  def main(args: Array[String]) {

    test()

    val triple = mulBy(3)
    val half = mulBy(0.5)

    println(triple(14) + " " + half(14))

  }

}
