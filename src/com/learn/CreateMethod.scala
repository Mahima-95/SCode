package com.learn

class CreateMethod {

  def sum(a: Int, b: String) {
    var i: Int = a
    var j: String = b
    println(i);
    println(j);
  }

}

object demo {
  def main(args: Array[String]) {
    var createMethod = new CreateMethod();
    createMethod.sum(1, "hiii");
  }
}