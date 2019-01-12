package com.muming.chapter04.myException

object ScalaExc {

  def main(args: Array[String]): Unit = {
    try {
      val r = 10 / 0
    } catch {
      case ex: ArithmeticException => {
        ex.printStackTrace()
      }
      case ex: Exception => println("捕获异常")
    }
    finally {
      println("finally")
    }
  }

}
