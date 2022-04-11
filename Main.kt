import java.util.*
import java.*;
import kotlin.random.*;

/*
    การโอเวอร์ไรด์สมาชิกของ Subclass

    การโอเวอร์ไรด์พร็อปเพอร์ตี้
    โอเวอร์ไรด์พร็อปเพอร์ตี้ (hide) พร็อปเพอร์ตี้ใน Superclass
    ให้มองเห็นเป็นตัวใหม่ที่สร้างขึ้นใน Subclass

    - ที่ superclass ต้องระบุโมดิฟายเออร์ open นำหน้าพร็อปเพอร์ตี้ที่สามารถโอเวอร์ได้
    - ที่ Subclass ต้องระบุโมดิฟายเออร์ override พร้อมกำหนดชื่อพร็อปเพอร์ตี้และชนิดข้อมูลให้ตรง
    กับของ Superclass (ใช้ Type Inference ได้)

    - คอนสตรักเตอร์แบบพร็อปเพอร์ตี้ หากมีการสืบทอดใช้หลักการเดียวกัน

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
    // override val fileExtension = ".kt" // Error - (1)
    // val owner = "JetBrains" // Error - (2)
}

open class Device(open var os: String)

class Smartphone(override var os: String) : Device(os) // OK
// คอนสตรักเตอร์แบบพร็อปเพอร์ตี้

fun main(args: Array<String>) {

}
