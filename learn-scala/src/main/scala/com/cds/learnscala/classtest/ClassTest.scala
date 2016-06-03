package com.cds.learnscala.classtest

object ClassTest {

  def testNetwork(): Unit = {
    val chatter = new Network
    val myFace = new Network
    val fred = chatter.join("Fred")
    println(fred)

  }

  def main(args: Array[String]) {

//    val cds = new People
//    cds.age = 30
//    println(cds.age)
//    println(cds.name)
//
//    val person = new People1("anancds", 43)
//    println(person.description)
    testNetwork()
  }
}
