package com.learn

import scala.io.Source
import java.io.PrintWriter

object File {
  def main(args: Array[String]) {
    readFile()
    readFromConsole()
    writeInfile()
    getLinesFromFile()
  }

  def readFile() = {
    println("Following is the content read:")
    Source.fromFile("D:\\Mahima\\My Dev Space\\workspace\\Learning\\src\\plurals.csv").foreach {
      print
    }
  }

  def readFromConsole() = {
    var content = Console.readLine();
    println("you have written : " + content);
  }

  def writeInfile() = {
    val writer = new PrintWriter("D:\\Mahima\\My Dev Space\\workspace\\Learning\\src\\test.txt");
    writer.write("Hiiiiii Mahima....!!!!!!!")
    writer.close();
  }
  
  def getLinesFromFile() = {
    Source.fromFile("D:\\Mahima\\My Dev Space\\workspace\\Learning\\src\\test.txt").getLines.take(1).foreach { x => println(x) };
  }
}