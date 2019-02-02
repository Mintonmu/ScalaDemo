package com.muming.chapter10.Stream

object PerDemo01 {

	def main(args: Array[String]): Unit = {

		(1 to 5).foreach(println)
		println()

		//将不同得任务分配给CPU调度所以打印顺序不同,并行
		(1 to 5).par.foreach(println)

		val resualt1 = (0 to 100).map { case _ => Thread.currentThread.getName }.distinct
		val resualt2 = (0 to 100).par.map { case _ => Thread.currentThread.getName }.distinct
		println(resualt1)
		println(resualt2)
		//Vector(main)
		//ParVector(scala-execution-context-global-12, scala-execution-context-global-18, scala-execution-context-global-16, scala-execution-context-global-14, scala-execution-context-global-17, scala-execution-context-global-13, scala-execution-context-global-15, scala-execution-context-global-19)
	}


}
