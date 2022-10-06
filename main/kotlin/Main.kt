/*

    ขอบเขตของตัวแปรที่อยู่ในและนอกฟังก์ชัน

* */

val a: Int = 99

fun test() {
    val b = 100
    println(a) // ok
    println(c) // ok ประกาศหลัง fun ก็สามารถเรียกใช้ได้
}

val c: Int = 101


fun main(args: Array<String>) {
    test()
    println(b) // Error เพราะ b ประกาศไว้ในฟังก์ชัน
}