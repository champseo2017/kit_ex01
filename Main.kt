import java.util.*
import java.*;
import kotlin.random.*;

/*
   Generic Type ในแบบ in และ out
   หากต้องการให้ใช้ Generic Type เฉพาะการนำข้อมูลเข้าหรือออกเพียงอย่างใด อย่างหนึ่ง
    - ระบุคีย์เวิร์ด in เมื่อต้องการให้ใช้เฉพาะกับการนำเข้า
    - ระบุคีย์เวิร์ด out เมื่อต้องการให้ใช้เฉพาะกับการส่งออก (ยกเว้นคอนสตรักเตอร์)

    class Data<in T>(value: T) {
       private var v = value as Any
       // ส่งข้อมูลออกเป็นชนิด Generic Type ไม่ได้ ทำได้เฉพาะการนำเข้ามา
       fun type(): T = v::class.simpleName as T // Error
       fun value(): T = v as T // Error
       fun setValue(value: T) {
          this.v = value as Any
       }
    }

    class Data<out T>(value: T) {
        private var v = value as Any
        // ส่งข้อมูลออกเป็นชนิด Generic Type ได้ แต่นำเข้ามาไม่ได้
        fun type(): T = v::class.simpleName as T // OK
        fun value(): T = v as T // OK
        fun setValue(value: T) { // Error
          this.v = value as Any
        }
    }

* */

fun main(args: Array<String>) {

}
