package com.cds.learnscala.test.classtest

class People1(val name: String, val age: Int) {

  println("test")
  println("Just constructed another person")

  def description = name + " is " + age + " years old!"

}
