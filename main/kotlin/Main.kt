import java.awt.Shape

/*

    Null Safety & Exception

    ลักษณะของค่า Null
     - ไม่มีค่าใดๆ
     - ไม่เท่ากับ 0
     - ไม่เท่ากับ Empty String ("") และ Blank String (" ")
     - ไม่เท่ากับ false
     - ไม่ตรงกับชนิดข้อมูลใดๆ

     ใน Kotlin ไม่สามารถนำค่า null ไปกำหนดให้กับตัวแปร หรือ ค่าคงที่ใดๆ โดยตรงได้
     เพราะ Null ไม่ตรงกับชนิดข้อมูลใดๆ เลย

     val a: Int = null // Error
     var b: String = "Hello"
     b = null // Error

     ใน Kotlin จะใช้วิธีการแบบ Null Safety สำหรับการกำหนดชนิดข้อมูลให้กับ
     ตัวแปรที่มีโอกาสเป็น null ได้ โดยวางเครื่องหมาย ? ต่อท้ายชนิดข้อมูลของ
     ตัวแปรหรือค่าคงที่นั้น เช่น

     var a: Int?
     var b: Double?
     val c: String?

     // ตัวแปร a, b, c เป็นแบบ Nullable คือ นอกจากจะเก็บข้อมูลตามชนิดของมันได้
     ปกติแล้ว ยังสามารถเป็นค่า null ได้

     var a: Int? = 123
     var b: Double? = 4.56
     val c: String? = null
     var d: Any? = null

     d = 100
     d = "Kotlin"
     d = true


* */


fun main(args: Array<String>) {




}