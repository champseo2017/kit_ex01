import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
   พารามิเตอร์แบบ Variable Argument
   fun f1(vararg data: Int) {}
    fun f2(a: String, vararg data: Int) {}
    fun f3(a: String, vararg b: Int, vararg c: Float)  {}
    // Error จะมี Variable Argumnet ได้เพียงตัวเดียวเท่านั้น

    fun summation(vararg data: Int) : Int {
        var sum = 0
        for (n in data) {
            sum += n
        }
        return sum
    }
    val sum1 = summation(1, 2, 3, 4, 5)
    val sum2 = summation(6, 7, 8)
    val arr = intArrayOf(10, 20, 30)
    val sum3 = summation(*arr) // ถ้ากำหนดอาร์กิวเมนต์เป็นอาร์เรย์
    val sum4 = summation(*intArrayOf(40, 50, 60))

    พารามิเตอร์แบบอาร์เรย์
    val i = intArrayOf(1, 2, 3)
    val sum = summation(i)
    println(sum)
    val d = doubleArrayOf(1.2, 3.4, 5.6)
    val sum2 = summation2(d.toTypedArray())
    println(sum2)
    fun summation(data: IntArray) : Int {
        var sum: Int = 0
        for (n in data) {
            sum += n
        }
        return sum
    }

    fun summation2(data: Array<Double>) : Double {
        var sum: Double = 0.0
        for (n in data) {
            sum += n
        }
        return sum
    }

* */
fun main(args: Array<String>) {
}
