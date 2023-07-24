package lectures.part2oop

object _16_AbstractDataTypes extends App{

  // abstract
  abstract class Animal {
    val creatureType: String = "wild" // non-abstract
    def eat(): Unit                   // abstract
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    def eat(): Unit = println("Crunch crunch")
  }


  // TRAITS
  trait Carnivore {
    def eat(animal:Animal):Unit             // abstract
    val preferredMeal:String = "fresh meat" // non-abstract
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    override def eat(): Unit = println("nomnomnom")
    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - only one class and MULTIPLE traits can be inherited
  // 3 - traits for BEHAVIOUR, abstract class for THINGS
}
