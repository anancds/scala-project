package com.cds.learnscala.apply

/**
  * Created by chendongsheng5 on 2017/6/16.
  */
class ApplyDemo {
  def apply() = "apply in class"
  def test{
    println("test")
  }
}

/**
  * 伴生对象，相当于类的静态方法
  */
object ApplyDemo {

  def stat{
    println("static method")
  }

  def apply() = new ApplyDemo

  var count = 0

  def incc = {
    count += 1
  }

}

object Main extends App{
  ApplyDemo.stat
  //类名后面加括号，相当于调用伴生对象的apply方法
  val a = ApplyDemo()
  a.test
  //对象加括号相当于调用对象的apply方法
  println(a())
  val b = ApplyDemo.apply()
  b.test
  println(a.apply())

  for(i <- 0 until 10){
    ApplyDemo.incc
  }

  println(ApplyDemo.count)
}
