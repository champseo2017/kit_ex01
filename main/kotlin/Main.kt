import kotlin.random.*

/*

    Companion Object
    - เหมือนค่า static แต่ต้องเข้าถึงผ่านชื่อคลาสโดยตรง
    ไม่สามารถเข้าถึงผ่าน อินสแตนซ์ของคลาสได้

    class Circle {
     companion object {
         var PI: Double = 3.141
         fun area(radius: Int) = PI * radius * radius
         fun perimeter(radius: Int) = 2 * PI * radius
     }
 }

 val a = Circle.area(10)
   val b = Circle.perimeter(20)
    // val c = Circle()
    // val d = c.area(50) // Error เรียกผ่านอินสแตนซ์ไม่ได้


    // ภายในคลาสเดียวกัน เมธอดที่กำหนดในบล็อก Companion Object จะเรียกได้เฉพาะสมาชิก
    ใน Companion ด้วยกันเอง

    // เมธอดนอกบล็อก Companion Object สามารถเรียกได้ทั้ง พร็อปเพอร์ตี้และ เมธอดใน
    Companion Object

* */


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
        // Error เรียกเมธอด checkValue() ซึ้งไม่ใช้ Companion Object
//        }
    }
    private fun checkValue(v: Int) : Int {
        return if (v > 0) v else 0
    }

    fun getClassName(): String = className // Ok
    // เมธอดที่ไม่ใช้ Companion Object สามารถเรียกใช้ Companion Object ได้
}


fun main(args: Array<String>) {

}
