package com.cds.learnscala.chapter.chap17

class Pair[T, S](val t: T, val s: S) {
  def swap() = new Pair(s, t)
}
