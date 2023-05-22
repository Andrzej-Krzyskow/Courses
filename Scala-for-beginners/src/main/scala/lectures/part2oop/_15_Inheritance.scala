package lectures.part2oop

object _15_Inheritance extends App {

  // single class inheritance --> extend one class at a time
  class Animal {
    val creatureType = "Wild"

    def eat(): Unit = println("nomnom")
  }

  class Cat extends Animal {
    def crunch(): Unit = {
      eat()
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch()


  // constructors
  class Person(name: String, age: Int = 0) {
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String = "domestic") extends Animal {
    //override val creatureType: String = "domestic"
    override def eat(): Unit = {
      super.eat()
      println("crunch, crunch")
    }
  }

  /*class Dog(dogType: String) extends Animal{
    override val creatureType: String = "domestic"
  }*/

  val dog = new Dog("domesticNew")
  dog.eat()
  println(dog.creatureType)


  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("k2")
  unknownAnimal.eat()

  // overRIDING vs overLOADING - I know already


  // super


  // preventing overrides
  // 1 - use "final" on method
  // 2 - make class final - class cannot be extended
  // 3 - seal the class = extend classes in THIS FILE, but prevent the extension in other files



}
