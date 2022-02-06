import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
   การใช้งานตัวแปรที่เป็น Nullable
     การตรวจสอบด้วย if
         val x: Int? = 10
    if (x != null) {
        println("x = $x")
    } else {
        println("x = null")
    }
    print("Enter number >>")
    val str: String? = readLine()
    if (str != null) {
        val n: Double? = str.toDoubleOrNull()
        if (n != null) {
            print("n = $n")
        } else {
            print("Error! can't convert to a number")
        }
    } else {
        print("Error!")
    }

    การใช้ Elvis Operator
     - หากตัวแปรมีค่าเป็น null ก็ให้ใช้ข้อมูลอย่างอื่นแทนค่าของตัวแปร (ค่าดีฟอลต์)
     - NullableVar ?: Default
        - NullableVar คือตัวแปรหรือสิ่งที่มีโอกาสเป็น null ได้
        - Default คือค่า ดีฟอลต์กรณีที่ NullableVar มีค่าเป็น null
         val a: Int? = 0
        val x = a ?: 0
        /*
        *  เทียบเท่ากับ
        *  val x = if (a != null) a else 0
        * */
        val b: Double? = 1.23
        val y = b ?: -1.0
        print("Enter number >>")
        val input: String? = readLine()
        val str = input ?: ""
        val n1: Int? = 10
        val n2: Int? = null
        val n: Int
        n = (n1 ?: 0) + (n2 ?: -1)
        val m = ("123".toIntOrNull() ?: 0) * 100
* */
fun main(args: Array<String>) {
    val msg: String? = readLine()
    print(msg ?: "Error")
}
