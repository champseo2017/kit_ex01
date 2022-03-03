import java.util.*
import java.*;
import kotlin.random.*;
// โมดิฟายเออร์แบบ private
// โมดิฟายเออร์แบบ private จะใช้เมื่อเราต้องกำจัดสิทธิ์ให้สามารถเข้าถึงได้เฉพาะภายใน
// คลาสของมันเองเท่านั้น แต่ไม่อณุญาติให้เข้าถึงจากภายนอกคลาส
// หากเป็นพร็อปเพอร์ตี้ที่ใช้สำหรับการจัดเก็บข้อมูลอย่างเดียว (ไม่มีบล็อก get/set)
// เราควรป้องกันการเข้าถึงจากภายนอกคลาสด้วย private เพื่อป้องกันปัญหาการกำหนด
// ข้อมูลที่ผิดหลักการ
/*
*  class Triangle {
*   private var base: Int
*   private var height: Int
*   constructor(base: Int, height: Int) {
*    this.base = if (base > 0) base else 0
*    this.height = if (height > 0) height else 0
*  }
*   fun getArea() : Double = 0.5 * base * height
* }
*
*
* */
class Triangle {
    private  var base: Int
    private  var height: Int
    constructor(base: Int, height: Int) {
        this.base = if (base > 0) base else 0
        this.height = if (height > 0) height else 0
    }
    fun getArea(): Double = 0.5 * base * height
}
fun main(args: Array<String>) {
  val t = Triangle(10, 15)
   //  t.base = 12  Error เพราะ base เป็นพร็อปเพอร์ตี้แบบ private
}
