import java.util.*
import java.*;
import kotlin.random.*;

/*
   การอ้างถึงสมาชิกของ Superclass

   ถ้าใน Subclass เราโอเวอร์ไรด์สมาชิกตัวใดไปแล้ว แต่ต้องการกลับไปใช้รูปแบบเดิมใน Superclass
   ก็ให้อ้างถึงสมาชิกตัวนั้นด้วยคีย์เวริร์ด super เช่น ถ้าจะอ้างถึงพร็อปเพอร์ตี้ x ก็ใช้ super.x หรือ อ้างถึงเมธอด
   getValue() ก็ใช้ super.getValue()


* */

open class Circle(open var radius: Int) {
    open val PI = 3.14159
    open fun area() = PI * radius * radius
    open fun perimeter() = 2 * PI * radius
}

class Cylinder(override var radius: Int, var height: Int)
    : Circle(radius) {
    override val PI = 3.14
    override fun area() = (super.PI * radius * radius) * 2 +
            (2 * PI * radius * height)
    fun surfaceArea() = super.area() * 2 + perimeter() * height
    // หรือใช้ super.perimiter() ก็ได้

    fun volume() = super.area() * height

    // 1. หากต้องการใช้ค่าเดิมใน Superclass ก็ใช้ super.PI ถ้ากำหนดเป็น PI จะหมายถึงพร็อปเพอร์ตี้
    // ที่กำหนดขึ้นใหม่ใน Subclass
    // 2. เนื่องจากใน Subclass เราโอเวอร์ไรด์เมธอด area() ไปแล้ว ดังนั้น หากต้องการกลับไปใช้วิธีการ
    // คำนวณแบบเดิมใน Superclass ก็กำหนดเป็น super.area() ถ้าไม่ได้โอเวอร์โหลด perimeter() หรือ
    // super.perimeter()
}

fun main(args: Array<String>) {

}
