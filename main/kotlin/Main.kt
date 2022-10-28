
/*

    การใช้ try-catch ในแบบ Expression
     - ใช้ในลักษณะ Expression การคืนค่าให้กับตัวแปร หรือ ฟังก์ชัน

     fun isValidDate(day: Int, month: Int, year: Int): Boolean {
    return try {
        LocalDate.of(year, month, day)
    } catch (ex: Exception) {
        false
    }
}

* */

fun main(args: Array<String>) {

    print("กรุณาใส่ตัวเลขจำนวนเต็ม >>")
    var str: String? = readLine()
    var n: Int = try {
        str!!.toInt()
    } catch (ex: Exception) {
        0 // เกิดข้อผิดพลาดส่ง 0 กลับไป
    }
    println(n)


}



