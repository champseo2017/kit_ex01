import kotlin.random.*

/*

    Primary Constructor แบบพารามิเตอร์

    - รับข้อมูลเข้ามาในคลาสด้วยรูปแบบของพารามิเตอร์ เขียนไว้ที่ส่วนหัวของคลาส
    คล้ายกับพารามิเตอร์ของฟังก์ชัน ไม่ต้องระบุคีย์เวิร์ด var หรือ val เพราะไม่ใช้พร็อปเพอร์ตี้

    - ต้องสร้างพร็อปเพอร์ตี้เพื่อจัดเก็บข้อมูลที่รับเข้ามา การใช้งานก็ทำผ่านพร็อปเพอร์ตี้เหล่านั้น


* */

class Triangle(base: Int, height: Int) { // ไม่ต้องระบุ var หรือ val

    var base: Int = base
    var height: Int = height

    fun getArea() = 0.5 * this.base * this.height
    // ไม่ใช้ this
    // fun getArea() = 0.5 * base * height


}

fun main(args: Array<String>) {

  val t = Triangle(5, 10)
  println(t.getArea())
  t.base = 15
  t.height = 4
  println(t.getArea())

}
