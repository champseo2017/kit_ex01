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

   การสร้างโปรเจ็กต์ใน Android Studio แบบ Empty Activity
   - Empty Activity เป็นโปรเจ็กต์ที่มีโครงสร้างเพียง 1 หน้าจอ



* */

interface Shape3D {
    val PI: Double // Abstract Property
    fun surfaceArea(): Int // Abstract Method
    fun volume(): Int
    fun shapeName(): String = this.javaClass.name
}


fun main(args: Array<String>) {



}
