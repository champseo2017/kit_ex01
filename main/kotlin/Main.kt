/*

    ฟังก์ชันแลมบ์ดา

    ฟังก์ชันปกติ
    fun write(str: String) = print(str)
    {str: String -> print(str)}

    fun add(a: Double, b:Double) = a + b
    {a:Double, b:Double -> a + b}

    fun hello() = print("Hello")
    {print("Hello")}

    fun oddEven(n: Int) = if (n % 2 == 0) "Even" else "Odd"
    {n: Int -> if (n % 2 == 0) "Even" else "Odd"}

    รูปแบบทั่วไปของ Lambda
    รูปแบบทั่วไปของการเขียน Lambda Expression ใน Kotlin คือ

    val add: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
 (Variable)   (Type          )    (Parameters)      (Body)

 val ชื่อแลมบ์ดา : (ชนิดข้อมูลพารามิเตอร์) -> ชนิดข้อมูลผลลัพธ์ = {พารามิเตอร์ -> คำสั่งต่างๆ}

 - ชื่อแลมบ์ดา เป็นตัวแปรใช้อ้างถึงแลมบ์ดา
 - พารามิเตอร์ เป็นพารามิเตอร์ของฟังก์ชัน ไม่ต้องเขียนในวงเล็บ
 - -> เชื่อมโยงระหว่างพารามิเตอร์และคำสั่งของแลมบ์ดา
 - body ใช้กำหนดการทำงาน
 - ชนิดข้อมูลพารามิเตอร์ ชนิดข้อมูลที่รับเข้ามาทำงานในส่วน Body
 - ชนิดข้อมูลผลลัพธ์ ชนิดข้อมูลผลลัพธ์ที่จะส่งกลับออกไป

* */


fun main(args: Array<String>) {

  val inc: (Int) -> Int = {n: Int -> n + 1}
  // รับพารามิเตอร์ชนิด Int เข้ามา 1 ตัว บวกเพิ่มอีก 1 ส่งค่ากลับเป็นชนิด Int

  val add: (Int, Int) -> Int = {n1: Int, n2: Int -> n1 + n2}
  // รับพารามิเตอร์ชนิด Int เข้ามา 2 ตัว นำมาบวกกัน ส่งค่าลกับเป็นชนิด Int

  val divide: (Double, Double) -> Double = {n1: Double, n2: Double
  -> n1 / n2}

  val oddEven: (Int) -> String = {
      n: Int -> if (n % 2 == 0) "Even" else "Odd"
  }

//  val echo: (String) -> Uint = {
//      str: String -> println(str)
//  }

  val sawasdee: () -> Unit = {
      print("Hello")
  }
    sawasdee()

    val a = inc(10)
    val b = add(20, 30)
    val c = oddEven(99)
    sawasdee()
    // นำแลมบ์ดาไปใช้งาน อ้างอิงผ่านชื่อของมัน พร้อมกำหนดค่าพารามิเตอร์ในรูปแบบ
    // เดียวกับการเรียกฟังก์ชัน

}