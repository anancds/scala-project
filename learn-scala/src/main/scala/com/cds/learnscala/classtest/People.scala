package com.cds.learnscala.classtest

class People {
  var age = 0
  var name = "anancds"

  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }


}
