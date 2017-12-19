package com.learn

object CheckMissingNumber {
  def main(args: Array[String]) {
    checkMissingnumber()
  }

  def checkMissingnumber() = {
    var arr = Array(1, 2, 3, 4, 6, 7, 8, 9, 10);
    var sum: Int = 0;
    var sumArray: Int = 0;
    for (i <- 0 to arr.length - 1) {
      sumArray += arr(i);
    }
    for (i <- 0 to 10) {
      sum += i;
    }
    var missingNumber = sum - sumArray;
    println("Missing number is " + missingNumber)
  }
}