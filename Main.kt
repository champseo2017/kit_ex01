import java.util.*
import java.*;
import kotlin.random.*;

/* กรณีที่ Superclass มีเฉพาะ Primary Constructor
หากเราจะสืบทอดจากคลาสดังกล่าว ที่ Subclass ต้องกำหนดคอนสตรักเตอร์แบบ Primary หรือ Secondary ที่มีรูปแบบ
การรับข้อมูลสอดคล้องกับคอนสตรักเตอร์ของ Superclass แล้วส่งข้อมูลดังกล่าวให้กับ Superclass

* */

// พร็อปเพอร์ตี้ที่ Subclass ต้องกำหนดชื่อพร็อปเพอร์ตี้ให้แตกต่าง
open class Device(var os: String) {

}

class Tablet(var osName: String) : Device(osName) {
    // ส่งพร็อปเพอร์ตี้ osName ให้แก่คอนสตรักเตอร์ของ Device
    // ต้องกำหนดชื่อพร็อปเพอร์ตี้ที่รับข้อมูลให้ต่างจากของ Superclass
}

class Smartphone(osName: String, brandName: String) : Device(osName) {
    // ส่งแค่พารามิเตอร์ osName ที่สอดคล้องกันให้แก่คอนสตรักเตอร์ของ Device
    // หรือจะกำหนดเป็นพร็อปเพอร์ตี้ก็ได้
}

class Phablet: Device { // กรณีสร้างเป็น secondary constructor
    constructor(osName: String) : super(osName) {
    }
}

fun main(args: Array<String>) {

}
