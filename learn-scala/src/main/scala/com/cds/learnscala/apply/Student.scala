package com.cds.learnscala.apply

/**
  * Created by chendongsheng5 on 2017/6/16.
  */
object Student {
  def unapply(str: String): Option[(String, String, String)] = {
    val parts = str.split(",")
    if (parts.length == 3) Some(parts(0), parts(1), parts(2)) else None
  }

  def main(args: Array[String]): Unit = {
    val Student(a1,a2,a3 ) = "a,b,c"
    println(a1)
    println(a2)
    println(a3)
  }
}
