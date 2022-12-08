import kotlin.random.*

/*

   Abstract Class
   - ไม่กำหนดวิธีการทำงาน ให้ subclass ไปกำหนดวิธีการทำงานเพิ่มเติมเอาเอง
   - ระบุคีย์เวิร์ด abstract ไว้ก่อนคำว่า class เสมอ คลาสประเภทนี้สามารถสืบทอด
   ได้โดยปริยาย เช่น abstract class Test
   - ภายในคลาส มีสมาชิกแบบปกติ คือ พร็อปเพอร์ตี้ที่ระบุค่าเริ่มต้น หรือ เมธอดที่กำหนด
   วิธีทำงานให้กับมันเรียบร้อยแล้ว รวมทั้งสมาชิกแบบ Abstract
     - สมาชิกแบบ Abstract ระบุคีย์เวิร์ด val/val หรือ fun ไม่ต้องมี โมดิฟายเออร์ open
     สมาชิกประเภทนี้ต้องถูกโอเวอร์ไรด์ได้อยู่แล้ว
     - สมาชิกแบบ Abstract เป็นพร็อปเพอร์ตี้ ไม่ต้องกำหนดค่าให้กับมัน หากเป็นเมธอด
     ไม่ต้องกำหนดวิธีการทำงานให้กับมัน

    - ไม่สามารถสร้างอินสแตนซ์ของคลาสที่เป็น Abstract ได้ ต้องสืบทอดแล้วใช้งานผ่าน Subclass
    ต้องโอเวอร์ไรด์สมาชิกที่เป็น Abstract ให้ครบทั้งหมด

* */

abstract class Shape3D {
    abstract val PI: Double
    private var color: String? = null

    abstract fun surfaceArea(): Int // Abstract Method
    abstract fun volume() : Int
    fun shapeName() : String = this.javaClass.name
}

class Box (var w: Int, var l: Int, var h: Int) : Shape3D() {
    override var PI = 3.14
    override fun volume() : Int = w * l * h
    override fun surfaceArea() = (w * l * 2) + (w * h * 2) +
            (l * h * 2)
}


fun main(args: Array<String>) {

   val b = Box(10, 20, 30)
   println(b.shapeName())
   println(b.volume())
   // val shape = Shape3D() // Error ใช้งาน Abstract class โดยตรงไม่ได้

}
