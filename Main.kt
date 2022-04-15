import java.util.*
import java.*;
import kotlin.random.*;

/*
    Object Expression

    ถ้าต้องการใช้งานอินเทอร์เฟซไปใช้งาน ต้องสร้างคลาสขึ้นมาสืบทอด ซึ้งจะเกิดความยุ่งยาก
    เมื่อใช้ อินเทอร์เฟซจำนวนมาก

    Anonymous (Inner) Class

    object: interface_name {
        // โอเวอร์ไรด์สมาชิกของอินเทอร์เฟซที่เป็น Abstract ตามปกติ
    }

* */

interface Math {
    fun add(a: Int, b: Int): Int
    fun subtract(a: Int, b: Int): Int
}

// function หรือ class รับพารามิเตอร์เป็นอินเทอร์เฟซ
fun calculate(x: Int, y: Int, math: Math) { // Math เป็นอินเทอร์เฟซ
    println("$x + $y = ${math.add(x, y)}")
    println("$x - $y = ${math.subtract(x, y)}")
}

interface MouseClick {
    fun onClick()
}

class Button {
    fun onMouseClick(m: MouseClick) {
        m.onClick()
    }
}


fun main(args: Array<String>) {

//    var mt = object: Math {
//        override fun add(a: Int, b: Int): Int = a + b
//        override fun subtract(a: Int, b: Int) = a - b
//    }

    calculate(20, 5, object: Math { // object เป็นอาร์กิวเมนต์โดยตรง
        override fun add(a: Int, b: Int): Int = a + b
        override fun subtract(a: Int, b: Int) = a - b
    })

    val bt = Button()
    bt.onMouseClick(object: MouseClick {
        override fun onClick() {
            println("Mouse Click")
        }
    })

}
