package com.cds.learnscala.partialfunction

/**
  * Created by chendongsheng5 on 2017/6/23.
  */
object App {

  def testCase(): Unit = {
    println(List(1, 2, 3) map { case i: Int => i + 1 })
    println(List(1, 2, 3) map { i: Int => i + 1 })


    /**
      * 在这个例子中：传递给map的case语句构建的是一个普通的匿名函数，在把这个函数适用于”seven”元素时发生了类型匹配错误。
      * 而对于collect,它声明接受的是一个偏函数：PartialFunction，传递的case语句能良好的工作说明这个case语句被编译器自动编译成
      * 了一个PartialFunction！这就是case语句“额外”的好处：case语句（组合）除了可以被编译为匿名函数
      * （类型是FunctionX，在Scala里，所有的函数字面量都是一个对象，这个对象的类型是FunctionX），
      * 还可以非常方便的编译为一个偏函数PartialFunction！（注意：PartialFunction同时是Function1的子类）
      * 编译器会根据调用处的函数类型声明自动帮我们判定如何编译这个case语句（组合）。
      */
    //    List(1, 3, 5, "seven") map { case i: Int => i + 1 }
    println(List(1, 3, 5, "seven") collect { case i: Int => i + 1 })
    assert(List(2, 4, 6) == (List(1, 3, 5, "seven") collect { case i: Int => i + 1 }))
  }

  /**
    * PartialFunction特质规定了两个要实现的方法：apply和isDefinedAt，isDefinedAt用来告知调用方这个偏函数接受参数的范围，
    * 可以是类型也可以是值，在我们这个例子中我们要求这个inc函数只处理Int型的数据。
    * apply方法用来描述对已接受的值如何处理，在我们这个例子中，我们只是简单的把值+1，注意，
    * 非Int型的值已被isDefinedAt方法过滤掉了，所以不用担心类型转换的问题。
    */
  def testPartialFun(): Unit = {
    val inc = new PartialFunction[Any, Int] {
      def apply(any: Any) = any.asInstanceOf[Int] + 1

      def isDefinedAt(any: Any) = if (any.isInstanceOf[Int]) true else false
    }

    val inc1: PartialFunction[Any, Int] = {
      case i: Int => i + 1
    }


    println(List(1, 3, 5, "seven") collect inc)
    println(List(1, 3, 5, "seven") collect inc1)
  }

  def main(args: Array[String]): Unit = {
    //    testCase()
    testPartialFun()
  }

}
