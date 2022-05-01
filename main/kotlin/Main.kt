/*
    คอลเล็กชันประเภท Set
    Collection Type สำหรับจัดเก็บรายการข้อมูลที่ไม่ซ้ำกัน
    ทั้งนี้หากกำหนดอิลิเมนต์ซ้ำกับที่มีอยู่แล้ว อิลิเมนต์นั้นจะไม่ถูกเพิ่มเข้าไป แต่ไม่เกิดข้อผิดพลาด
    โดยเราแบ่งเซตออกเป็น 2 แบบคือ Mutable Set และ Immutable Set

    Set จะไม่คำนึงถึงลำดับของสมาชิก ดังนั้น เมธอดต่างๆ ของ Set จึงไม่มีอันไหนที่กำหนด
    เลขลำดับได้แต่ต้องอ้างถึงชื่อของสมาชิกโดยตรง แต่เราสามารถใช้ลูป for-in และ lterator
    ร่วมกับ Set ได้เช่นเดียวกับ List

* */

fun main(args: Array<String>) {

    // Mutable Set
    val rgb: Set<String> = mutableSetOf<String>("red", "green")
    val num: Set<Int?> = mutableSetOf(7, 11, null, 2, 1009)
    val char = mutableSetOf<Char>('a', 'b', 'c')
    val lang = mutableSetOf("Java", "Kotlin", "Swift", "Kotlin")
    // lang => ("Java", "Kotlin", "Swift")

    // Immutable Set
    val evenNum: Set<Int> = setOf<Int>(2, 4, 6, 8)
    val doubleNum: Set<Double> = setOf(1.2, 3.4, 5.6)
    val fruit = setOf<String>("apple", "banana", "coconut")
    val flower = setOf("rose", "orchid", "jasmine")

    val color = mutableSetOf("red", "green", "blue")
    color.add("yellow")
    if (color.contains("red")) {
        color.remove("red")
    }

//    for (c in color) {
//        println(c)
//    }

    val iter = color.iterator()
    while (iter.hasNext()) {
        println(iter.next())
    }

}