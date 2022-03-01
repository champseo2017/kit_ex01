import java.util.*
import java.*;
import kotlin.random.*;

// เมธอด constructor อาจเป็น Overload ก็ได้
// นั่นคือ เราสามารถสร้างเมธอดด้วยชื่อเดี่ยวกันนี้ได้มากกว่า 1 อัน
// เพื่อรับข้อมูลในลักษณะที่ต่างๆ กัน เราต้องสร้างพร็อปเพอร์ตี้เพื่อจัดเก็บข้อมูลให้ครอบ
// คลุมพารามิเตอร์ทั้งหมดของเมธอด constructor ทุกอัน เช่น

class Rectangle {
    var width: Int
    var height: Int
    constructor(width: Int, height: Int) {
        this.width = if (width > 0) width else 0
        this.height = if (height > 0) height else 0
    }
    constructor(width: Int) {
        this.width = if (width > 0) width else 0
        this.height = if (width > 0) width else 0
        // แม้คอนสตรักเตอร์อันนี้ จะไม่รับค่า height เข้ามา
        //แต่เราต้องกำหนดค่าให้ครอบคลุมพร็อปเพอร์ตี้ทุกตัว
    }
    fun getArea() : Int = this.width * this.height
}


fun main(args: Array<String>) {
    val rect1 = Rectangle(width = 10, height = 15)
    println(rect1.getArea())
    val rect2 = Rectangle(width = 10)
    println(rect2.getArea())
}
