package com.cds.learnscala.objecttest

object TrafficLightColor extends Enumeration {

  val Red, Yellow, Green = Value

  val Red1 = Value(5, "stop")
  val Yellow1 = Value(10)
  val Green1 = Value("Go")

  def main(args: Array[String]) {
    println(TrafficLightColor.values)
    println(TrafficLightColor.Green)
    println(TrafficLightColor.Green.id)

    println(TrafficLightColor(0))
    println(TrafficLightColor.withName("Yellow"))


    println(TrafficLightColor.Red1)
  }

}
