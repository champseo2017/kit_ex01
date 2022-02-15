import java.util.*
// การใช้วิธี Not Null Assertion Operator
// ถ้าเรามั่นใจว่าตัวแปรดังกล่าว จะไม่เป็น null อย่างแน่นอน ก็สามารถจัดการด้วยโอเปอเรเตอร์
// Not Null Assertion (!!) แทนวิธีการอื่นๆ วิธีนี้ต้องแน่ใจจริงๆ ว่าตัวแปรนั้นไม่เป็นค่า null

fun main(args: Array<String>) {
//    // วางโอเปอเรเตอร์ !! ไว้หลังตัวแปรแบบ Nullable และสามารถใช้งานเหมือนกับตัวแปร
//    // ทั่วไปได้เลยโดยไม่ต้องตรวจสอบอีก เช่น
//    val a: Int? = 10
//    val b: Int? = 20
//    val c: Int = a!! + b!!
//    // อาจใช้โอเปอเรเตอร์  !!  ร่วมกับ . ในการเรียกเมธอดของตัวแปรนั้นแทนการใช้โอเปอเรเตอร์
//    // Safe Call เช่น
//    val str: String? = "123"
//    val x: Int = str!!.toInt()
//    print(x)

}