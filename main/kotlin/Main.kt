/*
    การเก็บข้อมูลในแบบ Pair

    - คือ การเก็บข้อมูลที่มีสมาชิก 2 ตัว หรือ ข้อมูลที่มีลักษณะเป็นคู่
    Pair(สมาชิกตัวที่ 1, สมาชิกตัวที่ 2)

    เมื่อเราต้องการอ่านค่าสมาชิกไปใช้งาน ให้อ้างอิงผ่านชื่อ first หรือ second
    สำหรับตัวแรกและตัวที่สองตามลำดับ



* */

fun main(args: Array<String>) {

    val size = Pair(50, 100)
    val width = size.first
    val height = size.second

    val name = Pair("James", "Bond")
    val msg = "Hi ${name.first} ${name.second}"

    val error = Pair(404, "Not Found")
    print("Error: ${error.first} - ${error.second}")

}