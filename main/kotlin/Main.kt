import java.awt.Shape

/*

    การใช้งานตัวแปรที่เป็น Nullable
     - หากตัวแปรมีค่าเป็น null แต่เรานำไปใช้โดยไม่มีการตรวจสอบ
       อาจเกิดข้อผิดพลาดขึ้น เช่น
       var a: Int? = null
       a += 1 // Error

      - ใช้คำสั่ง if ตรวจสอบว่าตัวแปรมีค่าเป็น null หรือไม่
      - Elvis Operator (?:) กำนหดค่าดีฟอลต์สำหรับกรณีที่ตัวแปรนั้นมีค่าเป็น null
      - Not Null Assertion Operator (!!) ใช้กรณีที่เรามั่นใจว่าตัวแปรนั้น ไม่มีค่าเป็น null
      อย่างแน่นอน
      - call Safety (?) ใช้กับเมธอดหรือ พร็อปเพอร์ตี้ของออบเจ็ตก์ที่อาจคืนค่า null กลับมา
      - ?.let {} ใช้ Call Safety ร่วมกับ let ดำเนินการบางอย่าง
      หากตัวแปรนั้นไม่มีค่าเป็น null


* */


fun main(args: Array<String>) {

    // การใช้ Elvis Operator
    // หากตัวแปรมีค่าเป็น null ให้ใช้ข้อมูลอย่างอื่นแทนค่าของตัวแปร
    // เรียกว่าค่าดีฟอลต์ NullableVar ?: Default
    // NullableVar ตัวแปรที่มีโอกาสเป็น null ได้

    val a: Int? = null
    val x = a ?: 0 // หาก a เป็น null ตัวแปร x จะเท่ากับ 0
    // หากไม่เป็น null ตัวแปร x = a
    println(x)
    /*
    * เทียบเท่ากับ
    * val x = if (a != null) a else 0
    *
    * */

    val b: Double? = 1.23
    val y = b ?: -1.0
    println(y)

    print("Enter number >>")
    val input: String? = readLine()
    val str = input ?: ""

    val n1: Int? = 10
    val n2: Int? = null
    val n: Int
    n = (n1 ?: 0) + (n2 ?: -1)
    // n = 10 + (-1) = 9 เพราะ n2 มีค่าเป็น null

    val m = ("123".toIntOrNull() ?: 0) * 100
    println(m)

    val msg: String? = readLine()
    println(msg ?: "Error")

}