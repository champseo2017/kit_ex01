import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
    รูปแบบของแลมป์ดา
* */
fun main(args: Array<String>) {
    val inc: (Int) -> Int = {n: Int -> n + 1}
    // แลมป์ดานี้รับพารามิเตอร์ชนิด Int เข้ามา 1 ตัว จากนั้นบวกเพิ่มอีก 1 แล้ว ส่งค่ากลับเป็นชนิด Int
    val add: (Int, Int) -> Int = {n1: Int, n2: Int -> n1 + n2}
    val divide: (Double, Double) -> Double =
        {n1: Double, n2: Double -> n1 / n2}
    val oddEven: (Int) -> String =
        {n: Int -> if (n % 2 == 0) "Even" else "Odd"}
    val echo: (String) -> Unit = {str: String -> println(str)}
    val sawasdee: () -> Unit = {print("สวัสดี")}
    val a = inc(10)
    val b = add(20, 30)
    val c = oddEven(99)
    echo("Hello")
    sawasdee()
}