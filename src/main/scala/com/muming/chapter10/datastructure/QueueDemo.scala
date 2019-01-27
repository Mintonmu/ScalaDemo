package com.muming.chapter10.datastructure

import scala.collection.mutable

object QueueDemo extends App {

	val q1 = mutable.Queue[Any](1, 2, 3)

	val list = List(5, 6, 7, 8)
	println(q1.front)
	q1 += 10
	q1 += list
	q1 ++= list

	q1.enqueue(100)
	val queueEle = q1.dequeue()
	println(q1.head)

	for (item <- q1.tails) {
		println(item)
	}
}
