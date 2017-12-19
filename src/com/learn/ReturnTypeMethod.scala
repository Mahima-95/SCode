package com.learn

class ReturnTypeMethod {

  def sum(a: Int, b: Int): Int = {
    var sum: Int = 0;
    sum = a + b;
    return sum;
  }
}

object returnType {
  def main(args: Array[String]) {
    var returnTypeMethod = new ReturnTypeMethod();
    var s = returnTypeMethod.sum(1, 2);
    println(s);
  }
}