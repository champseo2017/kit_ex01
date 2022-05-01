

/*
Generic Function อีกอันหนึ่งคือ arrayOfNulls<T>() ใช้ในการสร้่างอาร์เรย์
ที่สมาชิกแต่ละตัว มีค่าเริ่มแรกเป็น null
* */

fun main(args: Array<String>) {
    val str: Array<String?> = arrayOfNulls<String>(3) // 3 คือจำนวนสมาชิก
    // null, null, null
    val int = arrayOfNulls<Int>(4)
    int[0] = 0
    int[3] = 300
    println(int.joinToString(", "))
}