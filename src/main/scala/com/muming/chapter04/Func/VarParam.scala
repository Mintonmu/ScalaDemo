package com.muming.chapter04.Func

object VarParam {

  def main(args: Array[String]): Unit = {

  }

  //可变参数
  def sum(n1: Int, args: Int*): Int = {
    println("len" + args.length)

    var sum = 0
    for (it <- args) {
      sum += it
    }
    sum
  }
}
