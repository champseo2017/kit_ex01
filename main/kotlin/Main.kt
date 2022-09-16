/*
    การเก็บข้อมูลในแบบ Triple

    - คือการเก็บข้อมูลที่มีสมาชิก 3 ตัว
    Triple(สมาชิกตัวที่ 1, สมาชิกตัวที่ 2, สมาชิกตัวที่ 3)

    - เมื่อต้องการอ่านค่าสมาชิกไปใช้งาน อ้างอิงผ่านชื่อ first, second หรือ third
    - หรือ สร้างตัวแปร แล้วตามด้วยลำดับสมาชิกในวงเล็บ

    val boxSize = Triple(10, 20, 30)
    val volume = boxSize.first * boxSize.second * boxSize.third

    val (date, month, year) = Triple(1, "มกราคม", 2563)
    println("วันนี้เป็นวัน $date $month $year")

    val (hour, minute, _) = Triple(12, 30, 0)
    println("ขณะนี้เวลา $hour:$minute")

    - ตัวแปรใดที่ไม่ได้นำไปใช้งาน อาจแทนตัวแปรนั้นด้วยเครื่อหมาย _

* */

fun main(args: Array<String>) {



}