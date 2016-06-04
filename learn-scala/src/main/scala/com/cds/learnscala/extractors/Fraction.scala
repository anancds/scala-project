package com.cds.learnscala.extractors

class Fraction (n: Int, d: Int){

}

object Fraction {
  def apply(n: Int, d: Int): Fraction = new Fraction(n, d)

//  def unapply(arg: Fraction): Option[(Int, Int)] = {
//  }
}

