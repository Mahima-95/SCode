package com.learn

class InheritanceExample {
  def sum(id: Int, name: String) {
    var ID: Int = id
    var Name: String = name
    println("your ID is---->>>" + ID);
    println("your name is---->>>" + Name);
  }
}

class ChildClass extends InheritanceExample {
  def sum(id: Int, name: String, name1: String) {
    var ID: Int = id
    var Name: String = name
    var Name1: String = name1
    println("your ID is---->>>" + ID);
    println("your name is---->>>" + Name);
    println("your name1 is---->>>" + Name1);
  }

}

object test1 {
  def main(args: Array[String]) {
  var child = new ChildClass();
  child.sum(1,"Mahima","Agrawal");
  }
}