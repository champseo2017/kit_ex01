/*
   การแยกและรวมสตริง
    - เมธอดที่ใช้ในการแยกสตริงเป็นอาร์เรย์

    split(สิ่งที่จะใช้คัดแยก)
     - คัดแยกสตริงด้วยสิ่งที่ระบุ จะได้ผลลัพธ์เป็นอาร์เรย์ชนิดสตริง

    กรณีที่เราต้องการกระทำในทางตรงกันข้ามคือ รวมอาร์เรย์ให้เป็นสตริง ใช้เมธอด
    joinToString() ของอาร์เรย์

* */

fun main(args: Array<String>) {

    val date = "20/01/2020"
    val d = date.split("/")

    // d = arrayOf("20", "01", "2020")

    val url = "www.developerthai.com"
    val u = url.split(".")

    val dt = arrayOf("21", "06", "2020")
    val s = dt.joinToString("-")

}