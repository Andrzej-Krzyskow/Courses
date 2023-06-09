package lectures.part1basics

import scala.annotation.tailrec

object _8_DefaultArgs extends App {

  @tailrec
  def tailFactorial(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else tailFactorial(n - 1, n * acc)


  val fact10 = tailFactorial(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving picture")

  savePicture(width=800)
  savePicture(height = 900, width = 22, format = "lol")

  /*

  1. Pass in every leading argument
  2. Name the argument

  * */

}
