package com.muming.chapter04.myException

object ThrowsComment {
  def main(args: Array[String]): Unit = {
    f1()
  }

  @throws(classOf[NumberFormatException])
  def f1() = {
    "abc".toInt
  }

}
