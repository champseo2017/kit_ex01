import java.util.*
import java.*;
import kotlin.random.*;

/*
    ฟังก์ชันแบบ Generic
    Generic Method หากคลาสนั้นรับพารามิเตอร์แบบ Generic ด้วย ควรกำหนด Type Parameter เป็นของ
    มันเองโดยเฉพาะ ไม่เกี่ยวกับ Type ที่เป็นของคลาส

* */

 class Data<T>(value: T) {
     private var v = value as Any
     fun value(): T = v as T
     fun setValue(value: T) {
         this.v = value as Any
     }

     fun <U>typeOf(value: U) = (value as Any)
     /*
     จากโค๊ดจะพบว่า <U> ถูกกำหนดขึ้นมาให้กับเมธอด typeOf() โดยเฉพาะ จึงต้องมีเครื่องหมาย <>
     ครอบเอาไว้
      - การเรียกใช้ Generic Method ทำได้ 2 ลักษณะ
        - ให้กำหนด Type ไว้ใน <> แล้ววางไว้หน้าชื่อเมธอด
        - เรียกใช้งานเหมือนเมธอดทั่วไป โดยไม่ต้องใช้ <> เรียกว่า Type Inference คือ ให้ Kotlin
          วิเคราะห์ Type เอาเอง
     * */
 }

fun main(args: Array<String>) {

    // var t1 = typeOf<String>("Hello")
    // var t2 = typeOf(123) Type Inference ให้ Kotlin
    // วิเคราะห์ Type เอาเอง

    val data = Data<Double>(12.34)
    val t3 = data.typeOf<Double>(12.34)
    val t4 = data.typeOf('a') // Type Inference ให้ Kotlin วิเคราะห์ Type


}
