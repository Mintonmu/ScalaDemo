package com.muming.chapter04.myException

object ThrowDemo {


  def main(args: Array[String]): Unit = {
    try {
      val res = test()
      println(res.toString)
    }
    catch {
      case ex: Exception => ex.printStackTrace()
    }
    finally {
      println("有异常出现")
    }
    println("ok") //这行ok并不会被执行，除非有try、catch捕获
  }

  def test(): Nothing = {
    throw new Exception("异常")
  }
}
