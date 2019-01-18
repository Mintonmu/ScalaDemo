package com.muming.chapter01.vars

object VarDemo01 {
  def main(args: Array[String]): Unit = {

    args.map(_.toUpperCase()).foreach(println)
//    println("hello world")
  }
}
