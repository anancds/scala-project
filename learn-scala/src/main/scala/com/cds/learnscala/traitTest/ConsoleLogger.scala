package com.cds.learnscala.traitTest

trait ConsoleLogger extends Logged with Cloneable with Serializable {
  override def log(msg: String): Unit = println(msg)
}
