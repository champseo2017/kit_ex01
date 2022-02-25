import java.util.*
import java.*;
import kotlin.random.*;

// บล็อก get/set และ Backing Field
// การตรวจสอบความถูกต้องของข้อมูลที่รับเข้ามาก่อนจัดเก็บ หรือ
// การประมวลผลบางอย่างก่อนจะส่งค่ากลับออกไป
// บล็อก set {} สำหรับนำค่าจากภายนอกเข้ามาในคลาส
// บล็อก get {} สำหรับส่งค่าออกไปยังภายนอกคลาส
// สำหรับ get/set อาจมีเพียงอย่างใดอย่างหนึ่ง พร็อปเพอร์ตี้ทีมีบล็อก get/set จะไม่เก็บ
// ข้อมูลไว้กับมันโดยตรง เรามักใช้กับการเชื่อมโยงกับพร็อปเพอร์ตี้อื่น
/*
*  class BankAccount {
*   var balance: Double = 0.0
*   val formatBalance: String // ไม่ต้องกำหนดค่าเริ่มต้น เพราะไม่เก็บข้อมูล
*   get() {
*     val f = java.text.DecimalFormat("#,###.00")
*     return f.format(balance)
*   }
* }
*
*
* */


fun main(args: Array<String>) {

}
