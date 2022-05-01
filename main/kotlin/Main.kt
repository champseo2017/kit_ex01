

/*
    คอลเล็กชันประเภท List
    สำหรับจัดเก็บรายการข้อมูลที่สามารถเข้าถึงสมาชิกด้วยเลขลำดับคล้ายกับอาร์เรย์
    แต่มีความยืดหยุ่นต่อการเปลี่ยนแปลงจำนวนสมาชิกโดยการเพิ่มหรือลบรายการได้
    ในขณะที่อาร์เรย์นั้น จำนวนสมาชิกจะคงที่ตลอด

    Mutable List
    คือ ลิสต์ที่สามารถเปลี่ยนแปลงจำนวนสมาชิกด้วยการเพิ่มหรือลบได้ ซึ้งลิสต์ประเภทนี้จะกำหนด
    Type ในแบบ Generic เป็น MutableList<T> และ
    กำหนดรายการสมาชิกด้วยฟังก์ชัน
    mutableListOf()

    โดยสมาชิกที่จะเก็บในลิสต์ต้องมีชนิดข้อมูลตรงตาม Generic Type ที่ระบุ
    สามารถอ้างถึงสมาชิกด้วยเลขลำดับในวงเล็บ [] เหมือนกับอาร์เรย์

    Mutable List
    เมธอดที่สำคัญสำหรับจัดการสมาชิก ดังนี้

    get(ลำดับ) อ่านรายการในลำดับที่ระบุ
    set(ลำดับ , รายการ) กำหนดรายการในลำดับที่ระบุ
    add(รายการ) เพิ่มรายการที่กำหนดเข้าไปในลิสต์
    add(ลำดับ, รายการ) เพิ่มรายการในลำดับที่กำหนด (รายการเดิมในลำดับนั้นจะถูกเลื่อนขึ้น)
    addAll(ลิสต์) เพิ่มรายการจากลิสต์อื่น
    clear() ลบรายการทั้งหมด ออกจากลิสต์
    contains(รายการ) ตรวจสอบว่ามีรายการที่ระบุ อยู่ในลิสต์นั้นหรือไม่ ถ้ามีจะคืนค่า true
    isEmpty() ตรวจสอบว่าลิสต์นั้นว่างเปล่า (ไม่มีรายการ) ใช้หรือไม่ ถ้าใช้จะคืนค่า true
    remove(รายการ) ลบรายการที่ระบุออกจากลิสต์
    removeAt(ลำดับ) ลบรายการในลำดับที่ระบุ
    size() นับจำนวนรายการ
    toXxxArray() แปลงลิสต์ให้เป็นอาร์เรย์ของชนิดข้อมูลพื้นฐาน
    toTypeArray() แปลงลิสต์ให้เป็นอาร์เรย์แบบ Array<T>




* */

fun main(args: Array<String>) {

    val oddNums: MutableList<Int> = mutableListOf<Int>(1, 3, 5, 7)
    val colors: MutableList<String> = mutableListOf("red", "green")
    val vowels = mutableListOf<Char>('a', 'e', 'i', '0', 'u')
    val list = mutableListOf("Zero", "One", "Two", "Three")

    list[0] = "ศูนย์"
    list[2] = "สอง"
//    print(list[3])
    // list[4] = "Four" // Error ยังไม่มีสมาชิกลำดับที่ 4 อยู่ก่อน หากจะเพิ่มต้องทำผ่านเมธอด

//    for (item in list) {
//        println(item)
//    }

    val list1 = mutableListOf<Int>(3, 5)
    list1.add(7)
    list1.add(index = 0, element = 1)
//    println(list1)

    val list2 = mutableListOf<Int>(2, 4, 6)
    list1.addAll(list2)
    list1.removeAt(0)
    list1.remove(5)

    /*
    if (list1.contains(2)) {
    }
    * */

    if (!list2.isEmpty()) {
        list2.clear()
    }

    val arr1 = list1.toIntArray()
    // แปลง list1 เป็นชนิดข้อมูลพื้นฐาน เนื่องจาก list1 เก็บข้อมูลชนิด Int

    val arr2: Array<Int> = list1.toTypedArray()
    println(arr2.joinToString(", "))

}