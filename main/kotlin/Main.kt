/*

   การส่งผลลัพธ์กลับออกจากฟังก์ชัน

   - ที่ตัวฟังก์ชัน ให้วางเครื่องหมาย : ตามด้วยชนิดข้อมูลผลลัพธ์ที่จะกลับคืนไปไว้
   โดยให้อยู่ถัดจากวงเล็บที่ใช้กำหนดพารามิเตอร์

   - ในฟังก์ชันถ้าได้ผลลัพธ์มาแล้ว ให้ส่งผลลัพธ์กลับออกไปด้วยคำสั่ง return ตามด้วย
   ข้อมูลต้องเป็นชนิดเดียวกันกับที่ได้ระบุไว้หลังชื่อฟังก์ชัน

   fun ชื่อฟังก์ชัน(พารามิเตอร์: ชนิดข้อมูล, ...) : ชนิดข้อมูลผลลัพธ์ {
     คำสั่งต่างๆ
     return ผลลัพธ์
   }

   - ในส่วนที่เรียกใชฟังก์ชัน หากต้องการนำค่าจากฟังก์ชันไปใช้งาน
   ให้กำหนดตัวแปรมารับค่า และ ตัวแปรต้องเป็นชนิดเดียวกันกับที่ฟังก์ชัน
   จะส่งคืนมา


   - ถ้าไม่สร้างตัวแปรไปรับค่า สามารถเรียกฟังก์ชันแทนตัวแปรในตำแหน่ง
   ที่ต้องการใช้งานได้เลย

   - ถ้าเราเปรียบเทียบเงื่อนไขด้วย if หรือ when สามารถนำคำสั่ง
   return ไปใส่ไว้แต่ละเงื่อนไขได้เลย แต่ที่สำคัญคือ ต้องมีคำสั่ง else ต่อท้ายเสมอ
   ถ้าตัด else ออกจะ error

   fun max(num1: Int, num2: Int) : Int {

     if (num1 >= num2) {
       return num1
     } else if (num1 < num2) {
       return num2
     } else { // Error ถ้าไม่มี else
     }

   }

   fun numDaysOfMonth(month: Int, isLeapYear: Boolean) : Int {

      when(month) {
        1, 3, 5, 7, 8, 10, 12 -> return 31
        4, 6, -> return 30
        2 -> return if (isLeapYear) 29 else 28
        else -> return 0 // ไม่มีตรงนี้ error
      }

   }

   การเขียน return ในแบบ Condition Expression
   - คือ การเขียน return ในหน้า if หรือ when แล้วภายใน
   บล็อกหรือเงื่อนไขก็แค่ระบุค่าที่จะส่งกลับ

   fun min(num1: Int, num2: Int) : Int {
     return if (num1 <= num2) num1 else num2
   }

   fun result(myScore: Int, yourScore: Int) : String {

       return if (myScore > yourScore) {
         "I Win" // ส่งค่ากลับ
       } else if (myScore < yourScore) {
         "You Win"
       } else {
         "Draw"
       }

   }

   fun numDaysOfMonth(month: Int,
   isLeapYear: Boolean) : Int {

    return when (month) {
      1, 3 -> 31
      4 -> if (isLeapYear) 29 else 28
      else -> 0
    }

   }


* */

fun add(n1: Int, n2: Int) : Int { // ส่งข้อมูลกับเป็นชนิด Int
    val a = n1 + n2
    return a
}

fun thaiDayName(dayOfWeek: Byte) : String {
    val dayNames = arrayOf("อาทิตย์")
    if (dayOfWeek in 1..7) {
        return dayNames[dayOfWeek - 1] // - 1 เพื่อให้ตรงกับลำดับ array
    } else {
        return ""
    }
}

fun main(args: Array<String>) {

  val n: Int = add(10, 20) // n ต้องเป็นชนิด Int
  val m = add(40, 50) // m เป็นชนิด Int (Type Inference)

//  val friday = thaiDayName(6)
  println("วันนี้ ${thaiDayName(1)}")


}