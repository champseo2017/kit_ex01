import java.util.*
import java.*;
import kotlin.random.*;
// พร็อปเพอร์ตี้แบบ lateinit
// การใช้คำสั่ง lateinit ไม่สามารถใช้ lateinit กับชนิดข้อมูลพื้นฐานได้
// (Primitive Type) เช่น Int, Double, Float, Byte, Long, Boolean, Char เป็นต้น
// ยกเว้นชนิด String (Kotlin ไม่จัดว่า String เป็น Primitive Type)
// โดยส่วนใหญ่ เรามักใช้ lateinit กับพร็อปเพอร์ตี้ที่มี Type เป็นคลาสชนิดใดชนิดหนึ่ง
// และต้องการสร้าง อินสแตนซ์ของมันในภายหลังเมื่อต้องการใช้งาน

class Circle(private  var radius: Double) {
    fun perimeter() : Double {
        return 3.14 * radius * radius
    }
}

class Rectangle(private var width: Double, private var height: Double) {
    fun area() : Double {
        return width * height
    }
}

class Shape {
    private  lateinit var circle: Circle
    private  lateinit var rect: Rectangle
    fun circlePerimeter(radius: Double) : Double {
        circle = Circle(radius)
        return circle.perimeter()
    }
    fun rectArea(width: Double, height: Double) : Double {
        rect = Rectangle(width, height)
        return rect.area()
    }
}
fun main(args: Array<String>) {
    val shape = Shape()
    println(shape.circlePerimeter(10.1)) // อินสแตนซ์ของ Circle จะถูกสร้างขึ้น
    println(shape.rectArea(10.1, 20.1)) // อินสแตนซ์ของ Rectangle จะถูกสร้างขึ้น
}
