package com.cds.learnscala.test.traitTest

import java.io.PrintStream

trait FileLogger extends Logged {
  val fileName: String
  lazy val out = new PrintStream(fileName)

  override def log(msg: String): Unit = {
    out.println(msg)
  }

}
