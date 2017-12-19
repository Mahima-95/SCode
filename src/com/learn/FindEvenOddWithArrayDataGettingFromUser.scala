package com.learn

object FindEvenOddWithArrayDataGettingFromUser {
  def main(args: Array[String]) {
    println("Enter Number..!!!");
    var input = scala.io.StdIn.readInt();
    var arr: Array[Int] = new Array[Int](input)
    for (i <- 0 to input - 1) {
      println("enter your numbers " + i + " : ");
      arr(i) = scala.io.StdIn.readInt();
    }
    for (i <- 0 to (arr.length - 1)) {
      if (arr(i) % 2 == 0) {
        println(arr(i) + "  is an Even number...!!!")
      } else {
        println(arr(i) + "  is an Odd number...!!!")
      }
    }
  }
}
