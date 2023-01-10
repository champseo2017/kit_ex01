import java.util.*
import java.*;
import kotlin.random.*;
import kotlin.reflect.typeOf

/*

  ขอบเขตของ Generic Type
  - เป็นการกำหนด Generic Type ที่จะนำมาใช้ได้ หรือ เรียกว่า Type Constraint
  คือ การอณุญาติให้เฉพาะคลาสที่สืบทอดมาจาก Type ที่ระบุเท่านั้น ที่สามารถนำมากำหนด
  เป็น Generic Type ได้
  - ระบุเป็น <T:Supertype> เหมือน superclass เช่น สมมุติว่า เฉพาะคลาสที่สืบทอดมา
  จาก Number (เช่น Int, Double, Float เป็นต้น)

  - พารามิเตอร์แบบ variable Argument
    - Variable (Number Of)-Argument เป็น พารามิเตอร์ที่ใช้รับข้อมูลที่ไม่แน่นอน
    - การใช้งานวางคีย์เวิร์ด vararg ไว้หน้าชื่อพารามิเตอร์ เช่น vararg data: Int
    - เข้าถึงค่าแบบ array
    - ในฟังก์ชันหรือ class จะมี พารามิเตอร์แบบ vararg ได้เพียงตัวเดียว

* */

class Data<T: Number>(var value: T){}

fun <T: Number>sum(vararg data: T) : T {
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


fun main(args: Array<String>) {



}