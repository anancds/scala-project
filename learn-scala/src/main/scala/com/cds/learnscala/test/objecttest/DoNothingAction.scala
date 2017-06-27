package com.cds.learnscala.test.objecttest

object DoNothingAction extends UndoableAction("Do nothing"){


  override def undo(): Unit = {

    Array("jk")
  }

  override def redo(): Unit = {

  }

}
