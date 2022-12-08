import kotlin.random.*

/*

   การอ้างถึงสมาชิกของ Superclass
   - ใน Subclass เราโอเวอร์ไรด์สมาชิกตัวใดไปแล้ว แต่ต้องการกลับไปใช้รูปแบบเดิมใน
   Superclass ให้อ้างถึงสมาชิกตัวนั้นด้วยคีย์เวิร์ด super เช่น อ้างถึงพร็อปเพอร์ตี้ x
   ก็ใช้ super.x เมธอด getValue() ใช้ super.getValue()

* */

open class Circle(open var radius: Int) {
    open val PI = 3.1
    open fun area() = PI * radius * radius
    open fun perimeter() = 2 * PI * radius
}

class Cylinder(override var radius: Int, var height: Int)
    : Circle(radius){

     override val PI = 3.14
     override fun area() = (super.PI * radius * radius) * 2 +
             (2 * PI * radius * height)
    fun surfaceArea() = super.area() * 2 + perimeter() * height
    // หรือ super.perimeter() เราไม่ได้โอเวอร์ไรด์ จึงอาจระบุแค่ perimeter() ก็ได้

    fun volume() = super.area() * height
}


fun main(args: Array<String>) {



}
