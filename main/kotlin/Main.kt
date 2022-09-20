/*
   การตรวจสอบสตริงว่าง

   isEmpty() เป็นสตริงว่าง ("") หรือไม่ ถ้าใช้จะคืนค่า true
   isNotEmpty() ไม่ เป็นสตริงว่างใช้หรือไม่ (ตรงข้ามกับ isEmpty)
   isNullOrEmpty() เป็นค่า null หรือสตริงว่าง หรือไม่ ถ้าใช้จะคืนค่า true
   isBlank() เป็นสตริงที่ไม่มีอักขระใดๆ เลย ใช้หรือไม่ ถ้าใช้จะคืนค่า true
   isNotBlank() ไม่มีสตริงที่ไม่มีอักขระใดๆ เลย ใช้หรือไม่
   isNullOrBlank() เป็นค่า null หรือสตริงที่ไม่มีอักขระใดๆ เลย หรือไม่ ถ้าใช้จะคืนค่า true

   val str1 = "" // สตริงว่าง
    val a = str1.isEmpty() // true
    val b = str1.isBlank() // true

    val str2 = " " // ช่องว่าง 1 ช่องขึ้นไป
    val c = str2.isEmpty() // false
    val d = str2.isBlank() // true

    val str3 = "" // หากในสตริงมีอักขระที่ไม่มีรูปร่างหน้าตา
    val e = str2.isEmpty() // false
    val f = str3.isBlank() // true
    val g = " \n".isBlank() // true

    val h = " _ ".isBlank() // false

* */

fun main(args: Array<String>) {




}