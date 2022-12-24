import kotlin.random.*

/*

    การตรวจสอบชนิดข้อมูลด้วย is และ !is
    - is ตรวจสอบตัวแปรหรืออินสแตนซ์ เป็นชนิดที่ระบุหรือไม่ หากใช้จะคืนค่า true
    - !is จะใช้ในทางตรงกันข้ามคือ หากตัวแปรหรืออินสแตนซ์ ไม่ใช้ชนิดที่ระบุ จะคืนค่า true

    val a: Int = 10
  var bool = a is Int // true
  bool = a !is Double // Error เปรียบเทียบกันไม่ได้
  bool = a !is Long // Error เปรียบเทียบกันไม่ได้
  val b = 1.23
  bool = b is Double // true
  bool = b is Float // Error

  var x: Any = 10 // Any เปรียบเทียบกับชนิดใดก็ได้
  println(x is Int) // true
  println(x is Double) // false
  println(x !is String) // true
  x = "Hello"
  println(x is Int) // false
  println(x is String) // true
  println(x is Any) // true

  fun test(a: Any) {
      if (a is Int) {
          ...
      } else if (a is Double) {

      }
       หรือใช้ when เช่น
       when (a) {
        is Int -> ...
       is Double -> ...
       }
  }

  ลักษณะการเปรียบเทียบในแบบอินสแตนซ์ของคลาส
    class One
class Two

val a = One()
    val b = Two()
    val x = a is One // true
    // if (b is Two) {...} // true

    open class Tea
class IceTea: Tea()
class Coffee

val t = Tea()
    println(t is Tea) // true
    println(t is IceTea) // false

    val it = IceTea()
    println(it is Tea) // true
    println(it is IceTea) // true

    val cff = Coffee()
    println(cff is Tea) // Error

* */


open class Tea
class IceTea: Tea()

fun drink(a: Any) {
    println(when (a) {
        is IceTea -> "IceTea"
        is Tea -> "Tea"
        else -> ""
    })
}

fun drink2(d: Tea) {
    println(when (d) {
        is Tea -> "Tea"
        is IceTea -> "IceTea"
        else -> ""
    })
}


fun main(args: Array<String>) {

    val t = Tea()
    val it = IceTea()
    drink(t) // Tea
    drink(it) // IceTea



}
