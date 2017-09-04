package com.cds.learnscala.test.numeric

import org.slf4j.{Logger, LoggerFactory}


object NumericTest {
  val Log = LoggerFactory.getLogger(NumericTest.getClass)
  def main(args: Array[String]): Unit = {
    val f = 1.0f
    println(f.toString.toFloat)
//    println(f.toString.toInt)

    val test = null
    Log.info(test)
    println(test)

    val value: Integer = new Integer((100))
    println(value.asInstanceOf[Long])
    val value1 = value.asInstanceOf[Long]
    println(value1)
  }

}
