import kotlin.random.*

/*

    คอนสตรักเตอร์กับการสืบทอด
    - ตามหลักการของ Kotlin เมื่อสืบทอดจากคลาสใด ต้องส่งข้อมูลให้แก่คอนสตรักเตอร์
    ของคลาสนั้นเสมอ

    - กรณีที่ Superclass ไม่มีคอนสตรักเตอร์
      ความจริงแล้ว ทุกๆ คลาสต้องมี Default Constructor เสมอ คอมไพเลอร์จะสร้างให้เอง
      โดยอัตโนมัติ

    - การสืบทอดคอนสตรักเตอร์ โดยที่ BaseClass ไม่มีคอนสตรักเตอร์แบบ พารามิเตอร์
      ใส่เป็นวงเล็บ () ว่างๆ ต่อท้ายชื่อ Superclass หมายถึงการเรียก Default Constructor
      ของ Superclass

    - อีก 1 วิธีสร้างคอนสตรักเตอร์แบบ Secondary แล้วระบุคำสั่ง super() ต่อท้าย

    open class Person {
      // มีเฉพาะ Default Constructor
    }

    class Programmer: Person() { // เรียก Default constructor ของ Person
    }

    class Customer: Person { // ไม่ต้องมีวงเล็บ
     constructor(name: String) : super() {} // เรียก Default Constructor
    }

    class Guest: Person {
     // ในคอนสตรักเตอร์ ไม่มีคำสั่งใดๆ ไม่ต้องเขียนบล็อก {} ก็ได้
     constructor() : super()
    }

* */


fun main(args: Array<String>) {



}
