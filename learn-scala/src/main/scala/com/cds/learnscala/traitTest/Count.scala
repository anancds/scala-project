package com.cds.learnscala.traitTest

/**
  * 改变ShortLogger和TimestampLogger的位置会有不一样的效果，因为特质是从最后一个开始处理的
  * 并且super.log调用的不是根目录的log。
  * 而是特质层级中的下一个特质，具体哪一个，要根据特质添加的顺序来决定。
  */
class Count extends Logged with ConsoleLogger with ShortLogger with TimestampLogger {

  def printLog(msg: String): Unit = {
    println(log(msg))
  }

}
