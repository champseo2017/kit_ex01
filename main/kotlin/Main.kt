import kotlin.random.*

/*

  การโอเวอร์ไรด์สมาชิกของ Subclass
  การโอเวอร์ไรด์พร็อปเพอร์ตี้ เหมือนกับการไปปิดบัง (hide) พร็อปเพอร์ตี้ตัวนั้น
  ใน Superclass ให้มองเห็นเป็นตัวใหม่ที่สร้างขึ้นใน Subclass แทน

  - ที่ Superclass ระบุโมดิฟายเออร์ open นำหน้าพร็อปที่สามารถโอเวอร์ไรด์ได้
  - Subclass ระบุโมดิฟายเออร์ override พร้อมกำหนดชื่อพร็อปเพอร์ตี้และชนิดข้อมูล
  ให้ตรงกับของ Superclass (ใช้ Type Inference ได้)

  - คอนสตรักเตอร์แบบพร็อปเพอร์ตี้ ใช้หลักการเดียวกัน


* */

 open class Java {
     open val version: Double = 15.0
     open val compiler = "Java Compiler"
     val fileExtension = ".java"
     val owner = "Oracle"
 }

 class Kotlin: Java() {
     override val version: Double = 2.0
     override var compiler = "Kotlin Compiler"
     // override val fileExtension = ".kt" // Error
     // val owner = "Jet" // Error
 }

 open class Device(open var os: String)
 class Smartphone(override var os: String) : Device(os)
 // ที่ Superclass ระบุโมดิฟายเออร์ open ดังนั้น ที่ Subclass จึงสามารถ
 // โอเวอร์ไรด์และกำหนดชื่อพร็อปเพอร์ตี้ให้เหมือนกันได้


fun main(args: Array<String>) {



}
