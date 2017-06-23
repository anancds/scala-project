package com.cds.learnscala.chapter.chp14

abstract class Item

case class Multiple(num: Int, item: Item) extends Item

case class Article(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, item: Item*) extends Item


object Main {

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Bundle(_, disc, its@_*) => its.map(price _).sum - disc
    case Multiple(n, item) => n * price(item)
  }

  def leafSum(list: List[Any]): Int = {

    var total = 0
    list.foreach {
      lst =>
        lst match {
          case l: List[Any] => total += leafSum(l)
          case i: Int => total += i
        }
    }
    total
  }


  def main(args: Array[String]) {
    val p = price(Multiple(10, Article("Blackwell Toster", 29.95)))
    println(p)
  }
}


