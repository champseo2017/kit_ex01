import java.util.*
import java.*;
import kotlin.random.*;
// Companion Object
// สามารถเข้าถึงสมาชิก (เมธอดหรือ พร็อปเพอร์ตี้) ผ่านชื่อคลาสโดยตรง และในกรณีของ
// พร็อปเพอร์ตี้ จะใช้ข้อมูลร่วมกันระหว่างคลาส ซึ้งก็เทียบได้กับโมดิฟายเออร์แบบ static
// ที่ใช้ใน Java หรือ Swift
// ไม่สามารถใช้กับคอนสตรักเตอร์ได้
// ให้สร้างบล็อกด้วยคำสั่ง companion object {}
// แล้วกำหนดสมาชิกไว้ในบล็อก {}
// การเข้าถึงสมาชิกที่อยู่ใน Companion Object จากภายนอกคลาส ให้ระบุผ่านชื่อ
// คลาสโดยตรงเท่านั้น (ไม่สามารถเรียกผ่านอินสแตนซ์ได้)

class Circle {
    companion object {
        var PI: Double = 3.141
        fun area(radius: Int) = PI * radius * radius
        fun perimeter(radius: Int) = 2 * PI * radius
    }
}

fun main(args: Array<String>) {
   val a = Circle.area(10) // เรียกใช้งานผ่านชื่อคลาสโดยตรง
    val b = Circle.perimeter(20) // เรียกใช้งานผ่านชื่อคลาสโดยตรง
    val c = Circle()
    // val d = c.area(50) // Error เรียกผ่านอินสแตนซ์ไม่ได้
}
