import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
    Higher Order Function
    // กำหนดค่าของพารามิเตอร์ตัวที่สองในแบบแลมบ์ดา เพื่อระบุวิธีการดำเนินกับข้อมูลที่รับ
    // เข้ามา
    fx(a = 2, calculation = {1.toDouble()})
    fx(5, {2 * it })
    val square: (Int) -> Int = {it * it}
    fx(10, square)

     fun fx(a: Int, calculation: (Int) -> Double) {
        val r = calculation(a)
        print("Result: $r")
    }
    // _ แทนที่พารามิเตอร์ตัวที่ไม่ได้ใช้งานด้วยเครื่องหมาย _ เพื่อให้ครบตามจำนวน
    fun shape(width: Int, height: Int, action: (Int, Int) -> Double) : Double {
        return action(width, height)
    }
    val rectArea = shape(10, 20) {w, h -> (w * h).toDouble()}
    val circleArea = shape(10, 0) {r, _ -> 3.14 * r * r}
    val triangleArea = shape(50, 30) {b, h -> 0.5 * b * h}
    println(circleArea)
* */
fun main(args: Array<String>) {

}
