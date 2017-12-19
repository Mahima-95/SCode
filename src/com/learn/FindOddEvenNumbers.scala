package com.learn

object FindOddEvenNumbers {
  def main(args: Array[String]) {
    var x: Int = 21;
    if (x % 2 == 0) {
      println(x + " is an Even Number");
    } else {
      println(x + " is an Odd Number");
    }
  }
}