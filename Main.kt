import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
fun main(args: Array<String>) {
/*
    Function & Lambda
    fun printOneToTen() {
        for (i in 1..10) {
            println(i)
        }
    }
    fun oddEven(num: Int) {
            if (num % 2 == 0) {
                print("Even")
            } else {
                print("Odd")
            }
        }

        fun repeatString(str: String, times: Int, separator: String) {
        if (str != "" && times > 0) {
            var text = ""
            for (i in 1..times) {
                if (i > 1) {
                    text += separator
                }
                text += str
            }
            print(text)
        }
    }

    fun thaiLongDate(day: Int, month: Int, yearCE: Int) {
        // เปลี่ยนแปลงค่าของ พารามิเตอร์
        var m = arrayOf("มกราคม")
        // yearCE += 543 Error
        var yearBE = yearCE
        yearBE += 543
        print("$day ${m[month - 1] } $yearBE")
    }

    การเรียกใช้ฟังก์ชัน
    fun main() {
      printSawasdee()
    }
    fun printSawasdee() {
        print("สวัสดี")
    }

    การส่งผลลัพธ์กลับจากฟังก์ชัน
* */
    val n : Int = add(10, 20)
    val m = add(40, 50)
    val friday = thaiDayName(6)
    println("วันนี้ตรงกับวัน ${thaiDayName(1)}")
    println("30 + 40 = ${add(30, 40)}")
}
    fun add(n1: Int, n2: Int) : Int {
        val a = n1 + n2
        return a
    }

    fun thaiDayName(dayOfWeek: Byte) : String {
        val dayNames = arrayOf("อาทิตย์", "อาทิตย์", "อาทิตย์", "อาทิตย์", "อาทิตย์", "อาทิตย์", "อาทิตย์")
        if (dayOfWeek in 1..7) {
            return  dayNames[dayOfWeek - 1]
        } else {
            return ""
        }
    }