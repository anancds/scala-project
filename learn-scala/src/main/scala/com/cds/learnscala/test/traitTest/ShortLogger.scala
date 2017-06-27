package com.cds.learnscala.test.traitTest

trait ShortLogger extends Logged {

  val maxLength = 15

  override def log(msg: String): Unit = {
    super.log(if (msg.length < maxLength) msg else msg.substring(0, maxLength - 3) + "...")

  }

}
