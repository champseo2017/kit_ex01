import kotlin.random.*

/*

     พร็อปเพอร์ตี้แบบ lateinit
     - เป็นการกำหนดค่าขึ้นมาก่อน ไม่สามารถใช้ได้กับ ชนิดข้อมูลพื้นฐาน
     - ยกเว้นข้อมูลชนิด String
     - ใช้ lateinit กับพร็อปเพอร์ตี้ที่มี Type เป็นคลาสชนิดใดชนิดหนึ่ง และต้อง
     การสร้างอินสแตนซ์ของมันในภายหลังเมื่อต้องการใช้งาน

* */

 class Circle(private var radius: Double) {
     fun perimeter(): Double {
         return 3.14 * radius * radius
     }
 }

 class Rectangle(private var width: Double,
 private var height: Double) {
     fun area(): Double {
         return width * height
     }
 }

 class Shape {
     private lateinit var circle: Circle
     private lateinit var rect: Rectangle
     fun circlePerimeter(radius: Double): Double {
         circle = Circle(radius)
         return circle.perimeter()
     }
     fun rectArea(width: Double, height: Double): Double {
         rect = Rectangle(width, height)
         return rect.area()
     }
 }

fun main(args: Array<String>) {

   val shape = Shape()
   println(shape.circlePerimeter(10.0))
    // อินสแตนซ์ของ Circle ถูกสร้างขึ้น
   println(shape.rectArea(10.0, 20.0))
   // อินสแตนซ์ของ Rectangle ถูกสร้างขึ้น

}
