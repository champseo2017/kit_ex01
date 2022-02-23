import java.util.*
import java.*;
// การใช้ try-catch ในแบบ Expression
// เราอาจใช้คำสั่ง try-catch ในลักษณะของ Expression เช่น การคืนค่าให้กับตัวแปร
// หรือฟังก์ชัน เหมือนกับกรณีของ if-else หรือ when เช่น
fun main(args: Array<String>) {
    print("กรุณาใส่ตัวเลขจำนวนเต็ม >>")
    var str: String? = readLine()
    var n: Int = try {
        str!!.toInt()
    } catch (ex: Exception) {
        0 // หากเกิดข้อผิดพลาด ให้ส่งค่า 0 กลับไป
    }
    println(n)
}

fun isValidDate(day: Int, month: Int, year: Int) : Boolean {
    return try {
        java.time.localDate.of(year, month, day)
        true
    } catch (ex: Exception) {
        false
    }
}