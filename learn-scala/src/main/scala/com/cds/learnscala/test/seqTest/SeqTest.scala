package com.cds.learnscala.test.seqTest

object SeqTest {

  def main(args: Array[String]) {
    val xs = 3 :: 6 :: 12 :: Nil
    val result = xs match {
      case List(a, b, _*) => a * b
      case List(a, b) => a * b
      case List(a, b, c) => a + b + c
      case _ => 0
    }

    println(result)
  }


}
