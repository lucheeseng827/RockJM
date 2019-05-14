object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b}

  println(aFunction("hello",4 ))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n:Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  aFunctionWithSideEffects("some string with sides")


  def greetingFunc(name:String, age:Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greetingFunc("Nick",30))

  def factorialFunc(number: Int): Int = {
    if (number <= 0 ) 1
    else number * factorialFunc(number-1)
  }
  println(factorialFunc(5))


  def fibFunc(number: Int): Int = {
    if (number <= 1) 1
    else fibFunc(number-1) + fibFunc(number-2)
  }
  println(fibFunc(8))

  def isPrimeFunc(number: Int): Boolean = {
    def isPrimeUntil(a: Int): Boolean =
      if (a<= 1) true
      else number % a != 0 && isPrimeUntil(a-1)
      isPrimeUntil(number / 2)
  }
  println(isPrimeFunc(35))
  println(isPrimeFunc(2003))
}