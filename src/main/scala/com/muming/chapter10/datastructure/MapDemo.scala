package com.muming.chapter10.datastructure

import scala.collection.mutable

object MapDemo {

	def main(args: Array[String]): Unit = {

		val map1 = Map("Aile" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
		val list = map1.toList

		list.foreach(println)

		val map2 = mutable.Map("Alice" -> 20, "Bob" -> 30)
		map2.foreach(println)

		//对偶元组
		val map3 = mutable.Map[String, Int](("A", 1), ("B", 2))


		if (map1.contains("Aile")) {
			println(map1("Aile"))
		}
		else {
			throw new Exception
		}
		println(map2)
		println(map2.getOrElse("Ailce", 30))

		for ((k, v) <- map1) {

			println(k + "  " + v)
		}
	}


}
