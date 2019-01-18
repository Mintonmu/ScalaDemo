package com.muming.chapter07.importdetails

import scala.beans.BeanProperty


object TestImport {


}


class User {

  @BeanProperty var name: String = ""

  def test2(): Unit = {
    import java.util.{HashMap => JAVAHashMap}

    import scala.collection.mutable._
    var map = new JAVAHashMap()
    var map1 = new HashMap[String, String]()
  }

}

class Dog {
  @BeanProperty var name: String = ""
}