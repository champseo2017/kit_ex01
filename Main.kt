import java.util.*
import java.*;
import kotlin.random.*;

// เช่น ต้องการสืบทอดจากคลาสที่ชื่อ OldClass ก็เขียนโ้ดได้ดังนี้
// class NewClass: OldClass () {}
// Kotlin ไม่สนับสนุนการสืบทอดจากคลาสคลาส (Multiple Inheritance) แต่ละคลาส
// จะสืบทอดได้เพียงคลาสเดียวเท่านั้น
// คลาสต่างๆ จะสืบทอดต่อเนื่องกันกี่ชั้นก็ได้ หากระบุโมดิฟายเอร์ open เช่น คลาส B สืบ
// ทอดจาก A และคลาส C สืบทอดจาก B เป็นต้น
/*
* open class A { // โมดิฟายเอร์ open เพื่อบ่งชี้ว่า คลาสนี้สามารถสืบทอดได้
* }
* open class B : A() {
* }
* class C : B() {
* }
*
* class D : C() {} // Error เพราะคลาส C ไม่ระบุโมดิฟายเออร์ open จึงสืบทอดไม่ได้
*
* สมมุติมี 2 คลาส คลาส Person และ Programmer
*
*
*
* */
open class Person {
    var name: String = ""
    var yearBorn: Int = 0
    fun getAge() = java.time.LocalDate.now().year - yearBorn
}
//class Programmer {
//    var name: String = ""
//    var yearBorn: Int = 0
//    var salary: Int = 0
//    var expertLanguage: String = ""
//    fun getAge() = java.time.LocalDate.now().year - yearBorn
//}
// จากโค้ด เราให้คลาส Person แทนคน คลาส Programmer แทนลักษณะของคนที่เป็น
// โปรแกรมเมอร์ จะเห็นว่า Person จะซ้ำกับ Programmer แต่หากเราเปลี่ยนมาใช้วิธีการสืบ
// ทอด โดยให้คลาส Programmer สืบทอดจากคลาส Person
class Programmer: Person() {
    var salary: Int = 0
    var expertLanguage: String = ""
}
fun main(args: Array<String>) {
    var pro = Programmer()
    pro.yearBorn = 1995
    println(pro.getAge())
    pro.salary = 50_000
}
