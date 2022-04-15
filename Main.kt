import java.util.*
import java.*;
import kotlin.random.*;

/*
    Abstract Class
    Abstract Class เป็นรูปแบบของคลาสอีกประเภทหนึ่ง ซึ่งเราอาจไม่ต้องกำหนดค่าหรือวิธีการทำงาน
    ที่ครบสมบูรณ์ทั้งหมด ทั้งนี้ก็เพื่อให้ผู้ใช้คลาส นำไปกำหนดค่าหรือวิธีการทำงานเพิ่มเติมเอาเอง

    - คลาสที่เป็นแบบ Abstract มีข้อกำหนดคือ
      - ระบุคีย์เวิร์ด abstract ไว้ก่อนคำว่า class เสมอ เพื่อบ่งบอกว่าเป็นคลาสแบบ Abstract แต่ไม่จำเป็น
      ต้องระบุคำว่า open เพราะคลาสประเภทนี้สามารถสืบทอดได้โดยปริยายอยู่แล้ว เช่น abstract class Test

      - ภายในคลาส อาจมีสมาชิกทั้งแบบปกติ คือ
        - พร็อปเพรอร์ตี้ที่ระบุค่าเริ่มต้น
        - เมธอดที่กำหนดวิธีทำงาน
        - รวมทั้งสมาชิกแบบ Abstract
          - ระบุคีย์เวิร์ด abstract ไว้หน้า var/val หรือ func แต่ไม่จำเป็นต้องมีไมดิฟายเออร์ open
          เพราะสมาชิกประเภทนี้ต้องถูกโอเวอร์ไรด์ได้อยู่แล้ว
          - หากเป็นพร็อปเพอร์ตี้ ไม่ต้องกำหนดค่าให้กับมัน และ หากเป็นเมธอด
            ก็ไม่ต้องกำหนดวิธีการทำงานให้กับมัน


      - เราไม่สามารถสร้างอินสแตนซ์ของคลาสที่เป็น Abstract ได้ ต้องสืบทอดแล้วใช้งานผ่าน Subclass
      เท่านั้น โดยคลาสที่จะสืบทอดจาก Abstract Class และสามารถนำไปใช้งานได้ ต้องโอเวอร์ไรด์สมาชิก
      ที่เป็น Abstract ให้ครบทั้งหมด ส่วนสมาชิกที่ไม่เป็น Abstract ใช้วิธีปกติ


* */

abstract class Shape3D {
    abstract val PI: Double
    private var color: String? = null

    abstract fun surfaceArea() : Int // Abstract Method
    abstract fun volume() : Int // Abstract Method
    fun shapeName() : String = "GGwp"
}

class Box(var w: Int, var l: Int, var h: Int) : Shape3D() {
    /*
    * ต้องโอเวอร์ไรด์สมาชิก
      ที่เป็น Abstract ให้ครบทั้งหมด
    * */
    override var PI = 3.14
    override fun volume() : Int = w * l * h
    override fun surfaceArea() = (w * l * 2) + (w * h * 2) + (l * h * 2)
}

fun main(args: Array<String>) {
    val b = Box(10, 20, 30)
    println(b.shapeName())
    println(b.volume())
    // val shape = Shape3D() // Error จะใช้งาน Abstract Class โดยตรงได้
}
