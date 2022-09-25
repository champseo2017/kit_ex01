/*
   การแทนที่สตริง

   - replace(สตริงเดิม, สตริงใหม่)
     - แทนที่สตริงเดิมด้วยสตริงใหม่ที่มันเจอทั้งหมด ลักษณะตัวพิมพ์ของค่า
     สตริงเดิมต้องตรงกับสตริงใหม่ซึ้งจะใช้แทนที่

   replaceFirst(สตริงเดิม, สตริงใหม่)
     - แทนที่สตริงเดิมด้วยสตริงใหม่เฉพาะที่มันเจอครั้งแรกเท่านั้น

* */

fun main(args: Array<String>) {

    val str = "No Pain No Gain"
    val s1 = str.replaceFirst("No", "More")
    // More Pain No Gain
    val s2 = str.replace("No", "More")
    val s3 = str.replace("no", "More")
    // s3 เหมือนเดิม เพราะ เพราะตัวพิมพ์ไม่ตรงกัน


}