import java.util.*
import java.*;
import kotlin.random.*;

/* Superclass มีเฉพาะ Secondary Constructor

สืบทอดคลาสที่มีเฉพาะคอนสตรักเตอร์แบบ Secondary ใช้วิธีเดียวกับกรณีที่คลาสนั้นมี
เพียงคอนสตรักเตอร์แบบ Primary

* */

open class Device {
    constructor(os: String) {

    }
}

class Tablet(var osName: String) : Device(osName) {
}

class Smartphone(osName: String, brandName: String)
    : Device(osName) {
}

class Phablet: Device {
    constructor(osName: String): super(osName) {

    }
}

fun main(args: Array<String>) {

}
