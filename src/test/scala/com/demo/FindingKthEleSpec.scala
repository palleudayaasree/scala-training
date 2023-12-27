package com.demo

import org.scalatest.funsuite.AnyFunSuite
import com.demo.FindingKthEle

class FindingKthEleSpec extends AnyFunSuite {

  test(testName = "checking the value is in the list is true") {
    val list = List(1,2,3,4)
    val check = 1
    assert(FindingKthEle.kthElem(list,check))
  }
  test(testName = "checking the value is not in the list is false") {
    val list1 = List(1,2,3,4)
    val check = 5
    assert(!FindingKthEle.kthElem(list1,check))
  }
  test(testName = "eleSum in the list"){
    assert((FindingKthEle.eleSum(List(1,2,3),0) === 6))
  }

}
