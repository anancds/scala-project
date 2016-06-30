package com.cds.learnscala.chap13

import scala.collection.immutable.SortedSet
import scala.collection.mutable

object Main {

  def mapStringIndex(str: String) = {

    var indexMap = new mutable.HashMap[Char, SortedSet[Int]]()
    var i = 0
    str.toCharArray.foreach {
      c => indexMap.get(c) match {
        case Some(result) => indexMap(c) = result + i
        case None => indexMap += (c -> SortedSet {
          i
        })
      }
        i += 1
    }
    indexMap
  }

  def removeZero(list: List[Int]) = {
    list.filter(_ != 0)
  }

  def filterMap(array: Array[String], map: Map[String, Int]): Array[Int] = {
    array.flatMap(map.get)
  }

  def divArr(arr: Array[Double], i: Int) = {

  }

  def main(args: Array[String]) {

    println(mapStringIndex("Mississippi"))

    println(removeZero(List(0, 0, 1)))

    println(filterMap(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5))
      .mkString(","))


    val lst = List(1, 2, 3, 4, 5)
    println((lst :\ List[Int]()) (_ :: _))
    println((List[Int]() /: lst) (_ :+ _))
    println((List[Int]() /: lst) ((a, b) => b :: a))

  }

}
