package com.muming.chapter10.Test

object Test02 {

	/**
	  * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
	  * 存入一个MAP中并且同级一句话中各个字母出现的次数
	  *
	  **/

	def main(args: Array[String]): Unit = {
		val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
		val map = sentence.foldLeft(Map[Char, Int]())(charCount)
		map.foreach(println)
	}

	def charCount(map: Map[Char, Int], c: Char) = {
		map + (c -> (map.getOrElse(c, 0) + 1))
	}
}
