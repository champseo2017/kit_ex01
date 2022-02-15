import java.util.*
// ฟังก์ชันที่ส่งค่ากลับแบบ Nullable
// ในบางครั้ง เราอาจจำเป็นต้องส่งค่า null คืนกลับออกจากฟังก์ชัน เช่น กรณีที่เกิดข้อผิดพลาด
// ในการทำงานหรือข้อมูลบางอย่างไม่ตรงตามเงื่อนไขที่ต้องการ
// 1. ที่ฟังก์ชัน ให้วางเครื่องหมาย ? ต่อท้ายชนิดข้อมูลผลลัพธ์ที่จะส่งกลับ
// 2. ภายในฟังก์ชัน ถ้ามีกรณีที่จะส่งค่า null ก็ใช้คำสั่ง return null ตามปกติ
//
fun thaiMonth(month: Int) : String ? { // วาง ? ต่อท้ายชนิดข้อมูลส่งกลับ
    val thaiMonths = arrayOf("มกราคม", "กุมภา")
    if (month in 1..12) {
        return thaiMonths[month - 1]
    } else {
        return null
    }
}
fun main(args: Array<String>) {
    // แนวทางการเรียกใช้ฟังก์ชันที่เป็น Nullable แบบต่างๆ
    val a: String? = thaiMonth(month = 1)
    if (a != null) {
        println(a)
    } else {
        println("Error")
    }

    val b = thaiMonth(month = 13) ?: "Error"
    println(b)

    val c = thaiMonth(month = 1)
    c?.let {
        print(it) // ฟังก์ชัน let เป็นแบบแลมบ์ดา จึงสามารถอ้างถึง it แทนพารามิเตอร์
    }


}