package com.cds.learnscala.extractors

object Number {

  def unapply(arg: String): Option[Int] = {
    try {
      Some(Integer.parseInt(arg.trim))
    } catch {
      case ex: NumberFormatException => None
    }
  }

}
