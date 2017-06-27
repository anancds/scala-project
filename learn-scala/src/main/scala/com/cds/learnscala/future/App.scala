package com.cds.learnscala.future

import scala.concurrent.{Await, Future, Promise}
import scala.util.{Failure, Success}
import concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object App {
  def main(args: Array[String]): Unit = {
    val taxCutF: Future[TaxCut] = Government.redeemCampaignPledge()
    println("Now that they're elected, let's see if they remember their promises...")

    Await.result(taxCutF, 4.seconds)
    taxCutF onComplete  {
      case Success(TaxCut(reduction)) => println(reduction)
      case Failure(ex) => println(ex.getMessage)
    }

  }

}
