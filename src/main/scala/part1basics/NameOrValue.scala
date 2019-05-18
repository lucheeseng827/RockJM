package part1basics

object NameOrValue extends App{
  def calledByValue(x: Long) : Unit = {
    println("Value by: " + System.nanoTime())
    println("Value by: " + System.nanoTime())
  }
  calledByValue(System.nanoTime())
  def calledByName(x: => Long) : Unit = {
    println( "Name by: " + System.nanoTime())
    println( "Name by: " + System.nanoTime())
  }
  calledByName(System.nanoTime())
}
