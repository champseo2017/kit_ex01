import kotlin.random.*

/*

    การแปลงชนิดข้อมูลด้วย as และ as?
    - การใช้ as (Unsafe Cast Operator)
      ควรใช้ as เมื่อแน่ใจจริงๆ ว่าสามารถแปลงชนิดข้อมูลนั้นได้ มิฉะนั้นจะเกิดข้อ
      ผิดพลาดขึ้น เช่น ลักษณะการใช้ as กับชนิดข้อมูลพื้นฐานและ Any

      val a: Int = 10
        val b: Double = a as Double // Runtime Error
        val c = "123"
        val d = c as Int // Runtime Error

        var x: Any = 12.34
        x++ // Error ชนิด Any ตำนวณไม่ได้
        var y = x as Double // OK
        y++
        val z = x as Int // Runtime Error

      - กรณีของคลาส
       - อินสแตนซ์ของ Subclass ก็จะเป็นอินสแตนซ์ของ Superclass ของมันไปด้วย
       - เราสามารถใช้ as เพื่อแปลงจาก Type ของ Subclass ไปเป็น Type ของ
         Superclass
       - ไม่สามารถแปลงจากชนิดข้อมูลของ Superclass ไปเป็นของ Subclass ได้

       open class Tea
class IceTea: Tea()
var it = IceTea()
    var t: Tea = it as Tea // OK (Subclass => Superclass)
    var t2 = Tea()
    var it2: IceTea = t2 as IceTea // Error (super => sub)

* */


fun main(args: Array<String>) {




}
