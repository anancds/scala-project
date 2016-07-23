package com.cds.typelessdomore

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object futureTest {

  def sleep(millis: Long) = {
    Thread.sleep(millis)
  }

  def doWork(index: Int) = {
    sleep((math.random * 1000).toLong)
    index
  }

  def main(args: Array[String]) {
    (1 to 5) foreach { index =>
      val future = Future {
        doWork(index)
      }
      future onSuccess {
        case answer: Int => println(s"Success! returned: $answer")
      }
      future onFailure {
        case th: Throwable => println(s"FAILURE! returned: $th")
      }
    }

    sleep(1000) // Wait long enough for the "work" to finish.
    println("Finito!")
  }
}
