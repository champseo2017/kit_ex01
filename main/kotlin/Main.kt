import kotlin.random.*

/*

    Inheritance & Interface

    Open Class และ การสืบทอด
     - คลาสที่จะสืบทอดได้ต้องระบุโมดิฟายเออร์ open กำกับเอาไว้
     - คลาสที่จะสืบทอดเรียกว่า Superclass หรือ Base Class
     - คลาสที่จะสืบทอด Base Class เรียกว่า Subclass
     - ใช้เครื่องหมาย : ในการสืบทอด

    class Subclass : Superclass () {
      ...
    }

    class NewClass : OldClass {
    }

    - Kotlin ไม่สนับสนุนการสืบทอดจากหลายคลาส (Multiple Inheritance)

    open class A {
    }

    open class B : A() {
    }

    class C : B() {
    }

    class D : C() {} // Error ไม่ระบุ โมดิฟายเออร์ open จึงสืบทอดไม่ได้

    ตัวอย่างของการไม่ใช้การสืบทอดของคลาส

    open class Person {

    var name: String = ""
    var yearBorn: Int = 0

    fun getAge() = java.time.LocalDate.now().year - yearBorn

}

// คลาส Person แทนลักษณะทั่วไปของบุคคล

class Programmer {
    var name: String = ""
    var yearBorn: Int = 0
    var salary: Int = 0
    var expertLanguage: String = ""
    fun getAge() = java.time.LocalDate.now().year - yearBorn
}

// คลาส Programmer แทนลักษณะของบุคคลที่เป็นโปรแกรมเมอร์

* */

open class Person {

    var name: String = ""
    var yearBorn: Int = 0

    fun getAge() = java.time.LocalDate.now().year - yearBorn

}

// คลาส Person แทนลักษณะทั่วไปของบุคคล

// ใช้วิธีการสืบทอด เพื่อลดความซ้ำซ้อนกับคลาส Person นั้นก็เพราะโปรแกรมเมอร์
// ก็เป็นบุคคลอีกประเภทหนึ่ง
class Programmer: Person() {
    var salary: Int = 0
    var expertlanguage: String = ""
}

// คลาส Programmer แทนลักษณะของบุคคลที่เป็นโปรแกรมเมอร์


fun main(args: Array<String>) {

    val pro = Programmer()
    pro.yearBorn = 1995
    println(pro.getAge())
    pro.salary = 50_000

    val per = Person()
    per.name = "James Gosling"
//    per.salary = 40_000 // Error เพราะคลาส Person ไม่มีพร็อปเพอร์ตี้นี้
//    per.expertLanguage = "Java" // Error เพราะคลาส Person ไม่มีพร็อปเพอร์ตี้นี้

}
