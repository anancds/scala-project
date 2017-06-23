package com.cds.learnscala.ordering

import scala.util.Sorting

/**
  * Created by chendongsheng5 on 2017/6/23.
  */

case class Person(name: String, age: Int) {
  override def toString = {
    "name: " + name + ", age: " + age
  }
}


object App {

  def testOrderingBYAndOn(): Unit = {
    val pairs = Array(("a", 5, 2), ("c", 3, 1), ("b", 1, 3))
    // sort by 2nd element
    Sorting.quickSort(pairs)(Ordering.by[(String, Int, Int), Int](_._2))
    println(pairs(0))
    println(pairs(1))
    println(pairs(2))

    // sort by the 3rd element, then 1st
    Sorting.quickSort(pairs)(Ordering[(Int, String)].on(x => (x._3, x._1)))
  }

  def testOrdered(): Unit = {

    //按name值逆词典序、age值升序做排序
    implicit object PersonOrdering extends Ordering[Person] {
      override def compare(p1: Person, p2: Person): Int = {
        p1.name == p2.name match {
          case false => -p1.name.compareTo(p2.name)
          case _ => p1.age - p2.age
        }
      }
    }

    val p1 = Person("rain", 13)
    val p2 = Person("rain", 14)
    //调用orderingToOrdered做隐式转换，这样才能用"<"符号
    import Ordered._
    p1 < p2 // True
    println(p1 < p2)
  }

  def testOrdering(): Unit = {
    val p1 = Person("rain", 24)
    val p2 = Person("rain", 22)
    val p3 = Person("Lily", 15)
    val list = List(p1, p2, p3)

    implicit object PersonOrdering extends Ordering[Person] {
      override def compare(p1: Person, p2: Person): Int = {
        p1.name == p2.name match {
          case false => -p1.name.compareTo(p2.name)
          case _ => p1.age - p2.age
        }
      }
    }
    println(list.sorted)


    println(list.sortWith { (p1: Person, p2: Person) =>
      p1.name == p2.name match {
        case false => -p1.name.compareTo(p2.name) < 0
        case _ => p1.age - p2.age < 0
      }
    })

    println(list.sortBy[Person](t => t))
  }

  def main(args: Array[String]): Unit = {
//    testOrderingBYAndOn()
//    testOrdered()
    testOrdering()
  }

}
