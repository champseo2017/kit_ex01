import java.util.*
import java.*;
import kotlin.random.*;
// คอนสตรักเตอร์ของคลาส
// Primary Constructor แบบพารามิเตอร์
// - รับข้อมูลเข้ามาในคลาสด้วยรูปแบบของพารามิเตอร์ โดยนำมาเขียนไว้ที่ส่วนหัวของคลาส
// คล้ายกับพารามิเตอร์ของฟังก์ชัน แต่ไม่ต้องระบุคีย์เวิร์ด var หรือ val เพราะไม่ใช้พร็อปเพอร์ตี้
// ต้องสร้างพร็อปเพอร์ตี้เพื่อจัดเก็บข้อมูลที่รับเข้ามาและการใช้งานต่างๆ ก็ทำผ่านพร็อปเพอร์ตี้เหล่านั้น

class Triangle(base: Int, height: Int) { // ไม่ต้องระบุคีย์เวิร์ด var หรือ val
    // สร้างพร็อปเพอร์ตี้ แล้วนำค่าจากพารามิเตอร์มากำหนดให้กับมัน
    // โดยใช้ชื่อพร็อปเพอร์ตี้ อาจเหมือนหรือต่างจากชื่อพารามิเตอร์ก็ได้
    var base: Int = base
    var height: Int = height

    fun getArea() = 0.5 * this.base * this.height
    // ใช้ this เพื่อความชัดเจนในการอ้างถึงพร็อปเพอร์ตี้ หรือจะไม่ใช้ this ก็ได้ เช่น
    // fun getArea() = 0.5 * base * height

}
fun main(args: Array<String>) {
    val t = Triangle(5, 10)
    println(t.getArea())
    t.base = 15
    t.height = 4
    println(t.getArea())
}
