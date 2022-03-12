import java.util.*
import java.*;
import kotlin.random.*;
// การใช้ฟังก์ชัน apply กับสมาชิกของคลาส
class Spy  {
    var name = ""
    var code = ""
    var yearBorn = 0
    fun getAge() = java.time.LocalDate.now().year - yearBorn
}
/*
* val spy = Spy()
    spy.name = "James Bond"
    spy.code = "007"
    spy.yearBorn = 1980
    println(spy.name)
    println(spy.code)
    println(spy.getAge())
* จากโค้ด จะเห็นได้ว่า เราต้องระบุอินสแตนซ์เดิมซ้ำๆ หลายครั้ง ดังนั้นใน Kotlin จึงมีฟังก์ชัน
*  apply
* */
fun main(args: Array<String>) {
    val spy = Spy()
    spy.apply {
        name = "James Bond"
        code = "007"
        yearBorn = 1980
        println(name)
        println(code)
        println(getAge())
    }
}
