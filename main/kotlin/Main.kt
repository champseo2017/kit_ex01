/*
    การตรวจสอบเงื่อนไขด้วย if-else




* */

fun main(args: Array<String>) {

    val code = "abcde"
    val n1 = 108
    val n2 = 1009
    val n3 = 189
    var max = n1
    if (n2 > max) {
      max = n2
    }
    if (n3 > max) {
       max = n3
    }

    print("จำนวนที่มากที่สุดคือ $max")
}