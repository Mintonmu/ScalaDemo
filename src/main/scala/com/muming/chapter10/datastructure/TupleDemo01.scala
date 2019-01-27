package com.muming.chapter10.datastructure

object TupleDemo01 extends App {

	val tuple1 = (1, 2, 3, "hello", 4)

	val a: Int = 13
	val b: Double = 13
	for (i <- tuple1.productIterator) {

		println(i)
	}
}
