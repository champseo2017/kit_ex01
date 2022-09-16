/*
    การเก็บข้อมูลในแบบ Pair

    - คือ การเก็บข้อมูลที่มีสมาชิก 2 ตัว หรือ ข้อมูลที่มีลักษณะเป็นคู่
    Pair(สมาชิกตัวที่ 1, สมาชิกตัวที่ 2)

    เมื่อเราต้องการอ่านค่าสมาชิกไปใช้งาน ให้อ้างอิงผ่านชื่อ first หรือ second
    สำหรับตัวแรกและตัวที่สองตามลำดับ

    val size = Pair(50, 100)
    val width = size.first
    val height = size.second

    val name = Pair("James", "Bond")
    val msg = "Hi ${name.first} ${name.second}"

    val error = Pair(404, "Not Found")
    print("Error: ${error.first} - ${error.second}")

    นอกจากนี้ อาจสร้างตัวแปรด้วยชื่อที่ต้องการไว้ในวงเล็บ () เพื่อ
    ใช้แทนสมาชิกแต่ละตัวของ Pair

    val (latitude, longitude) = Pair(80.1234, 100.5678)

    print(latitude)

    val (firstname, lastname) = Pair("James", "Bond")

    print("Hi $firstname $lastname")



* */

fun main(args: Array<String>) {



}