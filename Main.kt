import java.util.*
// การตรวจสอบข้อผิดพลาดด้วย try-catch
// การตรวจสอบด้วย try-catch จะทำให้โปรแกรมทำงานช้ากว่าปกติ
/*
* จากโค้ด ที่ฟังก์ชัน getInt() เราใช้วิธี Recursion ซึ้งหากในบล็อก try มีข้อผิดพลาด
* ที่บล็อก catch ก็จะเรียกฟังก์ชันตัวมันเองคือ getInt() ขึ้นมาทำงานแบบวนซ้ำ จนกว่า
* จะไม่มีข้อผิดพลาดในบล็อก try (คำสั่งในบล็อก catch ไม่ถูกเรียก)
* ที่ฟังก์ชัน getDoucle() เราวางบล็อก try-catch ไว้ในลูป do-while ซึ้งหากในบล็อก
*  try มีข้อผิดพลาดเกิดขึ้น คำสั่ง break ที่ใช้ออกจากลูปจะไม่ถูกดำเนินการ และ loop
* จะดำเนินการเรื่อยๆ
* */
fun main(args: Array<String>) {
//    print("กรุณาใส่ตัวเลขจำนวนเต็ม >>")
//    try {
//        val str: String? = readLine()
//        val n = str?.toInt()
//        println("เลขที่กำหนดคือ $n")
//    } catch (ex: Exception) {
//        println("เกิดข้อผิดพลาด")
//    }
    // อย่างไรก็ตาม หากในบล็อก catch เราแค่แสดงข้อความว่าเกิดข้อผิดพลาด ก็คงไม่
    // ได้ช่วยอะไร และ หากเป็นข้อผิดพลาดที่แก้ปัญหาได้ก็อาจใช้วิธีดังต่อไปนี้
//    var i = getInt()
//    println("ขอบคุณครับ $i")
    var d = getDouble()
    println("ขอบคุณครับ $d")
}

fun getInt() : Int { // ฟังก์ชันนี้ใช้วิธี Recursion
    var str: String?
    var n: Int = 0
    print("กรุณาใส่ตัวเลขจำนวนเต็ม >>")
    try {
        str = readLine()
        n = str!!.toInt()
    } catch (ex: Exception) {
       getInt() // เรียกฟังก์ชันตัวมันเองขึ้นมาทำงานแบบ Recursion
    }
    return n
}

fun getDouble(): Double { // ฟังก์ชันนี้ใช้การวนลูป
    var str: String?
    var num: Double
    do {
        try {
            print("กรุณาใส่ตัวเลข >>")
            str = readLine()
            num = str!!.toDouble()
            break // หากไม่มีข้อผิดพลาดคำสั่ง break จะเป็นการออกจากลูป
        } catch (ex: Exception) {}
    } while (true)
    return num
}