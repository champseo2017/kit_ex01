/*
    การใช้คำสั่ง when
    มีแนวทางคล้ายคำสั่ง switch

    when (ตัวแปร) {
        เงื่อนไข 1 -> การกระทำ เมื่อเงื่อนไข 1 เป็นจริง
        เงื่อนไข 2 -> การกระทำ เมื่อเงื่อนไข 2 เป็นจริง
        else -> การกระทำ เมื่อเงื่อนไขทั้งหมดไม่เป็นจริง
    }
    val ext = ".kt"
    when (ext) {
        ".kt" -> print("Kotlin File")
        ".java" -> print("Java File")
        else -> print("Unknown")
    }

    หากมีหลายเงื่อนไขสามารถรวมเป็นเงื่อนไขเดียวกัน แล้วคั่น
    ด้วยเครื่องหมาย , เช่น
    val country = "Mexico"
    when (country) {
        "UK", "USA", "AUS" -> print("English")
        "Spain", "Mexico" -> print("Mexico")
        else -> print("No country")
    }

    สามารถใช้โอเปอเรเตอร์ทางตรรกะ เช่น ==, !=, >, <

    val date = 1
    val month = 10

    when {
        date == 1 && month == 1 -> print("วันขึ้นปีใหม่")
        date == 14 && month == 2 -> print("วันวาเลนไทน์")
        date >= 13 && date <= 15 && month == 4 -> print("วันสงกรายต์")
        date == 1 || date == 16 -> print("วันนี้รวย")
    }

    กรณีเป็นช่วงข้อมูลต่อเนื่องกัน ใช้โอเปอเรเตอร์ .. หรือ downTo หรือ until
    ร่วมกับ in หรือ !in เช่น
    val score = 75
    var grade = 'F'

    when (score) {
        in 80..100 -> grade = 'A'
        in 79 downTo 60 -> grade = 'B'
        in 0 until 60 -> grade = 'F'
        !in 0..100 -> {
            print("Score Error",)
        }
    }

    print(grade)

    ใช้โอเปอเรเตอร์ is หรือ !is เพื่อเปรียบเทียบชนิดข้อมูล

    var a: Any = 123.45F
    var result: Int

    when (a) {
        is String -> result = a.toDouble().toInt()
        is Double -> result = a.toInt()
        is Float -> result = a.toInt()
        else -> result = 0
    }

    print(result)

    - ใช้ when แบบ Expression กำหนดค่าให้กับตัวแปรเช่นเดียวกับ if-else เช่น
    val device = "Oppo"
    val os = when (device) {
        "Oppo", "Vivo" -> "Android"
        "iPhone" -> "iOS"
        "iPad" -> "iPadOS"
        else -> "Unknown"
    }

    print(os)

* */

fun main(args: Array<String>) {



}