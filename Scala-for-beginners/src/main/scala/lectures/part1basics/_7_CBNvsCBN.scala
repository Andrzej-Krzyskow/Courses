package lectures.part1basics

object _7_CBNvsCBN extends App {


  def calledByValue(x: BigInt):Unit={
    println("By value: " + x)
    println("By value: " + x)
  }

  def calledByName(x: => BigInt): Unit = {
    println("By name: " + x)
    println("By name: " + x)
  }

  /*

  BY VALUE:
  def calledByValue(x: BigInt):Unit={
    println("By value: " + x)
    println("By value: " + x)
  }

  BY NAME:
   def calledByName(x: => BigInt): Unit = {
    println("By name: " + System.nanoTime())
    println("By name: " + System.nanoTime())
  }

  * */


  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
