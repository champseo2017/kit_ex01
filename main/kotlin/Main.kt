import java.awt.Shape

/*

    Higher Order Function

    - ฟังก์ชันที่มีพารามิเตอร์แบบ Function Type
    - เราสามารถนำพารามิเตอร์แบบ Function Type มาเขียนไว้นอกวงเล็บ
    - () ก็ได้ เช่น fx(a = 10) {it + 1} นิยมใช้วิธีนี้มากกว่าการเขียนไว้ใน
    - วงเล็บ

    - การนำพารามิเตอร์แบบ Function Type มาวางไว้นอกวงเล็บ
    - ควรใช้เมื่อฟังก์ชันนั้นมีพารามิเตอร์เพียงตัวเดียวที่เป็น Function Type (มีพารามิเตอร์
    แบบปกติกี่ตัวก็ได้) โดยวางพารามิเตอร์แบบ Function Type ไว้ในลำดับสุดท้าย

    - กรณีที่ฟังก์ชันนั้นมีเฉพาะพารามิเตอร์ที่เป็น Function Type เมื่อเรียกใช้ฟังก์ชัน
    ไม่จำเป็นต้องใส่วงเล็บ () หลังชื่อฟังก์ชัน


* */


fun fx(a: Int, calculation: (Int) -> Int) {
  // พารามิเตอร์ตัวที่สองเป็นแบบ Function Type คือ (Int) -> Double
  // นั่นหมายความว่า ต้องกำหนดค่าของพารามิเตอร์ตัวที่สองในแบบ แลมบ์ดา
  // เพื่อระบุวิธีดำเนินการกับข้อมูลที่รับเข้ามา
  val r = calculation(a)
  println("Result: $r")
}

fun test(action: () -> Unit) {
  action()
}

fun shape (width: Int, height: Int, action: (Int, Int) -> Double)
: Double {
  return action(width, height)
}


fun main(args: Array<String>) {

  fx(a = 2, calculation = { it + 1 })

  fx(5, { 2 * it })

  // แลมบ์ดา
  val square: (Int) -> Int = {it * it}
  fx(10, square)

  // เขียนแลมบ์ดานอกวงเล็บ
  fx(a = 10) { it + 1 }
  fx(5) { 2 * it }
  fx(30) { it * it }

  // กรณีที่ฟังก์ชันนั้นมีเฉพาะพารามิเตอร์ที่เป็น Function Type
  test { // ปกติเขียนเป็น test() {...}
    print("test")
  }

  val rectArea = shape(10, 20) { w, h -> (w * h).toDouble() }
  val circleArea = shape(10, 0) {
    r, _ -> 3.14 * r
  }
  // ฟังก์ชัน shape() เรากำหนด Type เป็น (Int, Int) -> Double ต้องมีพารามิเตอร์
  // 2 ตัว ในส่วนของแลมบ์ดา ถ้าพารามิเตอร์ที่ไม่ได้ใช้สามารถใช้เครื่องหมาย _ เพื่อให้ครบตาม
  // จำนวน

  val triangleArea = shape(50, 30) { b, h -> 0.5 * b * h }

  println(circleArea)

}