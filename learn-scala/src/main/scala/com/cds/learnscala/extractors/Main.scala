package com.cds.learnscala.extractors

import com.cds.learnscala.extractors.Fraction

object Main {

  def testcase(): Unit = {
    val test = Currency(29.22, "abc")

    test match {
      case Currency(29.23, "abc") => println("$" + 29.22)
      case _ => println("not match")
    }
  }

  case class Currency(value: Double, unit: String)

  def main(args: Array[String]) {
    testcase()
  }
}
