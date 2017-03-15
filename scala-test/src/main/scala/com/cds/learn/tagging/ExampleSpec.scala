package com.cds.learn.tagging

import org.scalatest.FlatSpec
import org.scalatest.tagobjects.Slow

/**
  * Created by chendongsheng5 on 2017/3/14.
  */
class ExampleSpec extends FlatSpec {

  "The Scala language" must "add correctly" taggedAs(Slow) in {
    val sum = 1 + 1
    assert(sum === 2)
  }

  it must "subtract correctly" taggedAs(Slow, DbTest) in {
    val diff = 4 - 1
    assert(diff === 3)
  }
}
