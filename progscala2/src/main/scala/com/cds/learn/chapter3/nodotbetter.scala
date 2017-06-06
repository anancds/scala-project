package com.cds.learn.chapter3

/**
  * Created by chendongsheng5 on 2017/6/5.
  */
object nodotbetter {

  def isEven(n: Int): Boolean = (n % 2) == 0

  def main(args: Array[String]): Unit = {
    List(1, 2, 3, 4) filter isEven foreach println
  }

}
