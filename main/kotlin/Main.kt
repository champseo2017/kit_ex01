/*
   การจัดเก็บข้อมูลแบบ Array arrayOf()

   - การสร้างอาร์เรย์แบบไม่ระบุชนิดข้อมูล
   - ประกาศตัวแปรพร้อมกำหนดชุดข้อมูลเริ่มแรกให้กับมันด้วยฟังก์ชัน
   arrayOf() และ ไม่ต้องเป็นชนิดข้อมูลเดียวกันก็ได้

   val oddNumbers = arrayOf(1, 3, 5, 7, 9)
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    val data = arrayOf(1, true, "three")
    val emptyArray = arrayOf() // Error ต้องกำหนดสมาชิกเริ่มต้นเสมอ

   ลักษณะสำคัญของการสร้างอาร์เรย์แบบนี้
   - ใช้เมื่อรู้จำนวนสมาชิกที่แน่นอน
   - ไม่สามารถเพิ่มจำนวนสมาชิกในภายหลังได้
   - สามารถแก้ไขค่าของสมาชิกเริ่มแรกได้
   - การอ้างถึงสมาชิก ให้ระบุเลขลำดับในวงเล็บ []
   ตามหลังชื่ออาร์เรย์

   val data = arrayOf(1, true, "three")
    data[0] = 0
    data[1] = "two"

    for (element in data) {
        println(element)
    }

* */

fun main(args: Array<String>) {




}