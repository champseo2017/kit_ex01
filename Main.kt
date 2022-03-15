import java.util.*
import java.*;
import kotlin.random.*;
// กรณีที่ Superclass มีเฉพาะ Primary Constructor
// ถ้า Superclass มีเฉพาะคอนสตรักเตอร์แบบ Primary หากเราสืบทอดจากคลาสดังกล่าวที่
// Subclass ต้องกำหนดคอนสตรักเตอร์แบบ Primary หรือ Secondary ที่มีรูปแบบการรับข้อมูล
// ที่สอดคล้องกันกับคอนสตรักเตอร์ของ Superclass แล้วส่งข้อมูลดังกล่าวให้กับ Superclass
// พร็อปเพอร์ตี้ที่ส่งไปให้ supperclasss ต้องแตกต่างจาก Superclass

open class Device (var os: String) {

}
class Tablet(var osName: String) : Device(osName) {
    // ส่งพร็อปเพอร์ตี้ osName ให้แก่คอนสตรักเตอร์ของ Device
    // ต้องกำหนดชื่อพร็อปเพอร์ตี้ที่รับข้อมูลให้ต่างจากของ Superclass
}
class Smartphone(osName: String, brandName: String) : Device(osName) {
        // ส่งแค่พารามิเตอร์ osName ที่สอดคล้องกันให้แก่คอนสตรักเตอร์ของ Device
}
class Phablet: Device { // กรณีสร้างเป็น secondary constructor
    constructor(osName: String) : super (osName) {

    }
}
fun main(args: Array<String>) {

}
