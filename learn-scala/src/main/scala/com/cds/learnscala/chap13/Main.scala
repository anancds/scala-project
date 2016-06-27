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


  def main(args: Array[String]) {

    println(mapStringIndex("Mississippi"))
  }

}
