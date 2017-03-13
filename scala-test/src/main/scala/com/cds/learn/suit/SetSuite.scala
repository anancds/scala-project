package com.cds.learn.suit

import org.scalatest.FunSuite

/**
  * Created by chendongsheng5 on 2017/3/13.
  */

class SetSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
