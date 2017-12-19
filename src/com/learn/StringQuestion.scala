package com.learn

object StringQuestion {
  def main(args: Array[String]) {
    var name = "Mahima";
    //s Interpolator
    println(s"Hello $name");
    println(s"1+1=${1 + 1}");

    //f Interpolator
    var height = "5.3"
    println(f"$name is $height inches tall");
  }

  println("--------------------------------------------------------");
  println("Enter our String here...!!!");
  var stringInput = scala.io.StdIn.readLine();

  println("String you put here--->>>> " + stringInput);

  println("reverse String using in-built method---->>>> "+stringInput.reverse);
  

}