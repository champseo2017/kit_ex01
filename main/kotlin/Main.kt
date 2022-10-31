import kotlin.random.*

/*
  เมธอดของคลาส


* */

class Calculator {
    fun add(n1: Double, n2: Double): Double {
        return n1 + n2
    }
    fun subtract(n1: Int, n2: Int) = n1 - n2
    fun subtract(n1: Double, n2: Double) = n1 - n2 // Overload

    fun cal(n1: Double, n2: Double, action:(Double, Double)
     -> Double) : Double {
        return action(n1, n2)
    }
}

fun main(args: Array<String>) {
   val c = Calculator()
   val x = c.add(10.1, 20.1)
   val y = c.subtract(n1=2, n2=50)
   val z = c.cal(30.0, 5.0) { a, b -> a * b }
}
