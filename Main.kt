import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
    พารามิเตอร์แบบ Default Value
    val a = total(10, 100.0) // default คือ vat = 7.0
    val b = total(5, 500.0, 7.5)
    // หากใช้ค่า vat ที่แตกต่างจาก default ต้องระบุค่าตามปกติ
    fun total(q: Int, p: Double, vat: Double = 7.0) = q * p * (1 + (vat/100))

    Kotlin สามารถว่างค่า default ไว้หน้า พารามิเตอร์แบบปกติได้
    fun total(vat: Double = 7.0, q: Int, p: Double) = q * p * (1 + (vat / 100))
    val a = total(q = 10, p = 100.0) // ใช้ค่า default คือ vat = 7.0
    val b = total(vat = 7.5, q = 5, p = 500.0)
    val c = total(p = 500.0, q = 5, vat = 7.5) // สลับตำแหน่งกันได้
* */
fun main(args: Array<String>) {

}

