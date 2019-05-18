package part1basics

object  Expression extends App {
  val x = 1  + 2 //EXPRESSION
  println(x)

  println( 2 + 3 * 4)

  println( 1 == x)

  println(!(1 == x))
  var aVariable = 2

  aVariable += 3
  println(aVariable)

  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 5 //IF expression
  println(aConditionValue)

  "hello world"
  println("hello world") // unit
  val someValue = {
    2 < 34
  }
  println(someValue)
  val someOtherValue = {
    if(someValue) 239 else 980
    43
  }
  println(someOtherValue)
}
