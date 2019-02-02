package com.muming.chapter10.datastructure

object ScanDemo extends App {

	val a = (1 to 5).scanLeft(5)(minus)
	val b = (1 to 5).scanRight(5)(minus)
	println(a)
	println(b)
	//Vector(5    , 4, 2, -1, -5, -10)
	//Vector(-2, 3, -1, 4, 0,       5)

	def minus(num1: Int, num2: Int) = {
		num1 - num2
	}
}
