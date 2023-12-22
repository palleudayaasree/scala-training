package com.demo

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

  //name function
  val decrement=(x:Int)=>x-1
  println(decrement(4))

  //closure function

  val name = "palle"

  def concatenate(lastName: String) = {

    val middleName = "usha"
    name + middleName + lastName
  }

  println(s"output: ${concatenate(lastName = "sree")}")



//nested function


def sum(x:Int, y:Int)= {

 def helper(z:Int):Int ={
   x+y+z
  }
 helper(6)+5.0
}
println(sum(2,4))


//pure function
def sum3(a:Double, b:Int) ={
a+b
}
  println(sum3(2.365478934,4))

}
}


