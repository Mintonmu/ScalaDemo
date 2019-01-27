package com.muming.chapter10.datastructure

object OperatorOverload extends App {
	val cat = new Cat

	cat.age += 10


}

class Cat {
	var age: Int = _

	def +(n: Int): Unit = {
		this.age += n
	}
}
