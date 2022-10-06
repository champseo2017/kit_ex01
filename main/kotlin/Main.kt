/*

    การออกจากฟังก์ชัน
    - วางคำสั่ง return ไว้ ณ จุดที่ต้องการออกจากฟังกชัน

* */

fun showReactArea(width: Double, height: Double) {
    if (width <= 0 || height <= 0) {
        return // fun นี้ไม่ส่งค่ากลับ จึงไม่ต้องระบุข้อมูล
    } else {
        print(width * height)
    }
}

// ฟังก์ชันต่อไปนี้ต้องส่งค่ากลับ ให้ระบุค่าที่บ่งบอกว่าล้มเหลว (ในที่นี้คือ 0.0)

fun circleArea(radius: Double) : Double = if (radius < 0) 0.0
else 3.141 * radius * radius

fun main(args: Array<String>) {

}