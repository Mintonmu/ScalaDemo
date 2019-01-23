package com.muming.chapter08.abstactdemo

object Enum extends Enumeration with App {

  // type MyInt = Int type用于取别名
  type Enum = Value
  val Spade = Value("黑桃")
  val Club = Value("草花")
  val Heart = Value("红心")
  val Diamond = Value("方片")

  override def toString(): String = Enum.values.mkString(",")

  def isRED(enum: Enum) = {
    enum == Heart || enum == Diamond
  }


}


