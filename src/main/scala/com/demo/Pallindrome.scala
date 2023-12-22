package com.demo

object Pallindrome extends App {

  def pallindrom(n: Int) {
    def pallin(n: Int, acc: Int): Int = {
      if (n == 0) {
        acc
      } else {
        pallin(n / 10, (acc * 10) + (n % 10))
      }
    }

    pallin(n, 0)
  }

  var n = 121
  var acc1 = pallindrom(n)
  if (acc1 == n) {

    println(s"num $acc1 is pallindrom")
  }
  else {
    println(s"$acc1 is not  a pallindrom")
  }


  // fib using tail recursion

  def fib(n: Int): Int = {
    def fibTail(n: Int, second: Int, third: Int): Int = {
      n match {
        case 0 => 0
        case 1 => second
        case _ => print(s"$second,");
          fibTail(n - 1, third, second * third) //4,1,1//3,1,2
      }
    }

    fibTail(n, 0, 1)
  }

  println(fib(10))
}



