package com.muming.chapter10.Test

import scala.collection.mutable.ArrayBuffer

object Test01 {

	/**
	  * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
	  * 通过foldLeft存放到一个ArrayBuffer里面
	  *
	  **/
	def main(args: Array[String]): Unit = {
		val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
		val array = new ArrayBuffer[Char]()
		sentence.foldLeft(array)(putArray)
		array.foreach(println)
	}

	def putArray(arr: ArrayBuffer[Char], c: Char) = {

		arr += c
		arr

	}

}
