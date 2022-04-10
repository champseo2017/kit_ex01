import java.util.*
import java.*;
import kotlin.random.*;

/* คอนสตรักเตอร์กับการสืบทอด
ตามหลักการของ Kotlin เมื่อสืบทอดจากคลาสใด ต้องส่งข้อมูลให้แก่คอนสตรักเตอร์ของคลาสนั้นเสมอ

* กรณีที่ Superclass ไม่มีคอนสตรักเตอร์
* ทุกๆ คลาสต้องมี Default Constructor เสมอ ซึ้งลักษณะของมันคือ ไม่มีพารามิเตอร์
* ใดๆ คอมไฟลเลอร์จะสร้างให้เองโดยอัตโนมัติ
* 1. ใส่เป็นวงเล็บ () ว่างๆ ต่อท้ายชื่อ Superclass ซึ้งหมายถึงการเรียก Default Constructor
    ของ Superclass

  2. สร้างคอนสตรักเตอร์แบบ Secondary แล้วระบุคำสั่ง super() ต่อท้าย
*
* */

open class Person {
    // คลาสนี้มีเฉพาะ Default Constructor
}

class Programmer : Person() { // เรียก Default Constructor ของ Person
}

class Customer : Person { // ไม่ต้องมีวงเล็บ ()
    constructor(name: String) : super() {} // เรียก Default Constructor
}

class Guest : Person {
    // ถ้าในคอนสตรักเตอร์แบบ Secondary ไม่มีคำสั่งใดๆ ไม่ต้องเขียน {} ก็ได้
    constructor() : super()
}

fun main(args: Array<String>) {

}
