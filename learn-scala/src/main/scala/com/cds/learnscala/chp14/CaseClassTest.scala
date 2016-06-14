package com.cds.learnscala.chp14

import scala.None

/**
  * 这里@_*的含义可以参考
  * http://stackoverflow.com/questions/6051302/what-does-colon-underscore-star-do-in-scala
  * http://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascriptions-in-scala
  */
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

  def sum(lst: List[Option[Int]]) = {
    lst.map(_.getOrElse(0)).sum
  }

  def sum1(lst: List[Option[Int]]) = {
    var result = 0
    lst.foreach {
      case Some(a) => result += a
      case None => result
    }
    result
  }

  def compose(f: Double => Option[Double], g: Double => Option[Double]) = {
    (x: Double) =>
      if (f(x) == None || g(x) == None) None
      else g(x)
  }

  import scala.math.sqrt

  def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None

  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None


  def main(args: Array[String]) {

    println(swap[String, Int](("1", 2)))

    println(swap1(Array("1", "2", "3", "4")).mkString(","))

    val x = List(Some(1), None, Some(2), None, Some(3))
    println(sum(x))
    println(sum1(x))

    val h = compose(f, g)
    println(h(2))
  }

}
