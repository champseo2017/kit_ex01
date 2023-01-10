import java.util.*
import java.*;
import kotlin.random.*;
import kotlin.reflect.typeOf

/*
   ฟังก์ชันแบบ Generic
   - Generic Function เป็นฟังกชันที่เราไม่กำหนด Type แบบเจาะจงเช่น
   เดียวกับ Generic class

   - การเรียกใช้ Generic Method ทำได้ 2 ลักษณะคือ
     1. ให้กำหนด Type ไว้ใน <> วางไว้หน้าชื่อเมธอด
     2. เรียกใช้งานเหมือน เมธอดทั่วไป ไม่ต้องใช้ <> คือ Type Inference


* */

class Data<T>(value: T) {
  // Generic type class
  private var v = value as Any

  fun type() = v::class.simpleName

  fun value() : T = v as T

  fun setValue(value: T) {
    this.v = value as Any
  }

  fun <U>typeOf(value: U) = (value as Any)::class.simpleName
  // Generic type function

}

fun main(args: Array<String>) {

  // val t1 = typeOf<String>("Hello")
  // val t2 = typeOf(123) Type Inference

  val data = Data<Double>(12.34)
  val t3 = data.typeOf<Double>(12.34)
  val t4 = data.typeOf('a') // Type Inference

}