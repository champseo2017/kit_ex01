import java.util.*
import java.*;
import kotlin.random.*;

/*
    Generic Class
    เมื่อนำ Generic Class ไปใช้งาน ในขั้นตอนการสร้างอินสแตนซ์ต้องระบุชนิดข้อมูลที่แน่นอน
    ให้กับคลาส ถ้าไม่ระบุชนิดข้อมูล คอมไพเลอร์จะพิจารณาจากค่าที่กำหนดให้แก่คอนสตรักเตอร์

    หาก Type ที่จะกำหนดให้แก่ Generic Class ไม่ใช้ชนิดข้อมูลพื้นฐาน เราต้องกำหนดค่าเป็นอินสแตนซ์
    ของคลาสดังกล่าวให้กับคอนสตรักเตอร์

    class Data<T>(...) {...}
    class Test

    fun main() {
       val test = Test()
       val data1 = Data<Test>(test)
       val data2 = Data<Test>(Test())
       val data3 = Data(Test())
    }

    // อินสแตนซ์เดิมซึ้งได้กำหนดชนิดข้อมูล Generic Type เป็นอย่างใดอย่างหนึ่งไปแล้วไม่สามารถนำ
    มาสร้างเพื่อกำหนด Type ใหม่ได้ เหมือนกับเราเปลียนแปลงชนิดข้อมูลของตัวแปรไม่ได้

    var data = Data<Int>(value=123)
    data = Data<String>(value="Kotlin") // Error
    data = Data(value=true) // Error

    ในบางคลาสอาจมี Generic Type มากกว่า 1 ชนิด ซึ้งเราต้องแทนด้วยตัวอักษรที่แตกต่างกัน
    class Info<T, U, V>(val x: T, val y: U, val z: V) {
    }

    val error = Pair<Int, String>(404, "Not Found")
    // หรือเขียนเป็น Pair(404, "Not Found")

    val rgb = Triple<Int, Int, Int>(100, 150, 250)
    // Triple(100, 150, 250)

    - หลักการสืบทอดของคลาสที่เป็น Generic
      - ถ้า Superclass เป็น Generic แล้ว Subclass ก็ต้องเป็น Generic ด้วย
      - ถ้า Superclass ไม่เป็น Generic แต่ Subclass อาจเป็น Generic ก็ได้

      open class First<T> // คลาส First เป็น Generic
      class Second<T>: First<T>() // คลาส Second ต้องเป็น Generic ด้วย

      open class Third // คลาส Third ไม่เป็น Generic
      class Fourth<T>: Third() // คลาส Fourth อาจเป็น Generic ก็ได้

      open class Fifth<T: Number> // ดู T: Number ในเรื่อง Type Constraint
      class Sixth<T: Number>: Fifth<T>()

* */

    class Data<T>(value: T) {
        private var v = value as Any

         fun type() = v

        fun value(): T = v as T

        fun setValue(value: T) {
            v = value as Any
        }
    }

fun main(args: Array<String>) {
//    val data1: Data<Int> = Data<Int>(100)
//    val data2: Data<Double> = Data(12.34)
//    val data3 = Data<String>("Hello")
//    val data4 = Data(true) // มีชนิดข้อมูลเป็น Boolean
}
