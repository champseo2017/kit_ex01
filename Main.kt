import java.util.*
import java.*;
import kotlin.random.*;
// การใช้คำสั่ง throw
// ถ้าเราโยนข้อผิดพลาดในฟังก์ชันอื่น จุดที่เรียกฟังก์ชันนั้นขึ้นมาทำงานต้องอยู่ในบล็อก try
// แล้วข้อผิดพลาดจะถูกส่งมายังบล็อก catch ที่ใช้คู่กัน
// Kotlin จะต้องเรียกฟังก์ชันที่มีการโยนข้อผิพลาดออกมาไว้ในบล็อก try เสมอ
fun main(args: Array<String>) {
    try {
        test()
    } catch (ex: Exception) {
        print(ex.message)
    }
}

fun test() {
    val y = 0
    if (y == 0) {
        throw Exception("ตัวหารเป็น 0 ไม่ได้")
    }
}
