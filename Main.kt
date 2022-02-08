import java.util.*

/*
    การใช้ฟังก์ชัน ?.let {}
    กำหนดสิ่งที่จะดำเนินการ หากตัวแปรไม่มีค่าเป็น null การใช้ฟังก์ชัน let โดยเรียกผ่าน
    ตัวแปรที่ทำการตรวจสอบด้วยโอเปอเรเตอร์ Safe Call (?.) แล้วกำหนดการกระทำไว้ใน
    บล็อก {} เช่น
    print("Please enter string >>")
    val str: String? = readLine()
    str?.let {
        print("string => $str")
    }
    // เทียบเท่ากับการตรวจสอบด้วย if เช่น
    /*
    if (str != null) {
        print("string => $str")
    }
    * */
* */
fun main(args: Array<String>) {
    print("Please enter website >>")
    val str: String? = readLine()
    var str1: String = ""
    val url = str?.let {
        // ไม่ใช้ null ?.let จึงดำเนินการ
        if (!it.startsWith("http://") || (!it.startsWith("https://"))) {
            str1 = "https//$str"
        }
    }
    println(str1 ?: "")
}