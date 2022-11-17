import kotlin.random.*

/*

    Enum Class
    - ไม่สามารถกำหนดชื่อสมาชิกเป็นภาษาไทยได้
    ยกเว้นจะกำหนดเป็นค่า Value ของสมาชิกแต่ละตัว

    - ชื่อของ Enum นิยมตั้งเป็นตัวใหญ่

    - การกำหนดค่าค่า enum ให้แก่ตัวแปร ควรเป็น type enum

    - enum จะเป็นตัวเลขหรือ สตริง ไม่ต้องเขียนใน ""

    enum class ชื่อ {
     สมาชิกตัวที่ 1,
     สมาชิกตัวที่ 2,
    }

    - กำหนด value ให้กับ Enum
      - ระบุ Primary Constructor ในแบบพร็อเพอร์ตี้

* */

enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

enum class DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

enum class MobileOS {
    ANDROID, IOS
}

enum class Storage {
    GB16, GB32, GB64, GB128, GB256, GB512
}

class Device {
    private var os: MobileOS = MobileOS.ANDROID
    var storage: Storage = Storage.GB64

    fun setOS(os: MobileOS) {
        this.os = os
    }

    fun getOS(): MobileOS = this.os
}

fun main(args: Array<String>) {

    var dw: DayOfWeek
    dw = DayOfWeek.SATURDAY
    dw = DayOfWeek.FRIDAY

    val birthday = DayOfWeek.WEDNESDAY
    var today = DayOfWeek.MONDAY

    if (today == DayOfWeek.FRIDAY) {
        val tomorrow = DayOfWeek.SATURDAY
    }

    println(when (today) {
        DayOfWeek.FRIDAY -> "วันศุกร์"
        else -> "วันอื่น"
    })

    val dv = Device()
    dv.storage = Storage.GB128
    dv.setOS(MobileOS.IOS)
    println(dv.getOS())
    // dv.setOS(MobileOS.DOS) // Error เพราะไม่ใช้สมชิกของ MobileOS

    var gen = Gender.FEMALE.value // หญิง
    Gender.SHEMALE.value = "กระเทย"
    // ระบุคอสสตรักเตอร์เป็น var จึงเปลียนค่าได้

    println("ถ้าชนะ จะได้ ${Result.WON.value} คะแนน")
    var score = 0
    val r: Result = Result.DRAWN
    score += r.value

}

// enum ในแบบมี value
enum class Gender (var value: String) {
    MALE ("ชาย"), FEMALE ("หญิง"), SHEMALE ("เพศที่สาม")
}

enum class Result(val value: Byte) {
    WON (3), DRAWN (1), LOST (0)
}