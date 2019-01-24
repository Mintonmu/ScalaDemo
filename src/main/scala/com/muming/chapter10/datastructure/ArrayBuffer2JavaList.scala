package com.muming.chapter10.datastructure

import scala.collection.mutable.ArrayBuffer


object ArrayBuffer2JavaList {

	def main(args: Array[String]): Unit = {

		import scala.collection.JavaConverters.bufferAsJavaList
		val arr = ArrayBuffer("1", "2", "3")

		val strings = bufferAsJavaList(arr)

		println(strings)
	}


}
