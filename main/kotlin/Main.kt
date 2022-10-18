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

    // ใช้คำสั่ง if ตรวจสอบว่าตัวแปรมีค่าเป็น null หรือไม่
    val x: Int? = 10
    if (x !== null) {
       println("x = $x")
    } else {
        println("x = null")
    }

    print("Enter number >>")
    val str: String? = readln()
    if (str != null) {
        val n: Double? = str.toDoubleOrNull()
        if (n !== null) {
            print("n = $n")
        } else {
            print("Error! can't convert to a number")
        }
    } else {
        print("Error!")
    }

}