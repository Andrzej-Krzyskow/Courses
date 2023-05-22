package lectures.part2oop

object _14_Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  // we often create object and class of the same name to divide "static" values/methods from
  // specific instance values/methods

  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_Eyes = 2
    def canFly: Boolean = false

    // factory method - usually methods that are used to create instances of class with the object's name
    def apply(mother:Person, father:Person):Person = new Person("Bobbie")
  }

  class Person (val name:String) {
    // instance-level functionality
  }
  // COMPANIONS - can access each other's private members


  println(Person.N_Eyes)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary == john)

  val person1 = Person
  val person2 = Person

  println(person1 == person2)

  //val bobbie = Person.apply(mary,john)
  val bobbie = Person(mary,john)

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
}
