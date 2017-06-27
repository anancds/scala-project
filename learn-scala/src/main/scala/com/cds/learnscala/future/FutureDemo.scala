package com.cds.learnscala.future

import java.util.concurrent.TimeUnit

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.util.Success

object FutureDemo {

  def main(args: Array[String]): Unit = {
    val f1 = Future {
      TimeUnit.SECONDS.sleep(1)
      "f1"
    }

    val f2 = Future {
      TimeUnit.SECONDS.sleep(2)
      "f2"
    }

    //    val f2 = Future {

    //      throw new RuntimeException("f2 exception")

    //    }


    val f3 = Future {
      TimeUnit.SECONDS.sleep(3)
      2342
    }


    val f4 = Future.sequence(Seq(f1, f2, f3))

    //    val f4: Future[(String, String, Int)] =

    //      for {

    //        r2 <- f2

    //        r3 <- f3

    //        r1 <- f1

    //      } yield (r1, r2, r3)


    val result = Await.result(f4, 4.seconds)
    println(result)


    val f =
      Future {
        "abc"
      }

    f onComplete {
      case Success(a) => println(a)
    }
  }

}
