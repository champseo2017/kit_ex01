import kotlin.random.*

/*
    กรณีที่ superclass มีทั้ง primary และ secondary constructor

    - ถ้าคลาสมีคอนสตรักเตอร์มากกว่า 1 อัน เมื่อสร้างอินสแตนซ์ของมันต้องกำหนด
    พารมมิเตอร์ให้ตรงรูปแบบของคอนสตรักเตอร์อันใดอันหนึ่งของคลาส ที่ subclass
    ต้องมีพารามิเตอร์แบบ Primary หรือ Secondary อย่างน้อย 1 อันที่สามารถส่งข้อมูล
    ที่สอดคล้องกันให้แก่คอนสตรักเตอร์อันใดอันหนึ่งของ superclass

    - สรุปส่งข้อมูลจาก subclass ไปยัง superclass อาจส่งจากคอนสตรักเตอร์แบบใด
    แบบหนึ่งก็ได้ระหว่าง Primary และ Secondary

* */

 open class Device(var os: String) {
     constructor(os: String, brandName: String) : this(os) {}
 }

 class Tablet(var osName: String) : Device(osName) {
     // ส่งข้อมูลแบบ Primary ของคลาส Device
 }

 class Smartphone(var osName: String, var brandName: String) :
     Device(osName, brandName) {
    // ส่งข้อมูลให้แก่คอนสตรักเตอร์แบบ Secondary ของคลาส Device
 }

 class Phablet : Device {
     constructor(osName: String, brandName: String) : super(osName) {
         // ส่งแบบ Primary ของคลาส Device
     }
 }

 class Watch : Device {
     constructor(osName: String, brandName: String)
             : super(osName, brandName) {
        // ส่งข้อมูลในแบบ secondary ของคลาส device
     }
 }


fun main(args: Array<String>) {



}
