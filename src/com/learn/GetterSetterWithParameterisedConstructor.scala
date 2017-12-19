package com.learn

class GetterSetterWithParameterisedConstructor(var a:Int, var b:String) {
  var num:Int = a;
  var num1:String = b;
}
object test{
  def main(args:Array[String]){
    var gsConstructor = new GetterSetterWithParameterisedConstructor(1,"Mahima");
    println("roll no--->>> "+ gsConstructor.num);
    println("name--->>> "+ gsConstructor.num1);
  }
}