import java.util.*

/*
*   การใช้ Safe Call Operator
*    - val str: String? = readLine()
*    - val n = str.toDouble() // Error เพราะ str อาจเป็น null ได้
*    - val d: Double? = 10.5
*     - val i: Int = d.toInt() // Error เพราะ d อาจเป็น null ได้
*
*      .? หากตัวแปรไม่มีค่าเป็น null จะเรียกใช้ เมธอด ถ้าเป็น null จะไม่ถูกเรียก และ
*      ตัวแปรนั้นจะมีค่าเป็น null โดยอัตโนมัติ ตัวแปรที่ใช้เก็บผลลัพธ์ จึงต้องมี Type เป็น
*      null เช่นกัน
*
* */
fun main(args: Array<String>) {
    val str: String? = readLine()
    val n: Double? = str?.toDouble() // OK
    /*  เทียบเท่ากับ
    *  if (str != null) {
    *   val n = str.toDouble()
    * }
    *
    * */
    val d: Double? = 10.5
    val i: Int? = d?.toInt()

    val s = str?.trim()?.substring(0, 10)?.uppercase(Locale.getDefault())
    // จากโค๊ด ตัวแปร str ต้องไม่เป็น null เมธอดทั้งหมดจึงจะถูกเรียกไปตามลำดับ
    // สามารถประยุกต์ใช้ self call Operator ร่วมกับ Elvis Operator เช่น
    val str2: String? = readLine()
    val len = (str2?.length) ?: 0
    // จากโค็ด len ถ้าไม่มีค่าเป็น null ตัวแปร len จะมีค่า length แต่ถ้ามีค่าเป็น null
    // ตัวแปร len จะมีค่าเป็น 0 จากตัวดำเนินการ ?: (Elvis Operator)

}