package playground

import scala.annotation.tailrec

object Playground {

  def main(args: Array[String]): Unit = {
    println("Hello, World!")
  }


  val primes: Int => List[Int] = (toN: Int) => {
    @tailrec
    def findPrimes(sieve: List[Int], ind: Int): List[Int] = {
      if (ind >= sieve.size) sieve
      else {
        findPrimes(sieve.slice(0, ind + 1) ::: sieve.slice(ind + 1, sieve.size).filter(x => x % sieve(ind) != 0), ind + 1)
      }
    }

    findPrimes(List.range(2, toN), 0)
  }

  println(primes(30))

}
