import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
    Function Type
    ตัวแปรแบบ Function Type ต้องกำหนดค่าให้กับมันในรูปแบบของการกระทำ
    ที่เรียกว่า แลมบ์ดา และ สามารถเปลียนวิธีการไปได้อย่างหลากหลาย หรือ แลมบ์ดา
    เป็นการกำหนดวิธีกานทำงานของ Function Type

* */
fun main(args: Array<String>) {
    var calculate: (Double, Double) -> Double
    calculate = {a, b -> a + b}
    val add = calculate(10.0, 20.0)

    calculate = {a, b -> a * b}
    val multiply = calculate(5.0, 10.0)

    calculate = {a, b -> a / b}
    val divide = calculate(15.0, 5.0)
}