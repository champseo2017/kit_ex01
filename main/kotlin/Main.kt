
/*

    การตรวจสอบข้อผิดพลาดด้วย try-catch

    try {
     // ช่วงที่ต้องการตรวจสอบข้อผิดพลาด
    } catch (ตัวแปร:ชนิดข้อผิดพลาด) {
      // การกระทำถ้าเกิดข้อผิดพลาด
    }

    print("กรุณาใส่ตัวเลขจำนวนเต็ม >>")

    try {
        val str: String? = readln()
        val n = str?.toInt()
        println("เลขที่กำหนดคือ $n")
    } catch (ex: Exception) {
        println("เกิดข้อผิดพลาด")
    }

    1. ใช้ try-catch ไว้ในลูป while หรือ do-while หากมีข้อผิดพลาดเกิดขึ้นให้
    วนลูปต่อไปเรื่อยๆ จนกว่าจะไม่มีข้อผิดพลาด

    2. เรียกใช้เมธอดแบบ Recursion

    หากต้องการแสดงข้อมูลของข้อผิดพลาดที่เกิดขึ้น
     - message ข้อความที่เป็นสาเหตุของข้อผิดพลาด
     - toString() ข้อความพร้อมคลาสที่เป็นสาเหตุของข้อผิดพลาด
     - printStackTrace()
       - พิมพ์รายละเอียดทั้งหมด

     การใช้งาน
     try {
     } catch (ex: Exception) {
       println(ex.message)
       println(ex.toString())
       ex.printStackTrace()
     }


* */

fun main(args: Array<String>) {

//    var i = getInt()
//    println(i)

    var d = getDouble()
    println("Hello")

}

fun getInt(): Int { // Recursion
    var str: String?
    var n: Int = 0
    print("กรุณาใส่ตัวเลขจำนวนเต็ม >>")
    try {
        str = readln()
        n = str!!.toInt()
    } catch (ex: Exception) {
        getInt() // เรียกฟังก์ชันตัวเองขึ้นมาทำงานแบบ Recursion
    }
    return n
}

fun getDouble(): Double {
    var str: String?
    var num: Double
    do {
        try {
            print("กรุณาใส่ตัวเลข >>")
            str = readln()
            num = str!!.toDouble()
            break // จะออกจากลูป
        } catch (ex: Exception) {}
    } while (true)

    return num
}