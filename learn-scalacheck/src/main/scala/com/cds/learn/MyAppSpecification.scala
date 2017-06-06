package com.cds.learn

import org.scalacheck.Properties

/**
  * Created by chendongsheng5 on 2017/6/1.
  */
object MyAppSpecification extends Properties("MyApp") {
  include(StringSpecification)
}
