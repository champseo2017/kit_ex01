import kotlin.random.*

/*

    การใช้ฟังก์ชัน apply กับสมาชิกของคลาส
     - ปกติต้องระบุอินสแตนซ์ของมันด้วยทุกครั้ง

     - apply เป็น scope function

* */

class Spy {
    var name = ""
    var code = ""
    var yearBorn = 0
    fun getAge() = java.time.LocalDate.now().year - yearBorn
}


fun main(args: Array<String>) {

    val spy = Spy()
    // spy.name = "James Bond"

    spy.apply {
        name = "James Bond"
    }


}
