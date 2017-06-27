package com.cds.learnscala.test

/**
  * Created by chendongsheng5 on 2017/6/6.
  */
object sysTest {

  def main(args: Array[String]): Unit = {
    println(sys.allThreads())
    println(sys.env)
    println(sys.props)
  }

}
