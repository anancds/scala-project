package com.cds.learnscala.test.tryTest

import java.io.{FileNotFoundException, InputStream}
import java.net.{MalformedURLException, URL}

import scala.io.{Source, StdIn}
import scala.util.{Failure, Success, Try}

/**
  * http://udn.yyuap.com/doc/guides-to-scala-book/chp6-error-handling-with-try.html
  */
object TestTry {

  def parseURL(url: String) = {
    Try(new URL(url))
  }

  def inputStreamForURL(url: String): Try[InputStream] =
    parseURL(url).flatMap { u =>
      Try(u.openConnection()).flatMap(conn => Try(conn.getInputStream))
    }

  def parseHttpURL(url: String) = {
    parseURL(url).filter(_.getProtocol equals "http")
  }

  def getURLContent(url: String): Try[Iterator[String]] =
    for {
      url <- parseURL(url)
      connection <- Try(url.openConnection())
      is <- Try(connection.getInputStream)
      source = Source.fromInputStream(is)
    } yield source.getLines()

  def getURLContent1(url: String): Try[Iterator[String]] =
    for {
      url <- parseURL(url)
      source = Source.fromURL(url)
    } yield source.getLines()



  def main(args: Array[String]) {

    println(parseURL("http://www.baidu.com"))

    val url = parseURL(StdIn.readLine("URL: ")) getOrElse new URL("http://www.baidu.com")
    println(url)

    println(parseURL("http://danielwestheide.com").map(_.getProtocol))

    println(parseURL("garbage").map(_.getProtocol))

    parseHttpURL("http://danielwestheide.com").foreach(println)

    getURLContent("http://danielwestheide.com/foobar") match {
      case Success(lines) => lines.foreach(println)
      case Failure(ex) => println(s"Problem rendering URL content: ${ex.getMessage}")
    }

    val content = getURLContent("garbage") recover {
      case e: FileNotFoundException => Iterator("Requested page does not exist")
      case e: MalformedURLException => Iterator("Please make sure to enter a valid URL")
      case _ => Iterator("An unexpected error has occurred. We are so sorry!")
    }


  }
}
