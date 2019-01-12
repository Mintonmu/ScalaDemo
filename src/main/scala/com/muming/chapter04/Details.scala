package com.muming.chapter04

object Details {

  //写了return关键字，编译器就不会使用自动推断
  def main(args: Array[String]): Unit = {

  }
  //如果写了return，返回值类型不能够省略

  def getSum(n1:Int,n2:Int): Int ={
    return n1+n2
  }

  //如果返回值里面什么都没写，即表示该函数无返回值
  //此时的return语句无效
  def getSum2(n1:Int,n2:Int){

    return n1+n2

  }
}
