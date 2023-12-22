package com.demo

import org.scalatest.funsuite.AnyFunSuite
import com.demo.RecursiveFunctions

class RecursiveFunctionsSpec extends AnyFunSuite{

  test(testName = "checking fibonaaci number"){
    assert(RecursiveFunctions.fib(7) === 21)
  }

  test(testName ="checking factorial number"){
    assert(RecursiveFunctions.fact(6 ) === 720)
  }


}
