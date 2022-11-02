import kotlin.random.*

/*
    พร็อปเพอร์ตี้ของคลาส
    - การสร้างและจัดเก็บข้อมูลในพร็อปเพอร์ตี้
      - ต้องระบุค่าเริ่มต้น (Initial Value) ให้กับพร็อปเพอร์ตี้เสมอ
      - ถ้าไม่ระบุค่าเริ่มต้น ก็ต้องรับค่าเข้ามาทางคอนสตรักเตอร์ หรือ
      ใช้ร่วมกับคำสั่ง lateinit


* */

class Person {
    val firstName: String = "James"
    val lastName: String = "Bond"
    var phone: String? = "099123xxx"
    val birthday = Triple(31, 12, 2000)
    var spouseName: String? = null
    // var occupation: String // Error เพราะไม่กำหนดค่าเริ่มต้น
}


fun main(args: Array<String>) {
    val p = Person()
    println("Name: ${p.firstName} ${p.lastName}")

    val phone = p.phone ?: ""
    println("Phone: $phone")

    p.spouseName?.let {
        print("Spouse: $it")
    }

}
