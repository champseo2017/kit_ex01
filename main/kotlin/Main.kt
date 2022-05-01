/*
    การใช้แลมบ์ดากับคอลเล็กชัน
    - count(predicate: (T) -> Boolean) สำหรับ List และ Set
    - count(predicate: Map.Entry(K, V) -> Booolean) สำหรับ Map
    เป็นการนับเฉพาะสมาชิกซึ้งมีลักษณะตามเงื่อนไขที่ระบุในแบบแลมบ์ดา โดยเงื่อนไขดังกล่าว ต้อง
    ให้ผลลัพธ์ออกมาเป็น true หรือ false (ข้อมูลจะถูกนับเมื่อเงื่อนไขเป็น true)

    filter(predicate: (T) -> Boolean) สำหรับ List
    filter(predicate: Map.Entry(K, V) -> Boolean) สำหรับ Map
    return ผลลัพธ์

    filterNot(...) เป็นการกรองเอาเฉพาะสมาชิกที่ไม่ตรงตามเงื่อนไขที่ระบุ
    ทำงานตรงข้ามกับ เมธอด filter(0



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