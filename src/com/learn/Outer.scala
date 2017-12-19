package com.learn

class Outer {
  class Inner {
    private def sum(a: Int) {
      var i: Int = a;
      println(i);
    }
    class InnerMost {
      def sum(a: Int) {
        var i: Int = a;
        println(i);
      }
    }
  }
}
object autonomous {
  def main(args: Array[String]) {
    var outer = new Outer();
  }
}