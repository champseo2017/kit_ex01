import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
fun main(args: Array<String>) {
/*
    ฟังก์ชันการคำนวณ
    val radius = 10
    val circleArare = PI  * radius.pow(2)

    การสร้างเลขสุ่ม
    val a = Random.nextInt()
    val b = Random.nextInt(1000) // ได้เลขที่มีค่าน้อยกว่า 1000
    val c = Random.nextInt(100, 1000) // 100 - 999
    val d = Random.nextDouble() // 0.387
    val bool = Random.nextBoolean() // true false
    val bytes = Random.nextBytes(3)

    การจัดรูปแบบตัวเลข
    getInstance() 12345 => 12,345 หรือ 1141.59265 => 1,141.592
    getCurrencyInstance() -> มี $ หรือ ฿ นำหน้า มี , คั่นหลักพันให้ด้วย และ มีทศนิยม 2 ตำแหน่ง
    getIntegerInstance() จัดรูปแบบเฉพาะส่วนจำนวนเต็ม โดยมี , คั่นหลักพัน ทศนิยมถูกตัดทิ้ง
    getPercentInstance() จัดรูปแบบเป็นเปอร์เซ็นต์ คือ คูณด้วย 100 เช่น 0.75 -> 75%

    var numFormat = NumberFormat.getInstance()
    var str = numFormat.format(1234567.89)

    numFormat = NumberFormat.getCurrencyInstance()
    str = numFormat.format(2596530)
    println(str)

    val numFormat = NumberFormat.getInstance()
    numFormat.minimumIntegerDigits = 10
    numFormat.minimumFractionDigits = 4
    val str = numFormat.format(1234567.89)
    println(str)

    val num = numFormat.parse(str) // แปลงเป็นชนิดข้อมูลพื้นฐาน
    val x = num.toDouble()
    println(x)

    คลาส DecimalFormat

* */
    val pattern = "#,#"
    var decimalFormat = DecimalFormat()
    var str = decimalFormat.format(1234567)
    println(str)

    decimalFormat.applyPattern("00000")
    str = decimalFormat.format(123)
    println(str)

    decimalFormat.applyPattern("#.##%")
    str = decimalFormat.format(0.086)
    println(str)

    decimalFormat.applyPattern("00.00")
    str = decimalFormat.format(1.2)
    println(str)

}