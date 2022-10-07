/*

    พารามิเตอร์แบบ Variable Argument
    - ไว้ใช้รับจำนวน data แต่ละชุดที่มีขนาดไม่เท่ากัน
    - วิธีสร้าง
       - วางคีย์เวิร์ด vararg ไว้หน้าชื่อพารามิเตอร์ตัวนั้น เช่น
         - varag data:Int

       - เข้าถึงค่า พารามิเตอร์แบบ varag โดยการใช้ อาร์เรย์

       - ใน fun สามารถมีทั้งพารามิเตอร์แบบปกติ และ แบบ Variable Argumnet ร่วม
       กันได้ แต่จะมีพารามิเตอร์แบบ Variable Argumnet ได้เพียงอันเดียวเท่านั้น



* */

fun f1(vararg data: Int) {}
fun f2(a: String, vararg data: Int) {}
// fun f3(a: String, vararg b: Int, vararg c: Float) {}
// Error จะมี Variable Argument ได้เพียวตัวเดียวเท่านั้น

fun summation(vararg data: Int) : Int {
    var sum = 0
    for (n in data) {
        sum += n
    }
    return sum
}

fun main(args: Array<String>) {

    val sum1 = summation(1, 2, 3, 4, 5)
    // เรียกฟังก์ชัน กำหนดอาร์กิวเมนต์กี่จำนวนก็ได้ คั่นด้วยเครื่องหมาย ,
    val sum2 = summation(6, 7, 8)
    val arr = intArrayOf(10, 20, 30)
    val sum3 = summation(*arr)
    // กำหนดอาร์กิวเมนต์แบบอาร์เรย์ ให้วางเครื่องหมาย * ไว้ข้างหน้าอาร์เรย์
    val sum4 = summation(*intArrayOf(40, 50, 60))

}