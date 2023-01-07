import java.util.*
import java.*;
import kotlin.random.*;

/*
*  คลาสแบบ Generic
*  Generic Class เป็นการสร้างคลาสที่สามารถรองรับและจัดการข้อมูลได้หลายชนิด
*
*  - ใน Kotlin จะมี default type เป็นชนิด any อาจมีปัญหาเรื่อง Nullable ในขณะรัน
* หากเรานำอินสแตนซ์ของ Generic Type ไปใช้งานโดยตรง ลองแปลงจาก Generic Type
* ไปเป็นชนิด Any
*
* - เมื่อนำ Generic class ไปใช้งานในขั้นตอนการสร้างอินสแตนว์ต้องระบุชนิดข้อมูลที่แน่นอนให้กับคลาส
*  ซึ้งสามารถกำหนดได้หลายแบบ หรือ ถ้าไม่ระบุชนิดข้อมูล คอมไพเลอร์จะพิจารณาจากค่าที่กำหนดให้แก่คอน
* สตรักเตอร์
*
* val data1: Data<Int> = Data<Int>(100)
  val data2: Data<Double> = Data(12.34)
  val data3 = Data<String>("Hello")
  val data4 = Data(true) // มีชนิดข้อมูลเป็น Boolean
  print(data1.type())

  - Type ที่จะกำหนดให้แก่ Generic class ไม่ใช้ชนิดข้อมูลพื้นฐาน เราต้องกำหนดค่าเป็นอินสแตนซ์
  ของคลาสดังกล่าวให้กับคอนสตรักเตอร์
  * val test = Test()
    val data1 = Data<Test>(test)
    val data2 = Data<Test>(Test())
    val data3 = Data(Test())

   - อินสแตนซ์เดิมซึ่งได้กำหนดชนิดข้อมูล Generic Type เป็นอย่างใดอย่างหนึ่งไปแล้ว
   * ไม่สามารถนำมาสร้างเพื่อกำหนด Type ใหม่ได้
   * var data = Data<Int>(value = 123)
   data = Data<String>(value = "Kotlin") // Error
   data = Data(value = true) // Error

   - ในบางคลาสอาจมี Generic Type มากกว่า 1 ชนิด ซึ้งเราต้องแทนด้วยตัวอักษรที่แตกต่างกัน
   * เช่น
   * class Info<T, U, V>(val x: T, val y: U, val z: V) {

}
   *
   - ตัวอย่างคลาสที่มี Generic Type มากกว่า 1 ชนิด
   *  - Pair<A, B>
      - Triple<A, B, C>
*
*
* */



fun main(args: Array<String>) {
  val error = Pair<Int, String>(404, "Not Found")
     // หรือ Pair(404, "Not Found")
  val rgb = Triple<Int, Int, Int>(100, 150, 250)
    // หรือ Triple(100, 150, 250)
}