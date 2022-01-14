import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
fun main(args: Array<String>) {
/*
    การระบุชื่ออาร์กิวเมนต์
    Named Argument

* */
    showInfo(married = true, name = "John", salary = 30_000, age= 30)
    // OK กำหนดชื่ออาร์กิวเมนต์ครบทุกตัว จึงสามารถสลับตำแหน่งได้

    // Error showInfo(Married=true, name="John", salary=30_000, age=30)
    // Error เพราะรูปแบบตัวพิมพ์ของชื่ออาร์กิวเมนต์ ไม่ตรงกับของพารามิเตอร์

    // showInfo(married=true, "John", 30_000, age=30)
    // Error อาร์กิวเมนต์ทุกตัวที่ไม่ระบุชื่อ ต้องอยู่ก่อนตัวระบุชื่อ

    showInfo("John", 30, married=true, salary = 30_000)
    // OK อาร์กิวเมนต์ทุกตัวที่ไม่ระบุชื่อ ต้องจัดเรียงเหมือนพารามิเตอร์
    // และอยู่ก่อนตัวที่ระบุชื่อทั้งหมด ซึ้งตัวที่ระบุชื่อสามารถสลับตำแหน่งกันได้

}

    fun showInfo (name: String, age: Int, married: Boolean, salary: Int) {
        val m = if (married) "แต่งงานแล้ว" else "โสด"
        print("ชื่อ: $name, อายุ: $age, สถานภาพ: $m, เงินเดือน: $salary")
    }