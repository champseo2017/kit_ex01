import kotlin.random.*
/*
    การใช้คำสั่ง throw
    - เป็นการส่งต่อข้อผิดพลาดไปให้ส่วนอื่นจัดการแทนได้
    โดยสร้าง Exception ที่เป็นของเราเอง ณ จุดที่เกิดเหตุ
    แล้วส่งออกไปโดยใช้คำสั่ง throw

    if (y == 0) {
     throw Exception("ตัวหารเป็นศูนย์ไม่ได้")
    }

    try {
        val y = 0
        if (y == 0) {
            throw Exception("ตัวหารเป็น 0 ไม่ได้")
        }
    } catch (ex: Exception) {
        print(ex.message)
    }

* */

fun main(args: Array<String>) {

    try {
        test() // ต้องเรียกฟังก์ชันที่โยนข้อผิดพลาดในบล็อก try
    } catch (ex: Exception) { // ข้อผิดพลาดถูกส่งต่อมาที่นี้
        print(ex.message)
    }


}

fun test() {
    val y = 0
    if (y == 0) {
        throw Exception("ตัวหารเป็น 0 ไม่ได้")
    }
}