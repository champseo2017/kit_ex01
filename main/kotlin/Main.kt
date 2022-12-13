import kotlin.random.*

/*

   Object Expression
   - หากต้องการนำอินเทอร์เฟซไปใช้งาน ต้องสร้างคลาสขึ้นมาสืบทอด ซึ้งอาจเกิดความ
   ยุ่งยาก
   - ลักษณะของ Object Expression คือใช้คีย์เวิร์ด object แทนคลาสที่จะสืบทอดจาก
   อินเทอร์เฟซโดยไม่ต้องระบุชื่อในรูปแบบดังนี้

   object: interface_name {
     // โอเวอร์ไรด์สมาชิกของอินเทอร์เฟซที่เป็น Abstract ตามปกติ
   }

   - กรณีที่เราต้องการนำไปใช้งานโดยตรง อาจสร้างตัวแปรเพื่อใช้อ้างถึงออบเจ็กต์
   ดังกล่าว เช่น
   interface Math {
    fun add(a: Int, b: Int) : Int
    fun subtract(a: Int, b: Int) : Int
    }
    var mt = object: Math {
        override fun add(a: Int, b: Int): Int = a + b
        override fun subtract(a: Int, b: Int) = a - b
    }

    - ลักษณะที่ฟังก์ชัน (หรือ เมธอดของคลาส) รับพารามิเตอร์ที่เป็นแบบอินเทอร์เฟซ
      - สร้างออบเจ็กต์ ของอินเทอร์เฟซพร้อมโอเวอร์ไรด์ แล้วนำไปกำหนดให้แก่พารา
      มิเตอร์ตัวนั้น เช่น
      var mt = object: Math {
        override fun add(a: Int, b: Int): Int = a + b
        override fun subtract(a: Int, b: Int) = a - b
    }

    calculate(20, 5, mt)

    - หรือนำออบเจ็กต์ของอินเทอร์เฟซมาใส่เป็นอาร์กิวเมนต์โดยตรง เพื่อลดทอนขั้นตอนที่
    ต้องสร้างเป็นตัวแปรขึ้นมาก่อน

* */

interface Math {
    fun add(a: Int, b: Int) : Int
    fun subtract(a: Int, b: Int) : Int
}

interface MouseClick {
    fun onclick()
}

fun calculate(x: Int, y: Int, math: Math) { // Math เป็นอินเทอร์เฟซ
    println("$x + $y = ${math.add(x, y)}")
    println("$x - $y = ${math.subtract(x, y)}")
}

class Button {
    fun onMouseClick(m: MouseClick) {
        m.onclick()
    }
}

fun main(args: Array<String>) {

    calculate(20, 5, object: Math {
        override fun add(a: Int, b: Int): Int = a + b
        override fun subtract(a: Int, b: Int): Int = a - b
    })

    val bt = Button()
    bt.onMouseClick(object: MouseClick {
        override fun onclick() {
            println("Mouse Click")
        }
    })

}
