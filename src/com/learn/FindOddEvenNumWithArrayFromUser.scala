package com.learn

class FindOddEvenNumWithArrayFromUser {

  def test() = {
    println("Type a 5 numbers to get it is even or odd..!!!");
    var arr = readLine;
    var a: Array[Int] = arr.split("").map(_.toInt);

    for (x <- 0 to (a.length-1)) {
      println("User input----->>>> " + x);
    }
  }
}
object FindOddEvenNumWithArrayFromUser {
  def main(args: Array[String]) {
    var findOddEvenNumWithArrayFromUser = new FindOddEvenNumWithArrayFromUser();
    findOddEvenNumWithArrayFromUser.test();
  }
}