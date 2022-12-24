import kotlin.random.*

/*

    การใช้ as? (Safe Cast Operator)
    - เป็นการแปลงชนิดข้อมูลที่ปลอดภัยกว่า เปลียนจาก as ไปใช้ as? แทน
    ซึ้ง as? คือ หากแปลง Type ไม่ได้ จะคืนค่า null ดังนั้นต้องนำวิธีการแบบ
    Nullable มาใช้ร่วมด้วย

* */
val a: Int = 10
val b: Double? = a as? Double // null
val c = "123"
val d: Int? = (c as? Int) ?: 0

fun test(x: Any) {
    var y: Double? = x as? Double
    val z: Int? = x as? Int
}

open class Tea
class IceTea : Tea()

fun main(args: Array<String>) {

 var t = Tea()
 var it: IceTea? = t as? IceTea // null


}
