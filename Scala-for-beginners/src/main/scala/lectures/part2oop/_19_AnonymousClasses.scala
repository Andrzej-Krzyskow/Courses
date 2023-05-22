package lectures.part2oop

object _19_AnonymousClasses extends App{

  trait Animal {
    def eat():Unit
  }

  // ANONYMOUS CLASS
  val funnyAnimal: Animal = new Animal {
    override def eat(): Unit = println("bhasbhdabshd")
  }

  /*
  equivalent with

  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("bhabhabhabh")
  }
  val funnyAnimal: Animal = new AnonymousClasses$$anon$1

  */

  println(funnyAnimal.getClass)

  class Person(name:String){
    def sayHi:Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }

}
