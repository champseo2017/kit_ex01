import java.util.*
import java.*;
import kotlin.random.*;

/*
    การแปลชนิดข้อมูลด้วย as และ as?
    การใช้ as (Unsafe Cast Operator)
    เราควรใช้ as เมื่อแน่ใจจริงๆ ว่าสามารถแปลงชนิดข้อมูนนั้นๆได้
    ไม่เช่นนั้น จะเกิด Error

    val a: Int = 10
    val b: Double = a as Double // Runtime Error
    val c = "123"
    val d = c as Int // Runtime Error

    var x: Any = 12.34
    x++ // Error ชนิด Any คำนวณไม่ได้
    var y = x as Double // OK
    y++ // OK
    val z = x as Int // Runtime Error

* */

    open class Tea
    class IceTea: Tea()

fun main(args: Array<String>) {

    var it = IceTea()
    var t: Tea = it as Tea // OK (Subclass => Superclass)
    var t2 = Tea()
    var it2: IceTea = t2 as IceTea // Error (Super => Sub)


}
