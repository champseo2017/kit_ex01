import java.util.*
import java.*;
import kotlin.random.*;

/*
   ขอบเขตของ Generic Type
   Type Constraint โดยอณุญาติให้เฉพาะคลาสที่สืบทอดมากจาก Type ที่ระบุเท่านั้น ที่สามารถนำมากำหนดเป็น
   Generic Type ได้ก็ให้ระบุ Generic Type เป็น <T: Supertype> เหมือนกับ Superclass
   เช่น เฉพาะคลาสที่สืบทอดมาจาก Number (เช่น Int, Double, Float เป็นต้น) เท่านั้นที่สามารถนำมาใช้ได้

   class Data<T: Number>(var value: T) {
   }

   // พารามิเตอร์แบบ Variable Argument สำหรับรับ Argument ที่มีจำนวนไม่แน่นอน
      - เข้าถึงแต่ละค่าด้วย array
      - ใน fun สามารถมีพารามิเตอร์แบบ Variable ได้เพียงอันเดียวเท่านั้น
      - summation(1, 2, 3, 4, 5)

   fun <T: Number>sum(vararg data: T): T {
    var total = 0.0
    for (x in data) {
        if (x is Int) {
          total += x.toDouble()
        } else if (x is Double) {
          total += x
        } else if (x is Float) {
          total += x
        }
    }
    return total as T
   }


* */

fun main(args: Array<String>) {

}
