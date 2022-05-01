/*
    คอลเล็กชันประเภท Map
    Collection Type ชุดข้อมูล Dictionary สมาชิกแต่ละตัวมีส่วนประกอบ 2 อย่างคือ
     - Key ใช้ในการอ้างถึงสมาชิกแต่ละตัว เปรียบได้กับคำศัพท์ใน Dictionary
     - Value เป็นค่าของสมาชิกตัวนั้น เปรียบได้กับความหมายของคำศัพท์ใน Dictionary

     โดย Map ก็แบ่งออกเป็น 2 แบบคือ Mutable Map และ Immutable Map

     การกำหนดสมชิก จะใช้คำว่า to เพื่อจับคู่ระหว่าง key และ value
     คอลเล็กชัน Map มีเมธอดที่สำคัญสำหรับจัดการสมาชิก

     put(key, value) เพิ่มสมาชิกลงใน Map
     get(key) อ่านสมาชิกที่มีคีย์ตรงกับที่ระบุ
     set(key, value) เพิ่มสมาชิกที่มีคีย์และค่าของมันตามที่กำหนด
     clear() ลบสมาชิกทั้งหมดออกจาก Map
     containsKey(key) ตรวจสอบว่ามีคีย์ที่ระบุหรือไม่ หากมีจะคืนค่า true
     containsValue(value) ตรวจสอบว่ามีค่าที่ระบุหรือไม่ หากมีจะคืนค่า true
     isEmpty() ตรวจว่า Map นี้ว่างเปล่าหรือไม่ ถ้าใช้จะคืนค่า true
     remove(key) ลบสมาชิกที่มีคีย์ตรงกับที่ระบุ
     replace(key, value) แทนที่ค่าของสมาชิกเดิมที่มีคีย์ตามที่ระบุด้วยค่าใหม่
     size() อ่านขนาดหรือจำนวนสมาชิกใน Map
     keys() อ่านค่าคีย์ทั้งหมด
     values() อ่านค่าทั้งหมด (ไม่รวมคีย์)

     เมธอดที่เกี่ยวกับการเพิ่มหรือลบสมาชิก เช่น put(), set(), remove() จะใช้ได้เฉพาะกับ
     Mutable Map




* */

fun main(args: Array<String>) {

    val c = mutableMapOf("th" to "Thailand")
    c["jp"] = "Japan"
    c.put("au", "Australia")
    c.set("uk", "United Kingdom")
//    println(c.get("th"))
    if (c.containsKey("au")) {
        c.remove("au")
    }

//    for (k in c.keys) {
//        println(c[k]) // หรือ c.get(k)
//    }

    val iter = c.iterator()
    while (iter.hasNext()) {
        // println(iter.next())
        // iter.next().value
        println(iter.next().value)
        // iter.next().key
    }

}