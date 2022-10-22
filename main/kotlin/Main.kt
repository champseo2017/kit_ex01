import java.awt.Shape

/*

    การใช้ฟังก์ชัน ?.let {}
    - กำหนดสิ่งที่จะดำเนินการ หากตัวแปรไม่มีค่าเป็น null
     ใช้ ฟังก์ชัน let โดยเรียกผ่านตัวแปรที่ทำการตรวจสอบด้วยโอเปอเรเตอร์
     Safe Call (?.) แล้วกำหนดการกระทำไว้ในบล็อก {}

     - let มีพารามิเตอร์เป็น functions Type ฟังก์ชั่นนี้จึงเป็นแบบแลมบ์ดา
       สามารถนำพารามิเตอร์ it มาใช้แทนตัวแปรได้ รวมถึงไม่ต้องใช้คำสั่ง return


* */


fun main(args: Array<String>) {

//    print("Please enter string >>")
//    val str: String? = readLine()
//
//    str?.let {
//        print("string => $str")
//    }

    /*
    * เทียบเท่ากับการตรวจสอบ if เช่น
    * if (str !== null) {
    *  print("string => $str")
    * }
    *
    * */

    print("Please enter website >>")
    val str: String? = readLine()
    val url = str?.let {
        "https//$str"
    }

    println(url ?: "")


}