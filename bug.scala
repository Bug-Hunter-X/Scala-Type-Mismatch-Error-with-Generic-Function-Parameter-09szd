```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => T): T = f(value)
}

object Main extends App {
  val myInstance = new MyClass(5)
  val result = myInstance.myMethod((x: Int) => x + 1) // Type mismatch error occurs here
  println(result)
}
```