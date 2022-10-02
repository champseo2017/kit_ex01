/*
    การกำหนดพารามิเตอร์ขั้นพื้นฐาน

    fun ชื่อฟังก์ชัน(พารามิเตอร์: ชนิดข้อมูล, ...) {
      คำสั่งต่างๆ
    }

    fun oddEven(num: Int) {
        if (num % 2 == 0) {
            print("Even")
        } else {
            print("Odd")
        }
    }

    fun repeatString(str: String, times: Int, separator: String) {
        if (str !== "" && times > 0) {
            var text = ""
            for (i in 1..times) {
                if (i > 1) {
                    text += separator
                }
                text += str
            }
            print(text)
        }
    }

    ใน Kotlin ไม่สามารถเปลี่ยนค่าของพารามิเตอร์
    ภายในฟังก์ชันโดยตรงได้ หากต้องการเปลียนพารามิเตอร์ใน function
    ให้สร้างตัวแปรด้วย var ขึ้นมาใหม่ภายในฟังก์ชัน จากนั้นกำหนดค่าของ
    พารามิเตอร์ให้กับมัน แล้วทำการเปลียนค่าของมันแล้วนำไปใช้แทนพารามิเตอร์

* */

fun main(args: Array<String>) {

    fun thaiLongDate(day: Int, month: Int, yearCE: Int) {
        var m = arrayOf("มกราคม")
        // yearCE += 543 Error
        var yearBE = yearCE
        yearBE += 543
        print("$day ${m[month-1]} $yearBE")
    }


}