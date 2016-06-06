package com.cds.learnscala.funTest

import scala.math._

object FunctionTest {

  def test(): Unit = {
    val num = 3.14
    val fun = ceil _

    println(fun(num))

    println(Array(3.14, 1.42, 2.0).map(fun).toBuffer)
  }

  def main(args: Array[String]) {

    test()

  }

}
