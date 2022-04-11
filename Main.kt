import java.util.*
import java.*;
import kotlin.random.*;

/*
    Superclass มีทั้ง Primary และ Secondary Constructor
    ถ้าคลาสมีคอนสตรักเตอร์มากกว่า 1 อัน เมื่อสร้างอินสแตนซ์ของมันต้องกำหนดพารามิเตอร์ให้ตรงกับ
    รูปแบบของคอนสตรักเตอร์อย่างใดอย่างหนึ่งของคลาส

    การสืบทอด โดยที่ Subclass ต้องมีคอนสตรักเตอร์แบบ Primary หรือ Secondary อย่างน้อย 1 อัน

* */

open class Device(var os: String) {
    constructor(os: String, brandName: String): this(os) {

    }
}

class Tablet(var osName: String) : Device(osName) {
    // ส่งข้อมูลคอนสตรักเตอร์แบบ Primary ของคลาส Device
}

class Smartphone(var osName: String, var brandName: String)
    : Device(osName, brandName) {
        // ส่งข้อมูลให้แก่คอนสตรักเตอร์แบบ Secondary ของคลาส Device

}

class Phablet: Device {
    constructor(osName: String, brandName: String): super(osName) {
        // ส่งข้อมูลให้แก่คอนสตรักเตอร์แบบ Primary ของคลาส Device
    }
}

class Watch: Device {
    constructor(osName: String, brandName: String): super(osName, brandName) {

    }
    // ส่งข้อมูลให้แก่คอนสตรักเตอร์แบบ Secondary ของคลาส Device
}

// สามารถเลือกใช้ระหว่าง Primary และ Secondary

fun main(args: Array<String>) {

}
