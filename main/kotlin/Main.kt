import kotlin.random.*

/*

    บล็อก get/set และ Backing Field
     - ดำเนินการบางอย่างเมื่อกำหนด หรือ อ่านค่าพร็อปเพอร์ตี้
       - การตรวจสอบข้อมูลที่รับเข้ามาก่อนจัดเก็บ
       - หรือ การประมวลผลบางอย่างก่อนจะส่งค่ากลับออกไป
       - ให้เพิ่มบล็อกต่อท้ายพร็อปเพอร์ตี้ดังนี้
         - บล็อก set {} สำหรับนำค่าจากภายนอกเข้ามาในคลาส
         - บล็อก get {} สำหรับส่งค่าออกไปยังภายนอกคลาส

       - บล็อก get/set อาจมีเพียงอย่างใดอย่างหนึ่ง เช่น มีเฉพาะ get
       เป็นต้น
       - บล็อก get/set จะไม่เก็บข้อมูลไว้กับมันโดยตรง มักใช้เพื่อเชื่อมโยง
       กับพร็อปเพอร์ตี้อื่น (Compute Property)

       - เช่น พร็อปเพอร์ตี้ formatBalance จะใช้ข้อมูลจากพร็อปเพอร์ตี้ balance

       class BankAccount {
         var balance: Double = 0.0
         val formatBalance: String // ไม่ต้องกำหนดค่าเริ่มต้น เพราะไม่เก็บข้อมูล
           get() {
             val f = java.text.DecimalFormat("#,###.00")
             return f.format(balance)
           }
       }

       - พร็อปเพอร์ตี้ที่มีบล็อก get/set สามารถเก็บข้อมูลได้ แก้ปัญหาด้วยการสร้าง
       Backing Field
        - กำหนดค่าเริ่มต้นให้กับพร็อปเพอร์ตี้ตามปกติ
        - ภายในบล็อก get/set ให้อ้างถึง Backing Field ด้วยตัวแปรพิเศษชื่อว่า field

* */

class BankAccount {
    var accountName: String = "James Bond"
    val accountNumber: String = "01-234567"
    var depositType: String = "Saving"
      get() = field // เมื่ออ่านค่าให้ส่งค่าจากฟิลด์กลับออกไป (ไม่มีก็ได้)
      set(value) {
          val t = arrayOf("Saving", "Fixed", "Current")
          if (t.indexOf(value) != -1) {
              field = value
          }
      }

    var atmCode: String = "123456"
        set(value) {
            if (value.trim().length == 6) {
                field = if (value.toIntOrNull() != null) value
                else field
            }
        }

    var balance: Double = 0.0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    val formatBalance: String
        get() {
            val f = java.text.DecimalFormat("#,###.00")
            return f.format(balance)
        }
}

fun main(args: Array<String>) {

}
