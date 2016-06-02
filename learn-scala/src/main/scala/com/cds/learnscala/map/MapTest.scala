package com.cds.learnscala.map

import java.util
import java.util.Calendar

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.{mutable, SortedMap}
import scala.io.Source
import scala.collection.JavaConversions.propertiesAsScalaMap

object MapTest {

  def testMap(): Unit = {
    val map = Map("book" -> 10, "gun" -> 18, "ipad" -> 1000)
    println(map)

    val map2 = for ((k, v) <- map) yield (k, v * 0.9)
    println(map2)

    for (v <- map.values)
      println(v)
  }

  /**
    * 正则表达式
    * \\d表示0-9的数字
    * \\s表示空格，回车，换行等空白字符
    * \\w表示单词字符(数字字母下划线)
    * +号表示一个或者多个的意思
    */
  def readFile(): Unit = {
    println(System.getProperty("user.dir"))
    val source = Source.fromFile("learn-scala/src/main/resources/myfile.txt").mkString
    val tokens = source.split("\\s+")
    val map = new mutable.HashMap[String, Int]
    for (key <- tokens) {
      map(key) = map.getOrElse(key, 0) + 1
    }

    println(map.mkString(","))
  }

  def readFile1(): Unit = {
    println(System.getProperty("user.dir"))
    val source = Source.fromFile("learn-scala/src/main/resources/myfile.txt").mkString
    val tokens = source.split("\\s+")
    var map = Map[String, Int]()
    for (key <- tokens) {
      map += (key -> (map.getOrElse(key, 0) + 1))
    }

    println(map.mkString(","))
  }

  def readFile2(): Unit = {
    println(System.getProperty("user.dir"))
    val source = Source.fromFile("learn-scala/src/main/resources/myfile.txt").mkString
    val tokens = source.split("\\s+")
    var map = SortedMap[String, Int]()
    for (key <- tokens) {
      map += (key -> (map.getOrElse(key, 0) + 1))
    }

    println(map.mkString(","))
  }

  def readFile3(): Unit = {
    println(System.getProperty("user.dir"))
    val source = Source.fromFile("learn-scala/src/main/resources/myfile.txt").mkString
    val tokens = source.split("\\s+")
    val map: util.TreeMap[String, Int] = new util.TreeMap[String, Int]
    for (key <- tokens) {
      map += (key -> (map.getOrElse(key, 0) + 1))
    }

    println(map.mkString(","))
  }

  def testLinkedHashMap(): Unit = {
    val map = new mutable.LinkedHashMap[String, Int]

    map += ("Monday" -> Calendar.MONDAY)
    map += ("Tuesday" -> Calendar.TUESDAY)
    map += ("Wednesday" -> Calendar.WEDNESDAY)
    map += ("Thursday" -> Calendar.THURSDAY)
    map += ("Friday" -> Calendar.FRIDAY)
    map += ("Saturday" -> Calendar.SATURDAY)
    map += ("Sunday" -> Calendar.SUNDAY)


    println(map.mkString(","))
  }

  def propertiesTest(): Unit = {
    val props: scala.collection.Map[String, String] = System.getProperties()

    val keys = props.keySet

    val keyLengths = for (key <- keys) yield key.length

    val maxKeyLength = keyLengths.max

    for (key <- keys) {
      print(key)
      print(" " * (maxKeyLength - key.length))
      print(" | ")
      println(props(key))
    }
  }

  def minMax(values: Array[Int]): Unit = {
    (values.max, values.min)
  }

  def iteqgt(values: Array[Int], v: Int): Unit = {
    (values.count(_ > v), values.count(_ == v), values.count(_ < v))
  }

  def main(args: Array[String]) {

    //    testMap()
    //    readFile()
    propertiesTest()
  }
}
