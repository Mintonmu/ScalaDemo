package com.muming.chapter10.datastructure

import scala.collection.mutable

object MapDemo {

	def main(args: Array[String]): Unit = {

		val map1 = Map("Aile" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
		val list = map1.toList

		list.foreach(println)

		val map2 = mutable.Map("Alice" -> 20, "Bob" -> 30)
		map2.foreach(println)

		val map3 = mutable.Map[String, Int](("A", 1), ("B", 2))

	}

}
