package com.muming.chapter10.datastructure

object ZipDemo01 extends App {

	val list = List(1, 2, 3)
	val list2 = List(4, 5, 6)
	val list3 = list.zip(list2) //List((1,4), (2,5), (3,6))
	println(list3)
}
