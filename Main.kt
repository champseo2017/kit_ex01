import java.util.*
import java.*;
import kotlin.random.*;

/*
    Smart Cast
    ตรวจสอบชนิดข้อมูลด้วย is แปลงข้อมูลด้วย as

    fun increment(x: Any) : Int? {
        var n: Int
        return if (x is Int) {
            n = x as Int
            ++n
        } else null
    }

    หากตรวจสอบด้วย is แล้วให้ผลลัพธ์เป็น true (เป็น type ตามที่ระบุ) ตัวแปรจะถูกแปลงเป็นชนิด
    ที่เราตรวจสอบโดยอัตโนมัติ และ สามารถนำปใช้งานได้เลย โดยไม่จำเป็นต้องแปลงด้วย as

* */

   fun increment(x: Any) : Int ? {
       var n: Int
       return if (x is Int) {
          n = x // x ถูกแปลงเป็นชนิด Int โดยอัตโนมัติ เมื่อเราตรวจสอบด้วย if
          ++n
       } else null

       /*  หรือใช้ when
       *   return when (x) {
       *    is Int -> { n = x; ++n }
       *    else -> null
       *   }
       * */
   }



fun main(args: Array<String>) {

}
