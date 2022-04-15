import java.util.*
import java.*;
import kotlin.random.*;

/*
    การสร้างและใช้งานอินเทอร์เฟซ

    - อินเทอร์เฟซ (Interface) ประกอบด้วยเมธอด หรือ พร็อปเพอร์ตี้ โดยไม่ได้ระบุค่าและวิธีการดำเนินการ
    เอาไว้ เพื่อให้คลาสที่สืบทอดไปเป็นผู้กำหนดค่าและวิธีดำเนินการเอาเอง Interface คล้ายกับ Abstract
    ทั่วไปเราใช้อินเทอร์เฟซมากกว่าคลาสแบบ Abstract

    การสร้างอินเทอร์เฟซ
    หลักการสร้างอินเทอร์เฟซใน Kotlin มีดังนี้
     - รูปแบบพื้นฐานของอินเทอร์เฟซคือ
       interface ชื่ออินเทอร์เฟซ { // ชื่ออินเทอร์เฟซใช้หลักการเดียวกับชื่อคลาส
            // สมาชิกของอินเทอร์เฟซ
       }


     - ในแต่ละคลาส สามารถสือทอดอินเทอร์เฟสได้พร้อมกันมากกว่า 1 อัน
     คลาสกับคลาสสืบทอดจากคลาสอื่นได้เพียงอันเดียว

     - ในแต่ละคลาส สามารถสืบทอดพร้อมกันทั้งคลาสและอินเทอร์เฟซได้

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
    fun volume(): Int // Abstract Method
    fun shapeName(): String = "" // not Abstract method
}

// การสืบทอดและใช้งานอินเทอร์เฟซ
class Box (var w: Int, var l: Int, var h: Int): Shape3D {
    override var PI = 3.14
    override fun volume() : Int = w * l * h
    override fun surfaceArea() = (w * l * 2) + (w * h * 2) + (l * h * 2)
}

// อินเทอร์เฟซ สืบทอดจากอินเทอร์เฟซด้วยกันได้
interface  Login {
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
    override var firstName = "..."
    override var lastName = ""
}

fun main(args: Array<String>) {

    val b = Box(10, 20, 30)
    println(b.shapeName())
    println(b.volume())


}
