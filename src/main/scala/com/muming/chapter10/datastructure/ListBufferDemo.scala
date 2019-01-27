package com.muming.chapter10.datastructure

import scala.collection.mutable

object ListBufferDemo extends App {
	//
	//	val listbuffer = ListBuffer[Any](1, 2, 3, 4, "hello")
	//
	//	listbuffer.remove(1)
	//	val list = List(1, 2, 3, 4)
	//	lis1 = lis1.map(n => n << 1)
	//	for (item <- lis1) {
	//
	//		print(item + " ")
	//	}
	var lis1 = mutable.ListBuffer[Int](5, 2, 7)
	//print(lis1.reduce((x, y) => min(x, y)))
	println(lis1.reduce(_ min _))

}

class MyList {
	val list1 = List(3, 4, 5, 6)
	var list2 = List[Int]()

	def map(f: Any => Int): List[Int] = {
		for (item <- this.list1) {
			list2 = list2 :+ f(item)
		}
		list2
	}
}

object MyList {
	def apply(): MyList = new MyList()
}