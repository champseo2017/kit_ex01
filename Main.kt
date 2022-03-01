import java.util.*
import java.*;
import kotlin.random.*;
// Secondary Constructor
// ที่ส่วนหัวของคลาส (Class Header) ไม่ต้องระบุการรับข้อมูลใดๆ
// ให้สร้างเมธอดพิเศษที่ต้องกำหนดชื่อเป็นคำว่า constructor เท่านั้น แล้วรับข้อมูลเข้า
// มาในคลาสผ่านทางเมธอดนี้ด้วยรูปแบบเดียวกับของพารามิเตอร์ของฟังก์ชัน
// ต้องสร้างพร็อปเพอร์ตี้เพื่อจัดเก็บข้อมูลที่รับเข้ามา ไม่ต้องกำหนดค่าเริ่มต้นให้กับพร็อปเพอร์ตี้
// เมธอด constructor จะถูกเรียกใช้งานโดยอัตโนมัติ เมื่อเราสร้างอินสแตนซ์ของคลาสนั้น
// แต่เราจะเรียกใช้งานโดยตรงเหมือนกับเมธอดทั่วๆ ไปไม่ได้

class Rectangle {
    var width: Int // ไม่จำเป็นต้องกำหนดค่าเริ่มต้น
    var height: Int
    constructor(width: Int, height: Int) {
        // นำค่าจากพารามิเตอร์ไปเก็บในพร็อปเพอร์ตี้
        // ถ้าตั้งชื่อ พารามิเตอร์เหมือนกับพร็อปเพอร์ตี้ ให้ใช้ this
        this.width = if (width > 0) width else 0
        this.height = if (height > 0) height else 0
    }
    fun getArea() : Int = this.width * this.height
}


fun main(args: Array<String>) {
    val rect = Rectangle(width = 10, height = 15)
    println(rect.getArea())
    rect.height = 20
    println(rect.getArea())
}
