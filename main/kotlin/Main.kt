import java.awt.Shape

/*

    ฟังค์ชันที่ส่งค่ากลับแบบ Nullable
    - ที่ตัวฟังก์ชัน ให้วางเครื่องหมาย ? ต่อท้ายชนิดข้อมูลผลลัพธ์ที่จะส่งกลับ
    - ในฟังก์ชัน ถ้ามีกรณีที่จะส่งค่า null ก็ใช้คำสั่ง return null ตามปกติ
    - ส่วนที่เรียกใช้ฟังก์ชันวางเครื่องหมาย ? ต่อท้ายตัวแปร
    - จะนำตัวแปรที่รับค่าจากฟังก์ชันไปใช้ ต้องจัดการด้วยวิธี Null Safety


* */

fun thaiMonth(month: Int) : String? {
    val thaiMonths = arrayOf("มกราคม")
    if (month in 1..12) {
        return thaiMonths[month - 1]
    } else {
        return null
    }
}


fun main(args: Array<String>) {

    val a: String? = thaiMonth(month = 1)
    if (a != null) {
        print(a)
    } else {
        print("Error")
    }

    val b = thaiMonth(month = 13) ?: "Error"
    println(b)

    val c = thaiMonth(month = 1)
    c?.let {
        print(it) // let แลมบ์ดา สามารถอ้างถึง it แทนพารามเตอร์
    }


}