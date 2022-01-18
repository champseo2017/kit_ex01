import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
   การส่งหลายๆ ค่ากลับจากฟังก์ชัน
    fun oneToTenEvenNums() : IntArray {
        return intArrayOf(2, 4, 6, 8, 10)
    }

    fun getVowels() : Array<String> {
        return arrayOf("a", "e", "i", "o", "u")
    }
    var vowels = getVowels()
    for (v in vowels) {
        println(v)
    }
    การส่งค่ากลับแบบ Pair หรือ Triple
     val sum = summation(10, 15, 18, 22)
    print("sum: ${sum.first}, average: ${sum.second}")
    fun summation(vararg data: Int) : Pair<Int, Double> {
        var sum = 0
        for (n in data) {
            sum += n
        }
        var average = sum.toDouble() / data.count().toDouble()
        return Pair(sum, average)
    }
* */
fun main(args: Array<String>) {
    val sum = summation(10, 15, 18, 22)
    print("sum: ${sum.first}, average: ${sum.second}")
}
    fun summation(vararg data: Int) : Pair<Int, Double> {
        var sum = 0
        for (n in data) {
            sum += n
        }
        var average = sum.toDouble() / data.count().toDouble()
        return Pair(sum, average)
    }