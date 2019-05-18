package part1basics

object StringOperations extends App {
  val a = "Some Scala string with Alpha Numer1c"
  println(a.toUpperCase)
  println(a.toLowerCase())
  println(a.charAt(5))
  println(a.substring(2,7))
  println(a.take(2))
  println(a.split(" ").toList)
  println(a.length)
  println(a.reverse)
  println(a.startsWith("Some"))

  val x = "33"
  val someSentence = s"the variable is $x and it's legit"
  val someSentenceAgain = s"the value is ${x + 10}"
  println(someSentence)
  println(someSentenceAgain)


  //F interpolator
  val floatNumber = 00.2342423
  val floatSentence =
    f"This is a float number that is valued as much as $floatNumber%2.2f"
  println(floatSentence)
  //raw interpolator
  val rawSentence = "this is some raw \n with some nice words"
  println(raw"this is some raw \n with some nice words")
  println(raw"$rawSentence")
  println(rawSentence)
}
