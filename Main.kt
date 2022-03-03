import java.util.*
import java.*;
import kotlin.random.*;
// ใช้ private กับ Primary Constructor แบบพร็อปเพอร์ตี้ ก็มีผลในลักษณะเดียวกับ
// พร็อปเพอร์ตี้แบบปกติ
class Circle(private var radius: Int) {
    init {
        radius = if (radius > 0) radius else 0
    }
    fun getArea() = 3.14 * radius * radius
    fun getPerimeter() = 2 * 3.14 * radius
}
fun main(args: Array<String>) {
    val c = Circle(10)
    // c.radius = 20 // Error เพราะ radius เป็นพร็อปเพอร์ตี้แบบ private
}
