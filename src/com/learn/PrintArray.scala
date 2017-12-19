package com.learn

object PrintArray {
  def main(args: Array[String]) {
    var arr = Array(5, 10, 23, 21, 60, 99)
    for (num <- arr) {
      println(num);
    }
  }
}