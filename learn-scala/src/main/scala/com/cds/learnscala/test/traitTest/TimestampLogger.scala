package com.cds.learnscala.test.traitTest

trait TimestampLogger extends Logged {
  override def log(msg: String): Unit = {
    super.log(new java.util.Date() + " " + msg)
  }
}
