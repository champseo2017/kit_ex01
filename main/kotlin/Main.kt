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

   - Android SDK Platform คือ รายการหลักของแต่ละเวอร์ชั่น
   - รายการที่ลงท้ายด้วยคำว่า System Image คือ Android Emulator
   สำหรับทดสอบโปรเจ็กต์ที่เราสร้างขึ้นมา ควรจะเลือกรายการที่มีคำว่า Google Play,
   x86 หรือ x64



* */

interface Shape3D {
    val PI: Double // Abstract Property
    fun surfaceArea(): Int // Abstract Method
    fun volume(): Int
    fun shapeName(): String = this.javaClass.name
}


fun main(args: Array<String>) {



}
