/*
    คอลเล็กชันประเภท List
    สำหรับจัดเก็บรายการข้อมูลที่สามารถเข้าถึงสมาชิกด้วยเลขลำดับคล้ายกับอาร์เรย์
    แต่มีความยืดหยุ่นต่อการเปลี่ยนแปลงจำนวนสมาชิกโดยการเพิ่มหรือลบรายการได้
    ในขณะที่อาร์เรย์นั้น จำนวนสมาชิกจะคงที่ตลอด


    การใช้ Lterator ร่วมกับ List
    หากเราต้องการเข้าถึงสมาชิกของลิสต์แบบต่อเนื่องกันซึ้งนอกจากการใช้ลูปแบบ for-in
    ยังสามารถใช้ Lterator ได้อีกหนึ่งวิธี โดยทั้ง Mutable และ Lmmutable list
    ต่างก็มีเมธอดในการสร้าง lterator

    iterator() คืนค่าเป็นอินสแตนซ์ของ Iterator เพื่อนำไปใช้ในการเข้าถึงรายการในลิสต์แบบ
    เลื่อนไปข้างหน้าได้อย่างเดียว

    listltorator() คืนค่ามาเป็นอินสแตนซ์ของ Iterator เพื่อนำไปใช้ในการเข้าถึงรายการในลิสต์
    แบบเลื่อนได้ทั้งไปข้างหน้าและย้อนกลับ

    หลักการใช้ Iterator ก็คือ ให้เลื่อนตำแหน่งการอ่านไปเรื่อยๆ ทีละตำแหน่ง จนกว่าจะครบตามจำนวน
    สมาชิก (เลื่อนต่อไปไม่ได้)

    - ลักษณะการใช้ Iterator ที่ได้จากเมธอด iterator()



* */

fun main(args: Array<String>) {

    val list = mutableListOf<String>("Java", "Kotlin", "Android")
    val iter = list.iterator()
//    while (iter.hasNext()) { // ถ้าเลื่อนต่อไปได้
//        println(iter.next()) // อ่านค่าสมาชิกในลำดับถัดไป
//    }

    // - ลักษณะการใช้ Iterator ที่ได้จากเมธอด ListIterator()
    val lists = mutableListOf<String>("Java", "Kotlin", "Android")
    val iters = list.listIterator()

    while (iters.hasNext()) {
        println(iters.next())
    }

    println()

    while (iters.hasPrevious()) { // หากเลื่อนย้อนกลับได้
        println(iters.previous()) // อ่านค่าสมาชิกในลำดับก่อนนี้
    }

}