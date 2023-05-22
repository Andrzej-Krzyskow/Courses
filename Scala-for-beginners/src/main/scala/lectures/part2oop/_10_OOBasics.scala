package lectures.part2oop

object _10_OOBasics extends App {

  val person = new Person("John", 25)
  println(person.x)
  person.greet("Daniel")
  person.greet


  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.increment.increment
  println(counter.counter)
}

//noinspection ScalaFileName
// constructor
class Person(name: String = "John Doe", val age: Int = 0) {
  // body
  val x = 2
  println(1 + 2)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet: Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")

}

/*
  Novel and a Write


  Writer : first name, surname, year
    - method full name

  Novel: name year of release, author
    - authorAge
    - isWrittenBy (author)
    - copy (new year of release) = new instance of Novel

*/

class Writer(firstName: String, surname: String, val year: Int) {

  def getFullName: String = f"$firstName $surname"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def authorAge: Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)

}


/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount

*/

class Counter(val counter: Int = 0) {

  def increment: Counter = new Counter(counter + 1)   // IMMUTABILITY!!!
  def decrement: Counter = new Counter(counter - 1)

  def increment(n: Int): Counter = new Counter(counter + n)
  def decrement(n: Int): Counter = new Counter(counter - n)

}