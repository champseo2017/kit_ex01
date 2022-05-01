/*
    โครงสร้างโฟลเดอร์ใน Android
    app เป็นโฟล์เดอร์หลักที่เก็บไฟล์ทั้งหมดของแอป
    manifests เก็บไฟล์ AndroidManifest.xml ไฟล์ตั้งค่าต่างๆ ของแอป
    java โฟล์เดอร์ src ใช้ในการเก็บไฟล์ที่เป็นโค้ด Java หรือ kotlin เช่น
    MainActivity.kt

    res โฟลเดอร์ res ใช้ในการเก็บไฟล์ทรัพยากรต่างๆ ที่นำมาใช้ในแอป เช่น ค่าสตริง
    สี ขนาด รูปภาพ หรือ มัลติมิเดียต่างๆ res จะแบ่งออกเป็นโฟลเดอร์ย่อย สำหรับแยกจัดเก็บ
    ข้อมูลที่ต่างกัน เช่น values, menu, layout เป็นต้น



* */

fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val set = mutableSetOf(1.2, 3.4, 5.6, 7.8, 9.0)
    val map = mutableMapOf<Int, String>(66 to "Thailand", 81 to "Japan"
    , 61 to "Australia")

//    val c1 = list.count { it % 2 == 0}
//    val c2 = set.count { it > 3 }
//    val c3 = map.count { it.key < 80 }
    // it.value ค่าของ value

    val fList = list.filter { it % 2 == 0 }

    val fnList = list.filterNot { (it * it) < 30 }

    val fMap = map.filter { it.key < 80 }
    // อ้างค่าของ Map ด้วย it.value



}