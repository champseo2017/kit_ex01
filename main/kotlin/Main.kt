/*

    Function Type

    val inc: (Int) -> Int
    val divide: (Double, Double) -> Double
    val oe: (Int) -> String
    val echo: (String) -> Unit

    - ตัวแปรปกติ val x: Int = 100
      - เราจะกำหนดค่าที่แน่นอนให้กับมัน

    - แต่ถ้าเป็น Function Type ต้องเป็นวิธีการทำงานเพื่อดำเนินการกับ
    ข้อมูล (พารามิเตอร์) ที่รับเข้าไป เรียกว่า แลมบ์ดา และ หากอยากปรับเปลียนวิธีการทำงาน
    สามารถกำหนดแลมป์ดาแบบใหม่ได้

    - แลมป์ดา เป็นการกำหนดวิธีการทำงานของ Function Type


* */


fun main(args: Array<String>) {

  var calculate: (Double, Double) -> Double
  calculate = {a, b -> a + b}

  val add = calculate(10.0, 20.0)

  calculate = {a, b -> a * b}
  val multiply = calculate(5.0, 10.0)

  calculate = {a, b -> a / b}
  val divider = calculate(15.0, 5.0)


}