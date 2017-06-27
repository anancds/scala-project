package com.cds.learnscala.test.objecttest

abstract class UndoableAction(val description: String) {

  def undo(): Unit = {

  }

  def redo (): Unit = {

  }

}
