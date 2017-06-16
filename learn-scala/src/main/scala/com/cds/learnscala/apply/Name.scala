package com.cds.learnscala.apply

/**
  * Created by chendongsheng5 on 2017/6/16.
  */
object Name {
  def unapplySeq(input: String): Option[Seq[String]]= {
    if (input == "") None else Some(input.trim.split("\\s+"))
  }

  def main(args: Array[String]): Unit = {
    val Name(a) = "abc"
    println(a)
  }
}
