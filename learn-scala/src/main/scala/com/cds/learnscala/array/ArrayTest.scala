package com.cds.learnscala.array

import scala.collection.mutable.ArrayBuffer
import scala.math.random

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
    println(b.max)
    println(b.sorted)
    println(b.sortWith(_ > _))
    println(b.mkString(" and "))
    println(b.mkString("<", ",", ">"))
  }

  //以下是快学scala第三章的课后习题
  def randomArray(n: Int): Array[Int] = {
    val a = for (i <- 0 until n) yield (random * n).toInt
    a.toArray
  }

  def reorderArray(arr: Array[Int]): Array[Int] = {
    val t = arr.toBuffer
    for (i <- 0 until(arr.length, 2) if i + 1 < t.length) {
      val a = t(i)
      val b = t(i + 1)
      t.remove(i, 2)
      t.insert(i, b)
      t.insert(i + 1, a)

    }
    t.toArray
  }

  def main(args: Array[String]) {
    //    testArrayBuffer()


//    println(randomArray(10).toBuffer)
  }

}
