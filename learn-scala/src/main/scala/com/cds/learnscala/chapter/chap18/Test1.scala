package com.cds.learnscala.chapter.chap18

object show

//noinspection ScalaDeprecatedIdentifier
object then

object around

class Bug1(var pos: Int = 0) {
  var forword: Int = 1

  def move(num: Int): this.type = {
    pos += num
    this
  }

  //noinspection ScalaDeprecatedIdentifier
  def and(obj: then.type): this.type = this

  def and(obj: show.type): this.type = {
    print(pos + " ")
    this
  }

  def turn(obj: around.type): this.type = {
    pos = 0
    this
  }
}

//noinspection ScalaDeprecatedIdentifier
object Test1 {
  def main(args: Array[String]) {
    val bugsy = new Bug1
    bugsy move 4 and show and then move 6 and show turn around move 4 and show
  }
}
