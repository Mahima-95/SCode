package com.learn

object ArraysQuestion {
  def main(args: Array[String]) {
    
    var arr = Array(1, 2, 44, 66, 2, 0)
    for (x <- arr) {
      println(x);
    }
    var sum = 0;
    for (i <- 0 to (arr.length - 1)) {
      sum = sum + arr(i)
    }
    println("sum -->>> " + sum);

    //find largest element in array
    var max = arr(0);
    for (i <- 0 to (arr.length - 1)) {
      if (arr(i) > max)
        max = arr(i);
    }
    println("Max element--->>>>" + max);
  }
}