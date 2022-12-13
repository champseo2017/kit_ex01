import kotlin.random.*

/*

   การสร้างและใช้งานอินเทอร์เฟซ
   - Interface เป็นการกำหนดลักษณะโครงสร้างที่อาจประกอบด้วย เมธอด
   และ พร็อปเพอร์ตี้โดยไม่ได้ระบุค่า และ วิธีดำเนินการเอาไว้
   เพื่อให้คลาสที่สืบทอดไปเป็นผู้กำหนดค่าและวิธีดำเนินการเอาเอง

   - การสร้างอินเทอร์เฟซ
   interface ชื่ออินเทอร์เฟซ {
     // สมาชิก
   }
   - ไม่ต้องระบุโมดิฟายเออร์ open เป็น open โดยอัตโนมัติ
   - พร็อปเพอร์ตี้ห้ามกำหนดค่าเริ่มต้น
   - เมธอด ไม่กำหนดวิธีการทำงานใดๆ หรือ จะ กำหนดวิธีการทำงาน
   - อินเทอร์เฟซ สามารถสืบทอดจากอินเทอร์เฟซด้วยกันเองได้ แต่เมื่อจะนำไปใช้งาน
   ต้องสืบทอด ด้วยคลาสเหมือนเดิม

   interface Login {
     var email: String
     var password: String
   }

   interface User: Login {
     var firstName: String
     var lastName: String
     fun name() = "$firstName $lastName"
   }

   class Customer: User {
     override var email = "..."
     override var password = "..."
     override var firstname = "..."
   }

   - ในแต่ละคลาส สามารถสืบทอดอินเทอร์เฟซได้พร้อมกันมากกว่า 1 อัน คลาส กับ คลาส สามารถ
   สืบทอดจากคลาสอื่นได้เพียงอันเดียว
   - ในแต่ละคลาส สามารถสืบทอดพร้อมกันทั้งคลาสและอินเทอร์เฟซก็ได้

   interface OS
   interface Camera
   interface Display
   open class Device
   class Mobile: OS, Camera, Display
   class Smartphone: Device(), OS, Camera, Display

* */

interface Shape3D {
    val PI: Double // Abstract Property
    fun surfaceArea(): Int // Abstract Method
    fun volume(): Int
    fun shapeName(): String = this.javaClass.name
}

class Box (var w: Int, var l: Int, var h: Int): Shape3D {
    override var PI = 3.14
    override fun volume(): Int = w * l * h
    override fun surfaceArea() = (w * l * 2) + (w * h * 2) + (l * h * 2)
}


fun main(args: Array<String>) {

    val b = Box(10, 20, 30)
    println(b.shapeName())
    println(b.volume())
}
