object Functions extends App {

  //print even or odd

  val num = 8

  def evenOdd(num: Int) = {
    if (num % 2 == 0) {
      println("number is even")
    } else {
      println("number is odd")
    }
  }

  println(s"${evenOdd(num)}")

  //print the table


  def tables(n: Int) {

    for (i <- 1 to 10) {

      println(s"$n*$i=${n * i}")
    }
  }

  tables(9)

  //print fibonaaci series

  def fibonacci(n: Int): Unit = {
    var a1: Int = 0
    var a2: Int = 1
    if (n < 1) {
      n
    } else {
      for (i <- 2 to 8) {
        var sum: Int = a1 + a2
        a1 = a2
        a2 = sum
        print(s"$sum,")
      }
    }
  }

  println(fibonacci(12))

  //Nested if else function

  def nested(num: Int)  = {

    if(num%2 == 0) {
      if (num == 2) {
        println("given number is 2")
      } else {
        println(s"given number is $num")
      }
      println("this is even")
    } else {
      if (num ==3) {
        println(s"given number is 3")
      } else {
        println(s"given number is $num")
      }
      println("this is odd")
    }

      }
  println(nested(3))

  //mod and divisible

  println(s"%output => ${10%3}")
  println(s"/output => ${9/3}")

//ledger

def ledger(num: Int): Unit ={

  if(num%2 == 0) {
    println("number is divisible by 2")
  } else if (num%3 == 0) {
    println("number is divisible by 3")
  } else if(num%5==0){
    println(s"number is divisible by 5")
  } else {
    println("number is not divisible by 2,3 and 5")
  }
}
  println(ledger(9))
}





