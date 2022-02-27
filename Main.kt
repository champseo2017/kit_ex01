import java.util.*
import java.*;
import kotlin.random.*;
// คอนสตรักเตอร์ของคลาส
// Primary Constructor แบบพร็อปเพอร์ตี้
// โดยทั่วไปใช้วิธีนี้กันเป็นส่วนใหญ่
class Circle(var radius: Int, val PI: Double = 3.14159) {
    fun getArea() = PI * radius * radius
    fun getPerimeter() = 2 * PI * radius
}
fun main(args: Array<String>) {
    val c1 = Circle(10)
    println(c1.getArea())

    val c2 = Circle(radius = 20, PI = 3.14)
    println(c2.getPerimeter())
    c2.radius = 30
    println(c2.getPerimeter())
    // c2.PI = 3.142 Error เพราะพร็อปเพอร์ตี้ PI กำหนดด้วย val
}
