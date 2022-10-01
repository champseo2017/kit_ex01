/*

  คลาส DecimalFormat
  อยู่ในแพ็คเกจ java.text.DecimalFormat ใช้สำหรับ
  จัดรูปแบบตามที่เรากำหนด ด้วยการนำสัญลักษณ์ต่างๆ มากำหนดเป็นรูป
  แบบตามที่เราต้องการหรือ เรียกว่า (Pattern) DecimalFormat มีความ
  ยืดหยุ่นมากกว่า NumberFormat

  - สัญลักษณ์ที่ใช้ในการกำหนดแพตเทิร์นคือ (เฉพาะที่น่าสนใจ)

  , ใช้แทนเครื่องหมายคอมม่า (,)
  . ใช้แทนเครื่องหมายจุด (.)
  # ใช้แทนเลขใดๆ ก็ได้ ณ ตำแหน่งนั้น
  % แปลงเป็นเปอร์เซ็นต์
  0 ใช้แทนเลขใดๆ ก็ได้ ณ ตำแหน่งนั้น หากตำแหน่งนั้นว่าง จะใส่เลข
  0 เข้าไปแทน

  ตัวอย่างแพตเทิร์น
  ##### 123 = 123
  00000 123 = 00123
  0.00 1.2 = 1.20
  00.00 1.2 = 01.20
  #,### 123456 = 1,234,456
  #.##% 0.086 = 8.6%

  - สร้างอินสแตนซ์ (ตัวแปร) ของคลาส DecimalFormat
  - กำหนดรูปแบบที่ต้องการด้วยเมธอด format() return กลับมาเป็น
  string เสมอ
  - กำหนดแพตเทิร์นใหม่ด้วย applyPattern()




* */

import java.text.DecimalFormat

fun main(args: Array<String>) {

    val pattern = "#,#"
    var decimalFormat = DecimalFormat()
    var str = decimalFormat.format(1234567)
    println(str)

    decimalFormat.applyPattern("00000")
    str = decimalFormat.format(123)
    println(str)

    decimalFormat.applyPattern("#.##%")
    str = decimalFormat.format(0.086)
    println(str)

    decimalFormat.applyPattern("00.00")
    str = decimalFormat.format(1.2)
    println(str)


}