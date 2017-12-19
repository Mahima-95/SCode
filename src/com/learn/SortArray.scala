package com.learn

object SortArray {
  def main(args: Array[String]) {
    sortArray()
  }

  def sortArray() = {

    println("Print number");
    var input = scala.io.StdIn.readInt();
    var arr: Array[Int] = new Array[Int](input)
    for (i <- 0 to input - 1) {
      println("enter numbers " + i + " ");
      arr(i) = scala.io.StdIn.readInt();
    }
    //var arr = Array(29, 23, 14, 21, 12, 1, 0, 9, 8, 5, 7);
    var temp: Int = 0
    for (i <- 0 to (arr.length - 1); j <- i + 1 to (arr.length - 1)) {
      if (arr(i) > arr(j)) {
        temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp
      }
    }
    println("sorted numbers ")
    for (i <- 0 to (arr.length - 1)) {
      println(arr(i) + " ")
    }
  }
}