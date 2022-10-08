/*

    ฟังก์ชันแบบโอเวอร์โหลด
     - ชื่อฟังก์ชันต้องเขียนเหมือนกัน (รูปแบบตัวพิมพ์ต้องตรงกันทุกอักขระ)
     - รูปแบบของพารามิเตอร์ต้องแตกต่างกัน
       - ชนิดข้อมูลของพารามิเตอร์เหมือนกัน จำนวนพารามิเตอร์ต้องไม่เท่ากัน
       - ชนิดข้อมูลของพารามิเตอร์ต่างกัน จำนวนพารามิเตอร์อาจเท่ากันหรือไม่ ก็ได้

     - ชนิดข้อมูลส่งกลับอาจเหมือนหรือแตกต่างกันก็ได้

* */


fun max(n1: Int, n2: Int) = if (n1 >= n2) n1 else n2

fun max(n1: Int, n2: Int, n3: Int) : Int {
    var mx = n1
    mx = if (n2 > mx) n2 else mx
    mx = if (n3 > mx) n3 else mx
    return mx
}

fun max(n1: Double, n2: Double) = if (n1 >= n2) n1 else n2

fun max(n1: Double, n2: Double, n3: Double) : Double {
    var mx = n1
    mx = if (n2 > mx) n2 else mx
    mx = if (n3 > mx) n3 else mx
    return mx
}

fun main(args: Array<String>) {

 val a = max(10, 20)
 val b = max(10.5, 20.5)
 val c = max(108, 1009, 189)
 val d = max(9.9, 10.9, 11.9)

 print(d)

}