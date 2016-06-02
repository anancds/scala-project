package com.cds.learnscala.array

import java.awt.datatransfer.{SystemFlavorMap, DataFlavor}

import scala.collection.mutable.ArrayBuffer
import scala.math.random
import java.util.TimeZone._

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

  def reorderArray1(arr: Array[Int]): Array[Int] = {
    val t = arr.toBuffer
    val result = for (i <- arr.indices)
      yield if (i % 2 == 0 && i + 1 < t.length) {
        t(i + 1)
      } else if (i % 2 == 0 && i + 1 > t.length) {
        t(i)
      } else {
        t(i - 1)
      }

    result.toArray
  }

  def reorderAtrray2(arr: Array[Int]): Array[Int] = {
    val a = arr.filter(_ > 0)
    val b = arr.filter(_ <= 0)
    val c = a.toBuffer
    c ++= b
    c.toArray
    //    arr.filter(_ > 0) ++= arr.filter(_ <= 0)
  }

  def averageArray(arr: Array[Double]): Double = {
    arr.sum / arr.length
  }

  def reverseArray(arr: Array[Int]): Array[Int] = {
    arr.reverse
  }

  def distinctArray(arr: Array[Int]): Array[Int] = {
    arr.distinct
  }

  def timeZone(): Unit = {
    val t = for (i <- getAvailableIDs) yield
      getTimeZone(i).getDisplayName
    println(t.toBuffer)
  }

  def flavorMap(): Unit = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    println(flavors.getNativesForFlavor(DataFlavor.imageFlavor).toArray.toBuffer.mkString(" | "))
  }

  def main(args: Array[String]) {
    //    testArrayBuffer()
    //    println(randomArray(10).toBuffer)
    //    println(reorderAtrray2(Array(1, 2, 3, -2, 4, 5, -1, 0)).toBuffer)
    //    println(distinctArray(Array(1, 2, 3, 2, 1)).toBuffer)
    //    timeZone()
    flavorMap()
  }

}
