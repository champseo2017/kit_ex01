import kotlin.random.*

/*

    Secondary Constructor
    - ส่วนหัวของคลาส ไม่ต้องระบุการรับข้อมูลใดๆ
    - สร้าง fun ที่กำหนดชื่อเป็น constructor เท่านั้น แล้วรับข้อมูลเข้ามาในคลาส
    ผ่านทางเมธอดนี้ด้วยรูปแบบเดียวกับของพารามิเตอร์ของฟังก์ชัน

    - สร้างพร็อปเพอร์ตี้เพื่อจัดเก็บข้อมูลที่รับเข้ามา การใช้งานใช้งานผ่านพร็อปเพอร์ตี้
    เหล่านั้น ไม่จำเป็นต้องกำหนดค่าเริ่มต้นให้กับพร็อปเพอร์ตี้

    class Rectangle {

    var width: Int
    var height: Int

    constructor(width: Int, height: Int) {
        this.width = if (width > 0) width else 0
        this.height = if (height > 0) height else 0
    }

    fun getArea(): Int = this.width * this.height
}

val rect = Rectangle(width = 10, height = 15)
  println(rect.getArea())
  rect.height = 20
  println(rect.getArea())

    - เมธอด constructor จะถูกเรียกใช้งานโดยอัตโนมัติ เมื่อสร้างอินสแตนซ์ของคลาสนั้น
    แต่ไม่สามารถเรียกใช้งานโดยตรงเหมือนเมธอดทั่วๆ ไปได้

    - เมธอด constructor สามารถเป็น Overload ได้

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
        // ไม่รับค่า height แต่ต้องกำหนดให้ครอบคลุมพร็อปเพอร์ต้ทุกตัว
    }

    fun getArea(): Int = this.width * this.height
}

val rect1 = Rectangle(width = 10, height = 15)
  println(rect1.getArea())

  val rect2 = Rectangle(width = 10)
  println(rect2.getArea())

  - ใช้ Primary Constructor แบบพร็อปเพอร์ตี้ ร่วมกับ
  Constructor แบบ Secondary
  class Rectangle(var width: Int, var height: Int) {
     constructor(width: Int) : this(width, width) {
         this.width = if (width > 0) width else 0
         this.height = if (width > 0) width else 0
     }
 }

 - ใช้ Primary Constructor แบบพารามิเตอร์ ร่วมกับ
  Constructor แบบ Secondary




* */

 class Rectangle(width: Int, height: Int) {
     var width: Int = width
     var height: Int = height

     constructor(width: Int) : this(width, width) {
         this.width = if (width > 0) width else 0
         this.height = if (width > 0) width else 0
     }
 }




fun main(args: Array<String>) {



}
