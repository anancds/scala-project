package com.cds.learnscala.patternmatch

object App {

  def test1(): Unit = {
    val o: Option[Int] = Some(2)
    //模式匹配，匹配some中的内容2
    o match {
      case Some(x) => println(x)
      case None =>
    }

    //如果要匹配整个some(2)，那么就需要@
    o match {
      case x@Some(_) => println(x)
      case None =>
    }
  }

  def test2(): Unit = {
    val d@(c@Some(a), Some(b)) = (Some(1), Some(2))
    println(d)
    println(c)
    println(a)
    println(b)

    val List(x, xs@_*) = List(1, 2, 3)
    println(x)
    println(xs)
  }

  def main(args: Array[String]): Unit = {
    //    test1()
    test2()
  }

}
