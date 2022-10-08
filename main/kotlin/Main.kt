/*

    การส่งหลายๆ ค่ากลับจากฟังก์ชัน

    - การส่งค่ากลับแบบอาร์เรย์

      - ถ้าเป็น Array ชนิดข้อมูลพื้นฐานก็ส่งค่า Array ชนิดข้อมูลพื้นฐานออกไป
      - ถ้าไม่ใช้ชนิดข้อมูลพื้นฐาน อาจกำหนดเป็น Array<ชนิดข้อมูล> ภายในฟังก์ชัน
      ให้สร้างผลลัพธ์ให้เป็นอาร์เรย์ของข้อมูลชนิดนั้น หลังจากนั้นก็คืนผลลัพธ์ออกไป

* */

fun oneToTenEvenNums() : IntArray {
    return intArrayOf(2, 4, 6, 8, 10)
}

fun getVowels(): Array<String> {
    return arrayOf("a", "e", "i", "o", "u")
}

fun main(args: Array<String>) {

    var vowels = getVowels()

    for (v in vowels) {
        println(v)
    }

}