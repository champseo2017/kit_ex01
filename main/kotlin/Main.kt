import kotlin.random.*

/*

  การสร้างคอนสตรักเตอร์เพิ่มเติมให้แก่ Subclass
  หากคอนสตรักเตอร์ที่มีใน Superclass ไม่สอดคล้องหรือไม่เพียงพอต่อการทำงานของ
  subclass ก็สามารถเพิ่มเข้าไปอีกได้เช่นเดียวกับพร็อปเพอร์ตี้หรือเมธอด

  - ใช้ this() เพื่อกำหนดค่าให้แก่ primary constructor ของคลาสตัวมันเอง
  หากไม่ระบุค่าล่วงหน้าให้แก่พร็อปเพอร์ตี้ ต้องนำค่าจากคอนสตรักเตอร์มากำหนดให้กับมัน

* */

 open class Device(var os: String)

 class Tablet(var osName: String) : Device(osName) {
     constructor(os: String, brandName: String) : this(os) {

     }
 }

 class Smartphone(var osName: String) : Device(osName) {
     constructor(osName: String, brandName: String) : this(osName) {

     }

     constructor(osName: String, osVersion: Double, brandName: String)
             : this(osName) {

             }
 }

 open class Computer

 class NoteBook(var brand: String) : Computer() {
     private var model = ""
     constructor(brand: String, model: String, processsor: String,
     memory: Int, display: Double) : this(brand) {
         this.model = model
     }
 }


fun main(args: Array<String>) {



}
