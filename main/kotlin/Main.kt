import kotlin.random.*

/*

   โมดิฟายเออร์ private และ protected
   - โมดิฟายเออร์ private ใช้ป้องกันการเข้าถึงสมาชิกจากภายนอกคลาส
   - โมดิฟายเออร์ private จะไม่ถูกสืบทอดมายัง Subclass จึงไม่สามารถโอเวอร์ไรด์ได้
   - โมดิฟายเออร์ protected มีการสืบทอดมายัง Subclass ตามปกติ แต่สามารถเข้าถึงได้
   เฉพาะจาก Subclass ของมันเอง หรือ คลาสที่ไม่อยู่ในลำดับชั้นการสืบทอด จะเข้าถึงสมาชิกที่มี
   โมดิฟายเออร์แบบ protected ไม่ได้

* */

open class Demo {
    protected var p1: Int = 0
    protected open var p2: Double = 0.0

    private fun m1() {}
    protected open fun m2() {}
}

class Dummy: Demo() {
    override var p2 = p1 + 0.5 // protected สามารถสืบทอดมายัง Subclass ได้
    fun m1() {} // private ไม่สามารถสืบทอดมายัง Subclass ได้ จึงเป็นการสร้าง fun ใหม่
    // ไม่ใช้การ override
    override fun m2() {} // protected สามารถสืบทอดมายัง Subclass ได้
}

class Test {
    fun m() {
        val d = Dummy()
        d.m1()
        d.m2() // Error class Test
        // ไม่อยู่ในลำดับการสืบทอด m2 มีโมดิฟายเออร์ protected จาก class Demo
        print(d.p2) // Error class Test
        // ไม่อยู่ในลำดับการสืบทอด m2 มีโมดิฟายเออร์ protected จาก class Demo
    }
}

fun main(args: Array<String>) {



}
