package com.muming.chapter10.datastructure

object HighOrderFunDemo extends App {

	test(sum, 3)

	def test(f: Double => Double, n: Double): Unit = {
		f(n)
	}

	def sum(d: Double) = {
		d + d
	}
}
