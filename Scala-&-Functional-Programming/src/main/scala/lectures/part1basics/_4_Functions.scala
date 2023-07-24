package lectures.part1basics

import scala.annotation.tailrec

object _4_Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN LOOPS NEEDED, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  // 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"

  def greetings(name: String, age: Int):Unit = {
    println("Hi, my name is " + name + " and I am " + age + " years old")
  }

  greetings("Andy", 20)

  // 2. factorial
  def factorial(n:Int):Long={

    @tailrec
    def tailFactorial(acc: Long, n:Int):Long={
      if(n<=0) acc
      else tailFactorial(acc*n, n-1)
    }
    if(n<0) return -1

    if(n==0) return 1

    tailFactorial(n, n-1)
  }

  println(factorial(36))

  // 3. A Fibonacci function
  def fibonacci(n: Int): Int={

    @tailrec
    def tailFibonacci(n: Int, next:Int, current: Int):Int={
      if(n<=0) current
      else tailFibonacci(n-1, next+current, next)
    }

    tailFibonacci(n, 1, 0)
  }

  println(fibonacci(4))

  // 4. Tests if a number is prime
  def isPrime(n:Int): Boolean={

    @tailrec
    def tailIsPrime(n:Int, sqrt: Int, next: Int):Boolean={
      if(next>sqrt) true
      else if (n%next==0) false
      else tailIsPrime(n,sqrt, next+1)
    }
    if(n<=1) false
    else tailIsPrime(n, Math.sqrt(n).toInt, 2)

  }


  println(isPrime(2004))
}
