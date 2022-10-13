/*

    Type Inference
    - ใช้ Type Inference เป็นการระบุชนิดข้อมูลเพียงฝั่งใด
    ฝั่งหนึ่ง

    // แบบไม่ใช้ Type Inference
    val inc: (Int) -> Int = { it + 1 }
    val add: (Int, Int) -> Int = { n1, n2 -> n1 + n2 }
    val divide: (Double, Double) -> Double = { n1, n2 -> n1 / n2 }
    val oe: (Int) -> String = { if (it % 2 == 0) "Even" else "Odd" }
    val echo: (String) -> Unit = { println(it) }

* */


fun main(args: Array<String>) {

  val inc = {n: Int -> n + 1}
  val add = {n1: Int, n2: Int -> n1 + n2}
  val divide = { n1: Double, n2: Double -> n1 / n2 }
  val oe = {n: Int -> if (n % 2 == 0) "Even" else "Odd"}
  val echo = {str: String -> println(str)}
  val sawasdee = { print("Hello") }
  sawasdee()


}