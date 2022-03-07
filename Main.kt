import java.util.*
import java.*;
import kotlin.random.*;
// Companion Object
// ภายในคลาสเดียวกัน เมธอดที่กำหนดในบล็อก Companion Object จะเรียกใช้ได้
// เฉพาะสมาชิกที่อยู่ใน Companion Object ด้วยกันเองเท่านั้น แต่ไม่สามารถเรียกใช้
// สมาชิกที่อยู่นอกบล็อกดังกล่าวได้
// แต่เมธอดที่อยู่นอก บล็อก Companion Object สามารถเรียกใช้ได้ทั้งเมธอดหรือ
// พร็อปเพอร์ตี้ที่อยู่ในบล็อก Companion Object
class Circle(var radius: Int) {
    var PI: Double = 3.141
    companion object {
        val className: String = "Circle"
        // fun area() = PI * radius * radius
        // เกิด Error เพราะเรียกใช้พร็อปเพอร์ตี้ PI และ radius
        // ซึ้งไม่ใช้ Companion Object
//        fun perimeter(r: Int) : Double {
//            r = checkValue(r) // Error
//            return 2 * PI * r
//        }
          // เกิด Error เพราะเรียกใช้เมธอด checkValue() ซึ้งไม่ใช้ Companion Object
    }
    private  fun checkValue(v: Int) : Int {
        return if (v > 0) v else 0
    }
    fun getClassName() : String = className // OK
    // OK เพราะเมธอดที่ไม่ใช้ Companion Object
    // สามารถเรียกใช้เมธอดหรือพร็อปเพอร์ตี้ที่เป็นเป็น Companion Object ได้
}

fun main(args: Array<String>) {

}
