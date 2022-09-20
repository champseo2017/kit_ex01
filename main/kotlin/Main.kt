/*
   การตรวจสอบจุดเริ่มต้นและสิ้นสุดสตริง

   - คือ การตรวจสอบว่าสตริงนั้นเริ่มต้น หรือ ลงท้ายด้วยสตริงที่ระบุหรือไม่

   - startWith(สตริง [,ignoreCase=true/false])
     - ตรวจสอบว่าขึ้นต้นด้วยสตริงที่ระบุหรือไม่ ใช้คืนค่า true
       ignoreCase เป็นบอกว่าสนใจตัวพิมพ์หรือไม่

   - endsWith(สตริง [,ignoreCase=true/false])
     - ตรวจสอบว่าลงท้ายด้วยสตริงที่ระบุหรือไม่ ใช้คืนค่า true

   - หากไม่ระบุ ignoreCase หรือ กำหนดค่าเป็น true ถือว่า ไม่ สนใจความแตกต่าง
   ของตัวพิมพ์

   val url = "http://www.deve.com"
    if (url.startsWith("http://")
        || url.startsWith("https://")) {
        println("ggwp")
    } else if (url.endsWith(".com")) {
        println("ggwp")
    }

    val img = "logo.png"
    if (img.endsWith("PNG", ignoreCase = true)) {
        print("gogog")
    }


* */

fun main(args: Array<String>) {




}