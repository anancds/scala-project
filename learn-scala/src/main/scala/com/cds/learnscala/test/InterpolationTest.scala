package com.cds.learnscala.test

/**
  * Created by chendongsheng5 on 2017/6/6.
  */
object InterpolationTest {

  def s_interpolation(): Unit = {
    val name = "anancds"
    println(s"Hello $name")
  }

  def f_interpolation(): Unit = {
    val height = 1.9d
    val name = "anancds"
    println(f"$name%s is $height%2.2f meters tall")
  }

  def raw_interpoation(): Unit = {
    println(raw"a\nb")
    println(s"a\nb")
  }

  def main(args: Array[String]): Unit = {
    s_interpolation()
    f_interpolation()
    raw_interpoation()
  }

}
