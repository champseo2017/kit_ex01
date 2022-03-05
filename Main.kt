import java.util.*
import java.*;
import kotlin.random.*;
// หากกำหนด private ให้แก่เมธอด จะไม่สามารถเข้าถึงได้จากภายนอกคลาส
class ThaiDate(private var day: Int, private var month: Int, private var year: Int) {
     init {
         if (!validDate(day, month, year)) {
             day = 0; month = 0; year = 0
         }
     }
    private val m = arrayOf("มกราคม")
    fun getMonthName() : String ? {
        return if (month in 1..12) m[month - 1] else null
    }
    private fun validDate(d: Int, m: Int, y: Int) : Boolean {
        return try {
            java.time.LocalDate.of(y, m, d)
            true // ถ้าไม่ผิดพลาด ก็คืนค่า true
        } catch (ex: Exception) {
            false
        }
    }
}
fun main(args: Array<String>) {
    val thDate = ThaiDate(31, 13, 2020)
    print(thDate.getMonthName() ?: "Error")
    // if (thDate.validDate(32, 1, 31)) {} // Error (เพราะเป็น private)
}
