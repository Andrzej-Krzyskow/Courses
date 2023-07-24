package lectures.part1basics

import scala.annotation.tailrec

object _6_Recursion extends App {

  def factorial(n: Int): BigInt = {

    @tailrec
    def tailFactorial(acc: BigInt, n: Int): BigInt = {
      if (n <= 1) acc
      else tailFactorial(acc * n, n-1)
    }

    if (n < 0) return -1

    tailFactorial(1, n )
  }

  // 1. Concatenate a string n times
  // 2. is prime tail
  // 3. Fibonacci tail

  // 1

  def concatenateNTimes(givenString: String, n: Int): String = {

    @tailrec
    def tailFunc(acc: String,givenString: String, n: Int): String={
      if(n==0) acc
      else tailFunc(acc+givenString, givenString, n-1)
    }

    tailFunc("",givenString, n)
  }

  println(concatenateNTimes("hello", 10))

  // 2

  def isPrime(n: Int): Boolean = {

    @tailrec
    def tailIsPrime(n: Int, sqrt: Int, next: Int): Boolean = {
      if (next > sqrt) true
      else if (n % next == 0) false
      else tailIsPrime(n, sqrt, next + 1)
    }

    if (n <= 1) false
    else tailIsPrime(n, Math.sqrt(n).toInt, 2)

  }

  // 3
  def fibonacci(n: Int): Int = {

    @tailrec
    def tailFibonacci(n: Int, next: Int, current: Int): Int = {
      if (n <= 0) current
      else tailFibonacci(n - 1, next + current, next)
    }

    tailFibonacci(n, 1, 0)
  }

  println(fibonacci(4))

}
