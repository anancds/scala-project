package com.cds.learnscala.sealedTest

/**
  * sealed 关键字有两个作用：
  * 1、其修饰的trait，class只能在当前文件里面被继承；
  * 2、在检查模式匹配的时候，用sealed修饰目的是让scala知道这些case的所有情况，
  * scala就能够在编译的时候进行检查，看你写的代码是否有没有漏掉什么没case到，
  * 减少编程的错误。
  */
abstract sealed class People

object App {

  case object American extends People

  case object Japanese extends People

  case object Chinese extends People

  case object Russia extends People

  def people(p: People) = (p: @unchecked) match {
    case American ⇒ println("American person")
    case Japanese ⇒ println("Japanese person")
    case Chinese ⇒ println("Chinese person")
  }

  def main(args: Array[String]): Unit = {

    people(American)
    people(Russia)
  }
}

