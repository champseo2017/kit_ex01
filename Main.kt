import java.util.*
import java.*;
import kotlin.random.*;

/*
   อาร์เรย์แบบ Generic
   หากเป็นชนิดข้อมูลพื้นฐาน จะมีคลาสและฟังก์ชันสำหรับอาร์เรย์ชนิดนั้นโดยตรง
   เช่น
   IntArray/intArrayOf()
   DoubleArray/doubleArrayOf() เป็นต้น
   แต่ในกรณีอื่นๆ ที่ไม่มีคลาส XxxArray และ ฟังก์ชัน xxxArrayOf() สำหรับชนิดนั้น
   เราสามารถใช้ Array<T> ทดแทนได้ ซึ้งก็คือรูปแบบของ Generic นั่นเอง
   โดยข้อมูลที่ต้องกำหนดให้แก่คอนสตรักเตอร์ของคลาสดังกล่าวนี้ ก็คือจำนวนสมาชิก และ
   ต้องระบุค่าเริ่มแรกของสมาชิกแต่ละตัวในแบบแลมบ์ดา

    val colors: Array<String> = Array<String>(3, {""})
    val colors: Array<String> = Array(3){""}
    val colors = Array<String>(3){""}
    val colors = Array(3){""}

    จากโค๊ด เรากำหนดชนิดของอาร์เรย์เป็น String และ ค่าเริ่มแรกของสมาชิกแต่ละตัวเป็นสตริงว่าง
    (Empty) ตามหลักการของพารามิเตอร์แบบ Function Type เราสามารถแยกวงเล็บ {} ของแลมบ์ดา
    มาไว้นอกวงเล็บ () ได้

    val ints = Array(3) { 5 } // 5, 5, 5
    val bools = Array(4) { false } // false, false, false, false
    val evens = Array(5) { it * 2 }
    println(evens.joinToString(", "))



* */

fun main(args: Array<String>) {
    val ints = Array(3) { 5 } // 5, 5, 5
    val bools = Array(4) { false } // false, false, false, false
    val evens = Array(5) { it * 2 }
    println("")
}
