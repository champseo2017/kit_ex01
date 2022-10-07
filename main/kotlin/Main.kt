/*

   พารามิเตอร์แบบอาร์เรย์
   - ข้อมูลพื้นฐาน XxxArray
   - Array<ชนิดข้อมูล>

   fun summation2(data: Array<Double>) : Double {
       //...
   }

* */

fun summation(data: IntArray) : Int {
    var sum: Int = 0
    for (n in data) {
        sum += n
    }
    return sum
}

fun summation2(data: Array<Double>) : Double {
    var sum: Double = 0.0
    for (n in data) {
        sum += n
    }
    return sum
}


fun main(args: Array<String>) {

    val i = intArrayOf(1, 2, 3)
    val sum = summation(i)
    // อาร์กิวเมนต์หรือข้อมูลที่จะกำหนดให้แก่พารามิเตอร์ที่เป็นอาร์เรย์ ต้องเป็นแบบอาร์เรย์เช่น
    // เดียวกัน
    println(sum)

    val d = doubleArrayOf(1.2, 3.4, 5.6)
    val sum2 = summation2(d.toTypedArray())
    // Array<Type> Generic ให้อาร์เรย์มีความยืดหยุ่นในการระบุชนิดข้อมูล
    println(sum2)

}