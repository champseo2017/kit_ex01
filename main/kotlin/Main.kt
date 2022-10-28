import kotlin.random.*
/*

    การใช้คำสั่ง finally
    - คำสั่ง finally ใช้กำหนดบล็อกที่จะดำเนินการเสมอ ไม่ว่าจะเกิดข้อผิดพลาดหรือไม่ก็ตาม
    จะวางบล็อก finally ไว้ถัดจากบล็อก catch

    try {
    } catch (...) {
    } finally {
      // ทำเสมอไม่ว่าจะเกิดข้อผิดพลาดไหม
    }

    สามารถใช้แค่ try กับ finally โดยตัดบล็อก catch ออกไป
    try {
      ...
    } finally {
      ...
    }

    val bytes = Random.nextBytes(1)
    val b = bytes[0]
    try {
        val array = IntArray(b.toInt())
    } catch (ex: Exception) {
        println("Error")
    } finally {
        print("เลขที่สุ่มได้คือ: $b")
        // ดำเนินการเสมอ
    }

    นำ try-catch-finally ไปใช้แบบ Expression
     - คำสั่งใน finally จะไม่มีผลใดๆ
     - ไม่ควรใช้ finally ร่วมด้วย




* */

fun main(args: Array<String>) {

    val bytes = Random.nextBytes(1)
    val b = bytes[0]
    try {
        val array = IntArray(b.toInt())
    } finally {
        print("เลขที่สุ่มได้คือ: $b")
    }

}



