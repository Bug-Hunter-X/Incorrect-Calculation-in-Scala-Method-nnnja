```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y // Correct calculation
  }
  def myOtherMethod(y: Int): Int = {
    //Error: Incorrect calculation 
     x - y 
  }
}
```