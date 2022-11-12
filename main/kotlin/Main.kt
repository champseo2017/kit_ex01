import kotlin.random.*

/*

    โมดิฟายเออร์แบบ private
     - ใช้จำกัดสิทธิ์ให้สามารถเข้าถึงได้เฉพาะภายในคลาสของมันเองเท่านั้น
     ไม่อนุญาตให้เข้าถึงจากภายนอกคลาสได้ ปกติจะกำหนดให้กับสมาชิก ภายในคลาส
     เช่น เมธอด หรือ พร็อปเพอร์ตี้

     - หากเป็นพร็อปเพอร์ตี้ที่ใช้สำหรับการจัดเก็บข้อมูลอย่างเดียว (ไม่มีบล้อก get/set)
     เราควรป้องกันการเข้าถึงจากภายนอกคลาสด้วย private

     class Triangle {
    private var base: Int
    private var height: Int

    constructor(base: Int, height: Int) {
        this.base = if (base > 0) base else 0
        this.height = if (height > 0) height else 0
    }

    fun getArea(): Double = 0.5 * base * height
}

val t = Triangle(10, 15)
   // t.base = 12 // Error private prop


     ใช้ private กับ Primary Constructor แบบพร็อปเพอร์ตี้ มีผลในลักษณะเดียวกับ
     พร็อปเพอร์ตี้แบบปกติ

     class Circle(private var radius: Int) {
     init {
         radius = if (radius > 0) radius else 0
     }

     fun getArea() = 3.14 * radius * radius

     fun getPerimeter() = 2 * 3.14 * radius
 }

 val c = Circle(10)
    c.radius = 20 // Error private

    กำหนด private ให้แก่เมธอด ไม่สามารถเข้าถึงได้จากภายนอกคลาส

    class ThaiDate(private var day: Int,
                private var month: Int,
               private var year: Int) {

     init {
         if (!validDate(day, month, year)) {
             day = 0; month = 0; year = 0
         }
     }

     private val m = arrayOf("มกราคม")

     fun getMonthName(): String? {
         return if (month in 1..12) m[month - 1] else null
     }

     private fun validDate(d:Int, m:Int, y:Int): Boolean {
         return try {
             java.time.LocalDate.of(y, m, d)
             true
         } catch (ex: Exception) {
             false
         }
     }

 }

   ใช้ private กับ Primary Constructor แบบพร็อปเพอร์ตี้
    class Circle(private var radius: Int) {
     init {
         radius = if (radius > 0) radius else 0
     }

     fun getArea() = 3.14 * radius * radius

     fun getPerimeter() = 2 * 3.14 * radius
    }

     val c = Circle(10)
   // c.radius = 20 // Error private

* */




fun main(args: Array<String>) {



}
