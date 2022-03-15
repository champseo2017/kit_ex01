import java.util.*
import java.*;
import kotlin.random.*;
// คอนสตรักเตอร์กับการสืบทอด
// ตามหลักการของ Kotlin เมื่อสืบทอดจากคลาสใด ต้องส่งข้อมูลให้แก่คอนสตรักเตอร์ของ
// คลาสนั้นเสมอ ใน Kotlin อาจมีคอนสตรักเตอร์เป็นแบบ Primary และ Seconday ก็ได้
// โดยคลาสที่สืบทอด จึงต้องกำหนดวิธีการส่งข้อมูลให้สอดคล้องกัน
// กรณีที่ Superclass ไม่มีคอนสตรักเตอร์
// ทุกๆ คลลาสต้องมี Default Constructor เสมอ ไม่มีพารามิเตอร์ใดๆ คอมไฟเลอร์
// จะสร้างให้เองโดยอัตโนมัติ ดังนั้นถ้าเราสืบทอดจากคลาสที่ไม่มีคอนสตรักเตอร์แบบมีพารามิเตอร์

// 1. ใส่เป็นวงเล็บ () ว่างๆ ต่อท้ายชื่อ Superclass ซึ้งหมายถึงการเรียก Default Constructor
// ของ Superclass
// 2. สร้างคอนสตรักเตอร์แบบ Seconday แล้วระบุคำสั่ง super() ต่อท้าย
open class Person {
    // ไม่กำหนด Secondary Constructor
    // คลาสนี้ มีเฉพาะ Default Constructor
}
class Programmer: Person() {  // เรียก Default Constructor ของ Person
}
class Customer: Person {
    // Seconday constructor
    constructor(name: String) : super() { // เรียก Default Constructor

    }
}
class Guest: Person {
    // ถ้าในคอนสตรักเตอร์แบบ Secondary ไม่มีคำสั่งใดๆ ไม่ต้องเขียน {} ก็ได้
    constructor() : super()
}
fun main(args: Array<String>) {

}
