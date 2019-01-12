package com.muming.chapter04.LazyDemo

import org.junit.Test


object LazyDemo01 {

  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("==============")
    println("res " + res)

  }

  def sum(i: Int, i1: Int) = {
    i + i1
  }

}
