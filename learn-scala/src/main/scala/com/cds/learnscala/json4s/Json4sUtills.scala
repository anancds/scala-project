package com.cds.learnscala.json4s

import org.json4s.JsonDSL._
import org.json4s._
import org.json4s.jackson.JsonMethods._

case class field1(i: Int, s: String)

case class field2(s1: String, s2: String)

case class field3(i1: Int, i2: Int)

object Json4sUtills {

  var query: String = _
  var feature: List[Double] = _
  var rowCount: BigInt = _
  var offSet: BigInt = _


  def parseJson(str: String) = {

    val json = parse(str)

    val _query: List[String] = for (JObject(queries) <- json; JField("q", JString(q)) <- queries) yield q
    query = _query.headOption.orNull

    val _rowCount: List[BigInt] = for (JObject(queries) <- json; JField("rowCount", JInt(q)) <- queries) yield q
    rowCount = _rowCount.headOption.orNull

    val _offSet: List[BigInt] = for (JObject(queries) <- json; JField("offSet", JInt(q)) <- queries) yield q
    offSet = _offSet.headOption.orNull

    val _feature: List[List[JValue]] = for (JObject(queries) <- json; JField("feature", JArray
      (q)) <- queries) yield q
    val _featureTmp = _feature.headOption.orNull

    if (_featureTmp != null && _featureTmp.isInstanceOf[List[JDouble]]) {
      feature = for (JDouble(a) <- _featureTmp) yield a
    }
  }

  def renderJson() = {
    val json = ("name" -> "joe") ~ ("age" -> Some(35))
    compact(render(json))
  }

  def main(args: Array[String]) {
    parseJson(
      """
        |{
        |"feature": "1.2 12.3"
        |}
      """.stripMargin)

//    println( parseJson(
//      """
//        |{
//        |}
//      """.stripMargin))

    println(feature)


    renderJson()
  }

}
