package lectures.part1basics

object _3_Expressions extends App {

  val x = 1 + 2 //  EXPRESSION
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3  // SIDE EFFECT
  println(aVariable)

  // INSTRUCTION (what we tell a PC to DO - change a variable, print, compute that etc.) VS EXPRESSION (sth which has a VALUE or a type)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 6 else 3   // IF expression
  println(aConditionedValue)
  println(if (aCondition) 6 else 3)


  // DON'T DO THIS:
  var i=0
  val aWhile = while  (i<10) {   // Side Effect
    println(i)
    i+=1
  }

  // EVERYTHING in Scala is an EXPRESSION   !!!

  val aWeirdValue = (aVariable = 3)   // Unit == void
  println(aWeirdValue)

  // SIDE EFFECTS: println(), whiles, reassigning !!!

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y+1

    if(x>2)
      "hello"
    else
      "goodbye"
  }

  // the value of the block is the value of it last expression
  // instructions are executed, expressions are evaluated


  // 1. What is the difference between "hello world" vs println("hello world")?
  // "hello world" is an expression which gives a value of type String "hello world" and println("hello world") is a side effect that prints "hello world" to the console
  // and returns type Unit

  // 2.

  val someValue = { // Boolean true
    2<3
  }

  val someOtherValue = {  // Int 42
    if(someValue) 239 else 986
    42
  }


}
