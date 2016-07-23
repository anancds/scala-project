package com.cds.typelessdomore

object partialFunTest {

  //只匹配字符串的偏函数
  val pf1: PartialFunction[Any, String] = {
    case s: String => "YES"
  }

  //只匹配Double的偏函数
  val pf2: PartialFunction[Any, String] = {
    case d: Double => "YES"
  }

  //匹配字符串或者Double
  val pf = pf1 orElse pf2


  def tryPF(x: Any, f: PartialFunction[Any, String]): String =
    try {
      f(x).toString
    } catch {
      case _: MatchError => "ERROR!"
    }

  def d(x: Any, f: PartialFunction[Any, String]) =
    f.isDefinedAt(x).toString

  def main(args: Array[String]) {
    List("str", 3.14, 10) foreach { x =>
      printf("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s\n", x.toString,
        d(x, pf1), tryPF(x, pf1), d(x, pf2), tryPF(x, pf2), d(x, pf), tryPF(x, pf))
    }
  }

}
