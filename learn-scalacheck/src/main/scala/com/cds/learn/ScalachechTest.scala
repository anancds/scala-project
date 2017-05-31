package com.cds.learn

import org.scalacheck.Prop.forAll

/**
  * Created by chendongsheng5 on 2017/5/31.
  */
object ScalachechTest {

  def quickexample(): Unit = {
    val propConcatLists = forAll { (l1: List[Int], l2: List[Int]) =>
      l1.size + l2.size == (l1 ::: l2).size
    }
    propConcatLists.check

    val propSqrt = forAll { (n: Int) => scala.math.sqrt(n*n) == n }
    propSqrt.check

  }

  def main(args: Array[String]): Unit = {

    quickexample()
  }

}
