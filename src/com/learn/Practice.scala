package com.learn

object Practice {
  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0;
    sum = a + b;
    return sum;
  }

  def addFloat(a: Int, b: Int): Float = {
    var sum: Int = 0;
    sum = a + b;
    return sum;
  }
  def loop(): Int = {

    for (a <- 1 to 5; b <- 1 to 5) {
      println("A loop runs--->>>" + a);
      println("B loop runs--->>>" + b);
    }
    return 0;
  }

  def main(args: Array[String]) {
    var sumInt: Int = addInt(1, 2);
    var sumFloat: Float = addFloat(13, 20);
    var fs = printf("sum of Int is: " + "%d, and sum of float is: " + "%f", sumInt, sumFloat);
    // println(fs);
    loop();

  }
}