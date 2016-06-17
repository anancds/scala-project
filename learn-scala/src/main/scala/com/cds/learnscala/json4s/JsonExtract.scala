package com.cds.learnscala.json4s

object JsonExtract {
  def main(args: Array[String]): Unit = {
    import org.json4s._
    import org.json4s.jackson.JsonMethods._

    implicit val formats = DefaultFormats // Brings in default date formats etc.

    case class Child(name: String, age: Int, birthdate: Option[java.util.Date])
    case class Address(street: String, city: String)
    case class Person(name: String, address: Address, children: List[Child])

    val json = parse("""
         { "name": "joe",
           "address": {
             "street": "Bulevard",
             "city": "Helsinki"
           },
           "children": [
             {
               "name": "Mary",
               "age": 5,
               "birthdate": "2004-09-04T18:06:22Z"
             },
             {
               "name": "Mazy",
               "age": 3
             }
           ]
         } """)

    println(json.extract[Person])
    val addressJson = json  \ "address"
    println(addressJson.extract[Address])

    println((json \ "children").extract[List[Child]])
    println("Hello, world!")
  }
}
