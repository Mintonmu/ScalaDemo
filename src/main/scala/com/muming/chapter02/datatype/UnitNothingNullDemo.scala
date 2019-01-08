package com.muming.chapter02.datatype

import com.muming.chapter01.vars.Dog

object UnitNothingNullDemo {
  private val dog: Dog = null

  def main(args: Array[String]): Unit = {
    val res = sayHello()
    var ss:Int = 1<<10
//    val char1: Char = null
    println(ss) //()
  }


  // unit只有一个实例是一个小括号
  def sayHello(): Unit = {

  }
}

class Cat {

}