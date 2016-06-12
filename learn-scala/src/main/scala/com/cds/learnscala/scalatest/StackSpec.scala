package com.cds.learnscala.scalatest

import scala.collection.mutable

class StackSpec extends UnitSpec {
  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
    val a = 5
    val b = 3
    assertResult(2) {
      a - b
    }
    val someValue: Option[String] = Some("I am wrapped in something")
    someValue.get should be("I am wrapped in something")
    val left = 1
    //assert(left===2,"Execution was attempted " + left + " times instead of 1 time")
    info("OK")
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new mutable.Stack[String]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }

  }
}
