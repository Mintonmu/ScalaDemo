package com.muming.chapter02.datatype

object TypeDemo02 {

  def main(args: Array[String]): Unit = {
    var num = 1.2
    var num2 = 1.4f
    num2 = num.toFloat
  }

  def sayHello: Nothing = {
    // 异常中断就可以返回nothing，没有正常的返回值
    throw new Exception("异常")
  }
}
