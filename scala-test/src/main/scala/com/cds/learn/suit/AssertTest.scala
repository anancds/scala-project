package com.cds.learn.suit

import java.util

/**
  * Created by chendongsheng5 on 2017/3/13.
  */
class AssertTest extends UnitSpec {

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

  test("Expected results") {
    //    fail("I've got a bad feeling about this")
    val a = 5
    val b = 2
    assertResult(3) {
      a - b
    }
    succeed
  }

  test("Expected exceptions") {
    val s = "hi"
    try {
      s.charAt(-1)
      fail()
    }
    catch {
      case _: IndexOutOfBoundsException =>
    }
  }

  test("Expected exceptions1") {
    val s = "hi"
    assertThrows[IndexOutOfBoundsException] {
      s.charAt(-1)
    }
  }

  test("Expected exceptions2") {
    val s = "hi"
    val caught = intercept[IndexOutOfBoundsException] {
      s.charAt(-1)
    }
    assert(caught.getMessage.indexOf("-1") != -1)
  }

  test("Checking that a snippet of code does or does not compile") {
    assertDoesNotCompile("val a: String = 1")
    assertTypeError("val a: String = 1")
    assertCompiles("val a: Int = 1")
  }

  test("assumptions") {
    assume(1 + 1 === 2)
    assert(1 + 1 === 2, "this is a clue")
    assertResult(3, "this is a clue") { 1 + 2 }
  }

}
