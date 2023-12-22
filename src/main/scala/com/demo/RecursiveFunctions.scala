package com.demo

object RecursiveFunctions extends App {

  //convert the fibonaaci series method in Tail Recursive

  def fib1(x: Int) = {

    def tailRec(x: Int, a: Int, b: Int): Int = {
      if (x <= 1) {
        a
      }
      else {
        print(s"$a,")
        tailRec(x - 1, b, a + b)
      }
    }

    tailRec(x, 0, 1)
  }

  println(fib1(6))


  // fibonaaci series

  def fib(x: Int): Int = {
    if (x <= 1) {
      1
    }
    else {
      fib(x - 1) + fib(x - 2)
    }
  }
  println(fib(7))


  // factorial of a number

  def fact(num: Int): Int = {
    if (num <= 1) {
      num
    }
    else {
      num * fact(num - 1)
    }
  }

  println(fact(6))

  //Tail Recursive using factorial

  def fact1(num1: Int): Int = {
    def helper(num1: Int, acc: Int): Int = {
      if (num1 <= 1) acc
      else
        helper(num1 - 1, acc * num1)
    }

    helper(num1, 1)
  }

  println(fact1(4))
}



