import java.util.*
import java.*;
import kotlin.random.*;

enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

enum class DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

enum class MobileOS { ANDROID, IOS }

enum class Storage { GB16, GB32, GB64, GB128, GB256, GB512 }

class Device {
    private var os: MobileOS = MobileOS.ANDROID
    var storage: Storage = Storage.GB64

    fun setOS(os: MobileOS) {
        this.os = os
    }

    fun getOS() : MobileOS = this.os

}

enum class Gender (var value: String) { // Primary Constructor
    MALE("ชาย"), FEMALE("หญิง"), SHEMALE ("เพศที่สาม")
}

enum class Result(val value: Byte) { // enum แบบมี value ต้องกำหนด Primary Constructor
    WON (3), DRAWN (1), LOST(0)
}

fun main(args: Array<String>) {
   var gen = Gender.FEMALE.value // หญิง
    Gender.SHEMALE.value = "กระเทย"
    // เนื่องจากระบุคอนสตรักเตอร์ด้วย var จึงเปลี่ยนค่าได้

    println("ถ้าชนะจะได้ ${Result.WON.value} คะแนน")

    var score = 0
    var r: Result = Result.DRAWN
    score += r.value
    println("ถ้าแพ้จะได้ ${score} คะแนน")
}
