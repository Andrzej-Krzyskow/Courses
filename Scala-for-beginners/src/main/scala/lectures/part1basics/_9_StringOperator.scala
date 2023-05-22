package lectures.part1basics

object _9_StringOperator extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))
  println(str.drop(2))


  // Scala-specific: String interpolators

  // S-interpolators

  val name ="David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)
  val anotherGreeting = s"Hello, my name is $name and I am ${age+1} years old"
  println(anotherGreeting)

  // F-interpolators

  val speed = 1000.2
  val myth = f"$name%s can eat $speed%2.2f per minute"
  println(myth)


  // raw-interpolator

  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
