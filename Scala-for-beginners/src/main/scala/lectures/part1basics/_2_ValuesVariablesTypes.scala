package lectures.part1basics

object _2_ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER CAN INFER TYPES

  val aString: String = "Hello"
  val anotherString: String = "Goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 1234
  val aLong: Long = 52739852738952372L // or 52739852738952372
  val aFloat: Float = 2.0f // or 2.0
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  aVariable = 5 // SIDE EFFECT
}
