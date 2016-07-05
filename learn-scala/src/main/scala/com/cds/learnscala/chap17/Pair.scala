package com.cds.learnscala.chap17

class Pair[T, S](val t: T, val s: S) {
  def swap() = new Pair(s, t)
}
