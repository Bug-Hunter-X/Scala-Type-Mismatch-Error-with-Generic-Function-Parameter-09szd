```scala
class MyClass[T](val value: T) {
  def myMethod[U >: T](f: T => U): U = f(value) // Using a type parameter U
}

object Main extends App {
  val myInstance = new MyClass(5)
  val result = myInstance.myMethod((x: Int) => x + 1) 
  println(result) // Output: 6

  val myInstance2 = new MyClass(5.0)
  val result2 = myInstance2.myMethod((x: Double) => x + 1.0) 
  println(result2) // Output: 6.0
}
```