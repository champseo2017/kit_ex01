import kotlin.math.*
import kotlin.random.*;
import java.text.NumberFormat
import java.text.DecimalFormat
/*
    พารามิเตอร์ it
* */
fun main(args: Array<String>) {
    val inc: (Int) -> Int = {it + 1}
    val oe: (Int) -> String = {if (it % 2 == 0) "Event" else "Odd"}
    val echo: (String) -> Unit = {println(it)}
}