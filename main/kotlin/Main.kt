/*
    การวนลูปด้วยฟังก์ชัน repeat

    - วนลูปให้ครบตามจำนวนครั้งที่กำหนด โดยไม่ได้นำค่าตัวแปรของลูปไปใช้งานใดๆ
    repeat (จำนวนครั้ง) {
       คำสั่งต่างๆ
    }
    repeat(5) {
        println("Kotlin")
    }

    - ตัวอย่าง นำเลขฐานมาคูณกันเป็นจำนวนครั้งเท่ากับเลขชี้กำลัง
    2 กำลัง 3 = 2 x 2 x 2
    val base: Int = 10
    val power: Int = 3

    if (power >= 0) {
        var result = 1
        repeat(power) {
            result *= base
        }
        print("$base ^ $power = $result")
    } else {
        print("เลขชี้กำลังต้องมากกว่าหรือเท่ากับศูนย์")
    }

* */

fun main(args: Array<String>) {


}