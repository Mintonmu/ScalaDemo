package com.muming.chapter10.datastructure

object ListDemo extends App {


	//list是不可变的，如果需要可变则应该使用listbuffer、
	//val List = scala.collection.immutable.List 包对象

	val list01 = List(1, 2, 3, "hello")


//	for (item <- list01) {
//
//		println(item)
//	}
//	println(list01)

	val list02 = Nil //空集合
	val list05 = 4 :: 2 :: 6 :: list02 :: Nil
	for (ite <- list05) {
		println(ite)
	}
	val list04 = 1 +: list01
//	println(list04)
}
