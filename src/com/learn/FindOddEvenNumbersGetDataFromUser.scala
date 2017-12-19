package com.learn

object FindOddEvenNumbersGetDataFromUser {
  def main(args: Array[String]) {
    println("Type your number to get it is odd or even..!!!");
    var input = scala.io.StdIn.readInt();
    if (input % 2 == 0) {
      println(input + " is an even number");
    } else {
      println(input + " is an odd number");
    }
  }
}