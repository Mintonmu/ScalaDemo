package com.muming.chapter10.datastructure

import scala.collection.mutable.ListBuffer

object ListBufferDemo extends App {

	val listbuffer = ListBuffer[Any](1, 2, 3, 4, "hello")

	listbuffer.remove(1)

	for (item <- listbuffer) {

		println(item)
	}

	val lis1 = new ListBuffer[Int]

	lis1 += 1
	lis1.append(10)

	listbuffer ++= lis1
	println(listbuffer)

}
