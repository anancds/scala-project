package com.cds.learnscala.collectionTest

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object CollectionLearn {

  def listTest(): Unit = {
    val digits = List(3, 2, 1)
    println(digits.head)
    println(digits.tail)
  }

  def sum(first: List[Int]): Int = {
    if (first == Nil) 0 else first.head + sum(first.tail)
  }

  def sum1(lst: List[Int]): Int =
    lst match {
      case Nil => 0
      case h :: t => h + sum1(t)
    }

  def main(args: Array[String]) {

    listTest()

    println(List(8, 5, 3).sum)

    val lst = new ListBuffer[Int]
    lst += 1
    lst += 2
    println(lst)

    val digits = mutable.Set(1, 7, 2, 9)
    println(digits contains 0)
    println(mutable.Set(3, 4) subsetOf digits)
    println(digits union mutable.Set(3, 4, 5))
  }

}
