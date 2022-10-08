/*

    การส่งค่ากลับแบบ Pair หรือ Triple

    - การส่งผลลัพธ์กลับในแบบ Pair หรือ Triple เป็นอีกทางเลือกหนึ่ง

    - Pair<ชนิดข้อมูล_1, ชนิดข้อมูล_2>
    - Triple<ชนิดข้อมูล_1, ชนิดข้อมูล_2, ชนิดข้อมูล_3>

* */

fun summation(vararg data: Int) : Pair<Int, Double> {

    var sum = 0

    for (n in data) {
        sum += n
    }

    var average = sum.toDouble() / data.count().toDouble()

    return Pair(sum, average)
}

fun main(args: Array<String>) {

    val sum = summation(10, 15, 18, 22)
    print("sum: ${sum.first}, average: ${sum.second}")

}