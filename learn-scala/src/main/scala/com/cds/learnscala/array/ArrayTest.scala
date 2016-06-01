package com.cds.learnscala.array

import scala.collection.mutable.ArrayBuffer

object ArrayTest {

  def testArrayBuffer(): Unit = {
    val b = ArrayBuffer[Int]()
    b += 1
    b +=(2, 3, 4, 5)
    b ++= Array(6, 7)
    b.trimEnd(2)
    println(b)

    b.insert(2, 6)
    b.insert(2, 3, 4, 5)
    println(b)

    b.remove(1)
    println(b)

    println(b.sum)
  }

  def main(args: Array[String]) {
    testArrayBuffer()
  }

}
