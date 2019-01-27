package com.muming.chapter10.datastructure

object JavaConverters extends App {

	import scala.collection.JavaConverters._

	val source = new scala.collection.mutable.ListBuffer[Int]
	val target: java.util.List[Int] = source.asJava
	val other: scala.collection.mutable.Buffer[Int] = target.asScala
	assert(source eq other)
	val vs = java.util.Arrays.asList("hi", "bye")
	val ss = asScalaIterator(vs.iterator).toList
	val s = asScalaBuffer(vs)
}
