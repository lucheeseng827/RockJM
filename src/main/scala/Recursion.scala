import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("computing factorial of " + n + " - I first need foactorial of " + (n-1) )
      val result = n * factorial(n-1)
      println("computer factorial of " + n)

      result
    }

  println(factorial(10))



  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)
    factHelper(n,1)
//  println(factHelper(20000,1))
  }
//  println(anotherFactorial(20000))

  def anotherLoopFunction(n: Int): Float = {
    if (n <= 1) 1
    else 0.78237687f*anotherLoopFunction(n-1)
  }
  println(anotherLoopFunction(25))
  println(anotherLoopFunction(2))

// WHEN YOU NEED LOOP USE TAIL RECURSION

/*
  1. concatenate a string n times
  2. is prime function tail recursive
  3. fibonacci function, tial recursive
 */

  def concatFunct(a:String, b: Int, accumulator: String ): String = {
    if (b <= 0) accumulator
      else concatFunct( a, b-1, a + accumulator)
  }
    println(concatFunct("Hello", 3,""))

  def tailRecursionPrime(a: Int): Boolean = {
    def isPrimeTailRec( n: Int, inStillPrime: Boolean): Boolean =
    if (!inStillPrime) false
    else if (a <= 1 ) true
//    number % a != 0 && isPrimeUntil(a-1)
    ////    isPrimeUntil(number / 2)
    else isPrimeTailRec(n - 1, a % n != 0 && inStillPrime)
    isPrimeTailRec(a / 2, true)
  }
  println(tailRecursionPrime(103))

  println(tailRecursionPrime(1003))
}