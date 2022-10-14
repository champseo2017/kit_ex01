import java.awt.Shape

/*

    การใช้ Lambda กับเมธอดของอาร์เรย์
    - บางเมธอดของอาร์เรย์ มีพารามิเตอร์เป็น Function Type ดังนั้น ต้อง
      กำหนดวิธีการดำเนินการให้กับมันในแบบแลมบ์ดา

    - forEach(action: (T) -> Unit)
      สำหรับดำเนินการกับสมาชิกแต่ละตัวของอาร์เรย์

    - forEachIndexed(action: (index: Int, T) -> Unit)
      ดำเนินการกับเลขลำดับ และ ค่าของสมาชิกแต่ละตัวในอาร์เรย์

    - count(predicate: (T) -> Int)
      จะนับข้อมูลเมื่อตัวดำเนินการเป็น true
      ไม่ระบุอาร์กิวเมนต์ จะนับจำนวนสมาชิกทั้งหมด
      สามารถนับจำนวนตามเงื่อนไขได้ return ค่าออกมาเป็น true หรือ false

    - filter(predicate: (T) -> Boolean)
      - กรองสมาชิกใน Array ที่ตรงตามเงื่อนไขที่ระบุ
      - ผลลัพธ์ที่ได้ส่งคืนมาเป็น Array ของสมาชิกที่ถูกเลือก


    - filterNot(predicate: (T) -> Boolean)
      - กรอกเอาสมาชิกที่ไม่ตรงตามเงื่อนไขที่ระบุ
      - ทำงานตรงข้ามกับ เมธอด filter


* */


fun main(args: Array<String>) {

   val str = arrayOf("One", "Two", "Three")
   str.forEach { println(it) }

   val nums = intArrayOf(7, 11, 108, 1009, 101)
   nums.forEach {
    if (it % 2 == 0) {
      println(it)
    }
  }

  // forEachIndexed
  val str2 = arrayOf("Zero", "One", "Two", "Three")
  println("Index\t\tValue")
  println("---------------")
  str.forEachIndexed {
    i, v -> println("$i \t \t \t \t $v")
  }

  // นับจำนวนสมาชิกที่ 3 หารลงตัว
  val nums2 = intArrayOf(7, 11, 108, 1009, 99)
  val c = nums2.count { it % 3 == 1 }
  println("จำนวนสมาชิกที่ 3 หารลงตัวเท่ากับ $c")

  val str3 = arrayOf("Zero", "One", "Two", "Three")
  val c2 = str.count { it.startsWith("t", ignoreCase = true) }
  // นับจำนวนสมาชิกที่ขึ้นต้นด้วยตัว t
  // โดยไม่สนใจตัวพิพม์
  // startsWith ให้ผลลัพธ์เป็น true / false

  val nums3 = intArrayOf(101, 7, 11, 108, 1009)
  val gt99 = nums3.filter { it > 99 } // return Array
  println(gt99.joinToString(", "))

  val str4 = arrayOf("Zero", "One", "Two", "Three")
  val t = str4.filter { it.startsWith("t", ignoreCase = true)}
  // เลือกเฉพาะตัว t โดยไม่สนใจตัวพิมพ์

  val nums6 = intArrayOf(101, 7, 11, 108, 1009)
  val lt99 = nums6.filterNot { it > 99 }
  println(lt99.joinToString(","))


}