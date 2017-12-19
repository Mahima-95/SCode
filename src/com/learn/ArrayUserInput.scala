package com.learn

object ArrayUserInput {
  def main(args: Array[String]) {
    println("Enter your number here...!!!!");
    var input = scala.io.StdIn.readInt();

    var arr: Array[Int] = new Array[Int](input);
    for (i <- 0 to input - 1) {
      println("Enter element number " + i + " : ");
      arr(i) = scala.io.StdIn.readInt();
    }
    for (i <- 0 to (arr.length - 1)) {
      println(arr(i)+" ");
    }
  }
}