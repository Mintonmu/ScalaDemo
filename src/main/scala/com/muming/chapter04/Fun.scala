package com.muming.chapter04

object Fun {

  def main(args: Array[String]): Unit = {
    test(4)
    test2(4)
  }

  def test(n: Int) {
    if (n > 2) {
      test(n - 1)
    }
    println("n1=" + n)
  }

  def test2(n: Int) {
    if (n > 2) {
      test2(n - 1)
    } else
      println("n2=" + n)
  }

  def fib(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    }
    else fib(n - 1) + fib(n - 2)
  }

}
