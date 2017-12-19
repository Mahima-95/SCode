package com.learn

object StringReverse {
  def main(args: Array[String]) {
    println("Enter string to reverse..!!!")
    var input = scala.io.StdIn.readLine();
    var str: Array[Char] = new Array[Char](input.length())
    for (i <- 0 to input.length() - 1) {
      str(i) = input.charAt(i)
    }
    for (i <- (0 to input.length() - 1).reverse) {
      print(str(i))
    }
  }
}