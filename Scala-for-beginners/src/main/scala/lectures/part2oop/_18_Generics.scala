package lectures.part2oop

object _18_Generics extends App {

  class MyList[+A] {
    // use a type A
    def add[B>:A](element: B): MyList[B] = ???

    /*
    A = Cat
    B = Animal
    */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val ListOfStrings = new MyList[String]


  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // can list of animals be a list of cats?
  // 1. yes, List[Cat] extends List[Animal] --> COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList:CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ????  ---> we return list of Animals

  // 2. nope --> INVARIANCE
  class InvarianceList[A]
  val invariantAnimalList: InvarianceList[Animal] = new InvarianceList[Animal]

  // 3. hell, no!! --> CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  // val newCage = new Cage(new Car)
  // generic needs proper bounded type


  /*
  expand MyList to be generic
  */



}
