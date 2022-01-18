import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
   ฟังก์ชันแบบโอเวอร์โหลด
* */
fun main(args: Array<String>) {
    val a = max(10, 20) // ฟังก์ชัน max(Int, Int) จะถูกเรียก
    val b = max(10.5, 20.5) // ฟังก์ชัน max(Double, Double) จะถูกเรียก
    val c = max(108, 1009, 189) // ฟังกชัน max(Int, Int, Int)
    val d = max(9.9, 10.9, 11.9)
}
    fun max(n1: Int, n2: Int) = if (n1 >= n2) n1 else n2
    fun max(n1: Int, n2: Int, n3: Int): Int {
        var mx = n1
        mx = if (n2 > mx) n2 else mx
        mx = if (n3 > mx) n3 else mx
        return mx
    }
    fun max(n1: Double, n2: Double) = if (n1 >= n2) n1 else n2
    fun max(n1: Double, n2: Double, n3: Double) : Double {
        // เช่น เดียวชนิด Int
    }
