/*
    โอเปอเรเตอร์ in และ !in

    in ใช้ในการตรวจสอบว่าค่าที่ระบุ อยู่ในกลุ่มข้อมูลนั้นหรือไม่
    !in ใช้ในทางตรงกันข้าม
    ตัวอย่างใช้กับ Range




* */

fun main(args: Array<String>) {

    val range = 1..10 step 2
    var b = 1 in range // true
    b = 10 in range // false
    b = 5 !in range // false
    b = 11 in 10..12 // true

}