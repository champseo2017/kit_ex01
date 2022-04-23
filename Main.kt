import java.util.*
import java.*;
import kotlin.random.*;

/*
    การแปลชนิดข้อมูลด้วย as และ as?
    การใช้ as? (Safe Cast Operator)

    as? คือ หากแปลง Type ไม่ได้ จะคืนค่า null
    ต้องนำวิธีการแบบ Nullable มาใช้ร่วมด้วย

* */

val a: Int = 10
val b: Double? = a as? Double // null
// Nullable      as? Safe Cast Operator
val c = "123"
val d: Int? = (c as? Int) ?: 0 // 0

fun test(x: Any) {
    var y: Double? = x as? Double
    val z: Int? = x as? Int
}

    open class Tea
    class IceTea: Tea()

fun main(args: Array<String>) {

    var t = Tea()
    var it: IceTea? = t as? IceTea // null


}
