package com.cds.learn.matchers

import org.scalatest.{FlatSpec, FunSuite, Matchers}

/**
  * Created by chendongsheng5 on 2017/3/14.
  */
class ExampleSpec extends FunSuite with Matchers{

  test("Checking equality with matchers") {
    val res = 5
    res should equal(5)
    Array(1, 2) sameElements Array(1, 2)
    Array(1, 2) should equal (Array(1, 2))

    "hello" should have length 5
    "hello" should startWith ("he")
    "hello" should endWith ("lo")
    "hello" should include ("ell")

    5 should be < 7

  }


}
