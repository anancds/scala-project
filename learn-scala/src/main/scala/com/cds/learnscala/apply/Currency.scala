package com.cds.learnscala.apply

class Currency(val value: Double, val unit: String) {

}

object Currency{

  def apply(value: Double, unit: String): Currency = new Currency(value, unit)

  def unapply(currency: Currency): Option[(Double, String)] = {
    if (currency == null){
      None
    }
    else{
      Some(currency.value, currency.unit)
    }
  }

  def main(args: Array[String]): Unit = {

    val currency = Currency(30.2, "EUR")

    currency match {
      case Currency(amount, "USD") => println("$" + amount)
      case _ => println("No match.")
    }
  }

}
