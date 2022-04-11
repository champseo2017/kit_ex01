import java.util.*
import java.*;
import kotlin.random.*;

/*
   การสร้างคอนสตรักเตอร์เพิ่มเติมให้แก่ Subclass

* */

open class Device(var os: String)

class Tablet(var osName: String): Device(osName) {
    constructor(osName: String, brandName: String): this(osName) {}
    constructor(osName: String, osVersion: Double, brandName: String)
            : this(osName) {
    }
}

open class Computer
class NoteBook(var brand: String) : Computer() {
    private var model = ""
    constructor(brand: String, model: String,
                processor: String, memory: Int, display: Double) : this(brand) {
                this.model = model
    }
}


fun main(args: Array<String>) {

}
