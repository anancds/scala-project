package com.cds.learnscala.chp14

object CaseClassTest {

  /**
    * 泛型函数
    */
  def swap[S, T](tup: (S, T)): (T, S) = {
    tup match {
      case (a, b) => (b, a)
    }
  }

  def swap1(array: Array[Any]) = {
    array match {
      case Array(first, second, rest@_*) => Array(second, first) ++ rest
      case _ => array
    }
  }


  def main(args: Array[String]) {

    println(swap[String, Int](("1", 2)))

    println(swap1(Array("1", "2", "3", "4")).mkString(","))
  }

}
