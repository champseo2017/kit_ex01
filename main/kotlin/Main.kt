/*

   การสร้างฟังก์ชันแบบ Single Expression
   - เราสามารถตัดวงเล็บ {} ทิ้งไป แล้วใช้เครื่องหมาย
   = เพื่อกำหนดค่าที่จะส่งกลับต่อท้ายฟังก์ชันในบรรทัดเดียวกันได้เลย
   เขียนเฉพาะข้อมูลที่จะส่งกลับ

* */

fun write(str: String) = println(str)
// ไม่ส่งค่ากลับเพราะไม่มีผลลัพธ์เกิดขึ้น

fun inc(a: Int) = a + 1
// ส่งผลลัพธ์ของ a + 1 กลับออกไป

fun add(x: Int, y: Int) = x + y
// ส่งผลลัพธ์ของ x + y กลับออกไป

fun oddEven(n: Int) = if (n % 2 == 0) "Even" else "odd"

fun winner(p1Score: Int, p2Score: Int) = when {
    p1Score > p2Score -> "Player1"
    p1Score < p2Score -> "Player2"
    else -> ""
}

fun numDays(month: Int, isLeapYear: Boolean) = when (month) {
    1, 3 -> 31
    4, 5 -> 30
    2 -> if (isLeapYear) 29 else 28
    else -> 0
}

fun main(args: Array<String>) {

}