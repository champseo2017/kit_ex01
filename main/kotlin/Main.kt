/*
    การจัดรูปแบบตัวเลข

    คลาส NumberFormat
    - ใน Kotlin ยังไม่มีคลาสที่ใช้สำหรับการจัดรูปแบบตัวเลข
    แต่สามารถนำคลาสของ Java มาใช้ได้ นั่นคือ คลาส NumberFormat
    (แพ็คเกจ java.text.NumberFormat)

    - คลาส NumberFormat มีเมธอดในการสร้างอินสแตนซ์ดังนี้

    - getInstance()
      - เป็นการจัดรูปแบบพื้นฐานคือ ให้มีเครื่องหมายคอมม่า (,) คั่นหลักพัน
      มีทศนิยมไม่เกิน 3 ตำแหน่ง เช่น 12345 => 12,345 หรือ
      1141.59265 => 1,141.592

     - getCurrencyInstance()
       - สำหรับจัดรูปแบบทางการเงิน เช่น มี $ หรือ ฿ นำหน้า
       ขึ้นกับการตังค่าในระบบ รวมถึงมี , คั่นหลักพันให้ด้วย และมีทศนิยม 2 ตำแหน่ง

      - getIntegerInstance()
       - จัดรูปแบบเฉพาะส่วนจำนวนจำนวนเต็ม โดยมี , คั่นหลักพัน
       ส่วนทศนิยมจะถูกตัดทิ้ง

       - getPercentInstance()
        - สำหรับจัดรูปแบบเป็นเปอร์เซ็นต์ คือการคูณด้วย 100 แล้วใช้ , คั่นหลัก
        พันให้ด้วย มีทศนิยมไม่เกิน 2 ตำแหน่ง แล้วมี % ต่อท้าย เช่น 0.75 => 75%

        จะคืนค่าเป็น String เสมอ

        var numFormat = NumberFormat.getInstance()
        var str = numFormat.format(123456789.8944444)
        println(str)

        numFormat = NumberFormat.getCurrencyInstance()
        str = numFormat.format(233323232.43434343)
        println(str)

        - คลาสเพิ่มเติม
         - setMaximumIntegerDigits(จำนวนตัวเลข)
           - ให้มีจำนวนตัวเลขในส่วนจำนวนเต็มสูงสุดไม่เกินกี่ตัว ถ้า
           เกินกว่าค่าที่ระบุนี้ตัวเลขด้านซ้ายมือจะถูกตัดออกไปให้เหลือเท่ากับจำนวนที่ระบุ

         - setMinimumlntegerDigits(จำนวนตัวเลข)
           - ให้มีจำนวนตัวเลขในส่วนจำนวนเต็มอย่างน้อยกี่ตัว ถ้ามีน้อยกว่าค่าที่ระบุนี้จะเติม
           0 ด้านซ้ายมือจนครบจำนวนตามที่ระบุ

         - setMaximumFractionDigits(จำนวนตัวเลข)
           - ให้มีเลขทศนิยมสูงสุดไม่เกินกี่ตำแหน่ง ถ้าเกินค่าที่ระบุนี้ ตัวเลขด้านขวา
           มือจะถูกตัดออกไปให้เหลือเท่ากับจำนวนที่ระบุ

         - setMinimumFractionDitgits(จำนวนตัวเลข)
           ให้มีเลขทศนิยมอย่างน้อยกี่ตำแหน่ง ถ้ามีน้อยกว่าค่าที่ระบุนี้จะเติม 0 ด้านขวามือ
           จนครบจำนวนตามที่ระบุ

         - parse(setNum_formatted)
           - แปลงตัวเลขที่จัดรูปแบบแล้ว (สตริง) กลับไปเป็นชนิดข้อมูลพื้นฐาน

* */

import java.text.NumberFormat // ใช้คลาสของ Java


fun main(args: Array<String>) {

    val numFormat = NumberFormat.getInstance()
    numFormat.minimumIntegerDigits = 10
    numFormat.minimumFractionDigits = 4

    val str = numFormat.format(1234567.89)
    println(str)

    val num = numFormat.parse(str)
    val x = num.toDouble()
    println(x)

}