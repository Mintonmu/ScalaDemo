package com.muming.chapter10.datastructure

object IteratorDemo extends App {

	val list = List(1, 2, 3, 4)

	//	while (list.iterator.hasNext) {
	//		println(list.iterator.next())
	//	}
	for (item <- list.iterator) {

		println(item)
	}

	list.iterator.take(0)
}
