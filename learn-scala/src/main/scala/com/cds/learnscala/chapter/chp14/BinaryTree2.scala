package com.cds.learnscala.chapter.chp14

sealed abstract class BinaryTree2

case class Leaf2(value: Int) extends BinaryTree2

case class Node2(op: Char, leafs: BinaryTree2*) extends BinaryTree2

object App2 {

  def eval(tree: BinaryTree2): Int = {
    tree match {
      case Node2(op, leafs@_*) => op match {
        case '+' => leafs.map(eval _).sum
        case '-' => -leafs.map(eval _).sum
        case '*' => leafs.map(eval _).product
      }
      case Leaf2(x) => x
    }
  }

  def main(args: Array[String]) {
    val x = Node2('+', Node2('*', Leaf2(3), Leaf2(8)), Leaf2(2), Node2('-', Leaf2(5)))
    println(x)
    println(eval(x))
  }
}
