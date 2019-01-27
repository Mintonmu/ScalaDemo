package com.muming.chapter10.datastructure

object FoldDemo extends App {

	val list = List(1, 2, 3, 4)

	def minus(a: Int, b: Int) = {
		a - b
	}

	println(list.foldLeft(5)(minus)) //函数柯里化
	println(list.foldRight(5)(minus))

}
