package com.cds.learn.suit

import org.scalatest._

/**
  * Created by chendongsheng5 on 2017/3/13.
  */
abstract class UnitSpec extends FunSuite with Matchers with
  OptionValues with Inside with Inspectors
