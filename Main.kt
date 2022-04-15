import java.util.*
import java.*;
import kotlin.random.*;

/*
    โมดิฟายเออร์ private และ protected

    สมาชิกที่ระบุโมดิฟายเออร์ private จะไม่ถูกสืบทอดมายัง Subclass ดังนั้น จึงไม่สามารถเรียกใช้
    หรือโอเวอร์ไรด์ได้

    - protected มีการสืบทอดมายัง Subclass ตามปกติ แต่สามารถเข้าถึงได้เฉพาะจาก Subclass ของ
    มันเอง หรือ กล่าวได้ว่าคลาสที่ไม่อยู่ในลำดับชั้นการสืบทอด จะเข้าถึงสมาชิกที่มีโมดิฟายเออร์แบบ protected
    ไม่ได้


* */

open class Demo {
    protected var p1: Int = 0
    protected open var p2: Double = 0.0

    private fun m1() {}
    protected open fun m2() {}
}

class Dummy: Demo() {
    override var p2 = p1 + 0.5 // OK
    fun m1() {} // OK
    override fun m2() {} // OK
}

class Test {
    fun m() {
        var d = Dummy()
        d.m1()
        // d.m2() // Error
        // print(d.p2) // Error
    }

    // คลาส Test ไม่อยู่ในลำดับการสืบทอด จึงเรียกใช้ได้เฉพาะ m1() ส่วน m2() และ p2 มีโมดิฟายเออร์เป็น
    // protected
}

fun main(args: Array<String>) {

}
