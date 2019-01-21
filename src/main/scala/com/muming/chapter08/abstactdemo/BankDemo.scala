package com.muming.chapter08.abstactdemo

//object BankDemo {
//
//  def main(args: Array[String]): Unit = {
//
//  }
//
//}

object BankDemo extends App {
  //当一类继承APP就不需要写main入口，底层使用反射,APP是一个特征（trait），里面有main方法

}


class Account(inAccount: String, inBalance: Double, inPwd: String) {
  private val accountNo = inAccount
  private val pwd = inPwd
  private var balance = inBalance

  def query(pwd: String): Unit = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }

    println("账号为" +
      this.accountNo + "当前的余额为" + this.balance)
  }

  def withDraw(pwd: String, money: Double): Any = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    if (this.balance < money) {
      println("余额不足")
      return
    }
    this.balance -= money
    money
  }
}
