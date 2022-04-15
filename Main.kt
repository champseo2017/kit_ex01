import java.util.*
import java.*;
import kotlin.random.*;

/*
    การโอเวอร์ไรด์เมธอด
    การโอเวอร์ไรด์เมธอด ก็เพื่อเป็นการควบคุมการทำงานแทนรูปแบบเดิมที่กำหนดไว้ใน Superclass
    - ที่ Superclass เมธอดนั้น ต้องระบุโมดิฟายเออร์ Open
    - ที่ Subclass ต้องกำหนดชื่อเมธอด และ รูปแบบพารามิเตอร์ให้ตรงกับใน Superclass
    (ถ้ารูปแบบพารามิเตอร์ไม่ตรง แต่ชื่อเมธอดตรงกัน ถือเป็นการโอเวอร์โหลด ไม่ใช้โอเวอร์ไรด์)



* */

open class Shape {
    open fun area() = 0.0
    // Superclass ต้องระบุโมดิฟายเออร์ Open
    fun name() = "Shape"
}

class Circle(var radius: Int) : Shape() {
    override fun area() = 3.141 * radius * radius

    fun area(pi: Double = 3.14) = pi * radius * radius // Ok
    // ถ้ารูปแบบพารามิเตอร์ไม่ตรง แต่ชื่อเมธอดตรงกัน ถือเป็นการโอเวอร์โหลด

    override fun name() = "Circle" // Error
    // ที่ Superclass เมธอดนั้น ต้องระบุโมดิฟายเออร์ Open
}


fun main(args: Array<String>) {

}
