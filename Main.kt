import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
   การใช้ Lambda กับเมธอดของอาร์เรย์
   - forEach(action: (T) -> Unit) สำหรับดำเนินการกับสมาชิกแต่ละตัวของอาร์เรย์
      - val str = arrayOf("One", "Two", "Three"); // string
    str.forEach { println(it) }
    val nums = intArrayOf(7, 11, 108, 1009, 101) // int
    nums.forEach {
        if (it % 2 == 0) {
            print(it)
        }
    }
    - forEachIndexed(action: (index: Int, T) -> Unit)
       - สำหรับดำเนินการกับเลขลำดับและค่าของสมาชิกแต่ละตัวในอาร์เรย์ เช่น
       - var str = arrayOf("Zero", "One", "Two", "Three")
    println("Index\t\tValue")
    println("----------------------");
    str.forEachIndexed { i, v ->
        println("$i\t\t\t\t$v")
    }
    - count(predicate: (T) -> Boolean)
     - default นับจำนวนสมาชิกทั้งหมด
     - หากต้องการนับเฉพาะสมาชิกที่มีลักษณะตามเงื่อนไข ก็ให้กำหนดเป็นแลมบ์ดาที่ให้
     ผลลัพธ์ออกมาเป็น true หรือ false (ข้อมูลจะถูกนับเมื่อเงื่อนไขเป็น true)
     // การนับจำนวนสมาชิกที่ 3 หารลงตัว
    val nums = intArrayOf(7, 11, 108, 1009, 99)
    val c = nums.count {it % 3 == 0}
    println("จำนวนสมาชิกที่ 3 หารลงตัวเท่ากับ $c")

    val str = arrayOf("Zero", "One", "Two", "Three")
    val c2 = str.count {it.startsWith("t", ignoreCase = true)}
    // นับจำนวนสมาชิกที่ขึ้นต้นดเวยตัว t โดยไม่สนใจตัวพิมพ์ (startsWith ให้ผลลัพธ์เป็น true / false)

    - filter(predicate: (T) -> Boolean)
      - เป็นการคัดกรองเอาเฉพาะสมาชิกซึ้งมีลักษณะตามเงื่อนไขที่ระบุ โดยกำหนดเงื่อนไขเป็น
      แลมบ์ดาที่ให้ผลลัพธ์เป็น true หรือ false (ข้อมูลจะถูกเลือกเมื่อเงื่อนไขเป็น true) ซึ้ง
      เมธอดนี้คืนค่าเป็น array
      - val nums = intArrayOf(101, 7, 11, 108, 1009)
        val gt99 = nums.filter { it > 99} // gt99 return array
        println(gt99.joinToString(","))
        val str = arrayOf("Zero", "One", "Two", "Three")
        val t = str.filter { it.startsWith("t", ignoreCase = true) }
        println(t)

     - filterNot(predicate: (T) -> Boolean)
        - เป็นการกรองสมาชิกที่ไม่ตรงกับเงื่อนไขที่ระบุ หรือ ทำงานตรงข้ามกับเมธอด filter
        val nums = intArrayOf(101, 7, 11, 108, 1009)
        val lt99 = nums.filterNot { it > 99 }
        println(lt99.joinToString(","))
* */
fun main(args: Array<String>) {

}
