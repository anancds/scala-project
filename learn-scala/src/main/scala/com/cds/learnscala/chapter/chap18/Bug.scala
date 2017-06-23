package com.cds.learnscala.chapter.chap18

class Bug(var pos: Int = 0) {

  var forword: Int = 1

  def move(up: Int): this.type = {
    pos += forword * up
    this
  }

  def show(): this.type = {
    print(pos + " ")
    this
  }

  def turn(): this.type = {
    forword = -forword
    this
  }


}

object Test {
  def main(args: Array[String]) {
    val bugsy = new Bug()
    bugsy.move(4).show().move(6).show().turn().move(5).show()
  }
}
