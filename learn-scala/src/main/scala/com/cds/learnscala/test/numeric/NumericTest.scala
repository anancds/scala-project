package com.cds.learnscala.test.numeric

import org.slf4j.{Logger, LoggerFactory}

import scala.collection.mutable.ArrayBuffer


object NumericTest {

  def OptionTest(option: Option[Long]) = {
    if (option.isEmpty) {
      None
    }
    option match {
      case None => None
      case Some(_) => None
    }
  }

  def testDoubleFload(): Unit = {
    val row = ArrayBuffer[Any]()
    row += 252.99
    row += 252.99f
    val test1 = row.toArray.asInstanceOf[Array[Object]]
    println(test1)
  }

  val Log = LoggerFactory.getLogger(NumericTest.getClass)

  def main(args: Array[String]): Unit = {

    OptionTest(None)
    val f = 252.99
    println(f.asInstanceOf[Object])

    println(f.toString.toFloat)
    //    println(f.toString.toInt)
    testDoubleFload()
    val test = null
    Log.info(test)
    println(test)

    val value: Integer = new Integer((100))
    println(value.asInstanceOf[Long])
    //    val value1 = value.asInstanceOf[Long]
    val value1 = value.asInstanceOf[Int]
    println(value1)
  }

}
