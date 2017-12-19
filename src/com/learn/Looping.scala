package com.learn
class Looping {
  for (a <- 1 to 10) {
    println(a);
  }
}

object loop {
  def main(args: Array[String]) {
    var looping = new Looping();
  }
}