import kotlin.random.*

/*

   การโอเวอร์ไรด์เมธอด
   - ที่ Superclass เมธอดนั้น ต้องระบุโมดิฟายเออร์ open
   - Subclass ต้องกำหนดชื่อ เมธอด และ พารามิเตอร์ให้ตรงกับใน Superclass
   (ถ้าพารามิเตอร์ไม่ตรงกัน ชื่อ เมธอดตรงกัน เป็นการโอเวอร์โหลด ไม่ใช้โอเวอร์ไรด์)

* */

 open class Shape {
     open fun area() = 0.0
     fun name() = "Shape"
 }

 class Circle(var radius: Int) : Shape() {
     override fun area() = 3.141 * radius * radius

     fun area(pi: Double = 3.14) = pi * radius * radius
     // เมธอดตรงกัน แต่ พารามิเตอร์ไม่ตรงกัน เป็นการโอเวอร์โหลด
     // สามารถทำได้
     // override fun name() = "GG" // Error
 }



fun main(args: Array<String>) {



}
