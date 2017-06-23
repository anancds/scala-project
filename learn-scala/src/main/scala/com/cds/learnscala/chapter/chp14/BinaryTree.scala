package com.cds.learnscala.chapter.chp14

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

object Application {

  def leafSum(tree: BinaryTree): Int = {

    tree match {
      case Node(a, b) => leafSum(a) + leafSum(b)
      case Leaf(v) => v
    }
  }

  def main(args: Array[String]) {

    val binaryTree = Node(Leaf(4), Node(Leaf(3), Leaf(6)))
    println(leafSum(binaryTree))
  }
}
