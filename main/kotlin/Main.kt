/*
    การกำหนดพารามิเตอร์ขั้นพื้นฐาน

    fun ชื่อฟังก์ชัน(พารามิเตอร์: ชนิดข้อมูล, ...) {
      คำสั่งต่างๆ
    }

* */

fun main(args: Array<String>) {

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


}