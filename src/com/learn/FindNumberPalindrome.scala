package com.learn

class FindNumberPalindrome {
  def isPalindrome(input: String): String = {
    var reverse = input.reverse;
    if (reverse.equals(input)) {
      return "It is a Palindrome";
    } else {
      return "It is not a Palindrome";
    }
  }
}

object FindNumberPalindrome {
  def main(args: Array[String]): Unit = {
    var findNumberPalindrome = new FindNumberPalindrome();
    println("Enter number or String to check Palindrome.....!!!!!");
    var respone = findNumberPalindrome.isPalindrome(scala.io.StdIn.readLine());
    println(respone);
  }

}