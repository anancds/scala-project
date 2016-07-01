package com.cds.learnscala.seqTest

object GivenNames {
  def unapplySeq(name: String): Option[Seq[String]] = {
    val names = name.trim.split(" ")
    if (names.forall(_.isEmpty)) None
    else Some(names)
  }
}
