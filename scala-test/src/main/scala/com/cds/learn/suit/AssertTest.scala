package com.cds.learn.suit

import java.util

/**
  * Created by chendongsheng5 on 2017/3/13.
  */
class AssertTest extends UnitSpec{

  test("the assert macro") {
    val left = 2
    val right = 1
    assert(left != right)
  }

  test("error message") {
    val list = new util.ArrayList[Int]()
    list.add(1)
    list.add(2)
    list.add(3)
    assert("hello".startsWith("h") && "goodbye".endsWith("e"))

  }

}
