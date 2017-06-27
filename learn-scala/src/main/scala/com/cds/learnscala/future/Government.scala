package com.cds.learnscala.future

import java.util.concurrent.TimeUnit

import scala.concurrent.{Future, Promise}
import concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
case class LameExcuse(msg: String) extends Exception(msg)

case class TaxCut(reduction: Int)

object Government {
  def redeemCampaignPledge(): Future[TaxCut] = {
    val p = Promise[TaxCut]()
    Future {
      println("Starting the new legislative period.")
      TimeUnit.SECONDS.sleep(1)
//      p.failure(LameExcuse("global economy crisis"))
      p.success(TaxCut(20))
      println("We reduced the taxes! You must reelect us!!!!")
    }
    p.future
  }


}
