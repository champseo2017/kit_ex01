/*

   Resource ชนิด values
   Resource ชนิด (Simple) Values จะจัดเก็บข้อมูลในแบบ XML อย่างง่ายๆ ในตำแหน่ง
   app/res/values

   <resources>
       <ชนิดแท็ก name="ชื่อข้อมูล">ค่าของข้อมูล</ชนิดแท็ก>
       <ชนิดแท็ก name="ชื่อข้อมูล">ค่าของข้อมูล</ชนิดแท็ก>
   </resources>

   การกำหนดแท็ก เราต้องพิจารณาว่าข้อมูลนั้นจัดอยู่ในชนิดหรือประเภทใด แล้วเลือกใช้ชนิดแท็ก
   ที่สอดคล้องกับชนิดข้อมูลนั้น โดยในแอนดรอยด์ มีชนิดข้อมูลและชนิดแท็กที่ใช้คู่กัน ดังนี้


   ชนิดข้อมูลและชนิดแท็กที่ใช้คู่กัน
   ชนิดข้อมูล string
   แท็ก <string></string>
   ตัวอย่าง <string name="title">Android with Kotlin</string>

   ชนิดข้อมูล integer
   แท็ก <integer></integer>
   ตัวอย่าง <integer name="version">10</integer>

   ชนิดข้อมูล bool
   แท็ก <bool></bool>
   ตัวอย่าง <bool name="is_fist_time">true</bool>

   ชนิดข้อมูล color
   แท็ก <color></color>
   ตัวอย่าง <color name="red">#00FFFF</color>

   ชนิดข้อมูล dimen
   แท็ก <dimen></dimen>
   ตัวอย่าง <dimen name="button_width">50dp</dimen>

   ชนิดข้อมูล array
   แท็ก <array>
    <item></item>
    <item></item>
   </array>
   ตัวอย่าง
   <array name="android_langs">
    <item>Java</item>
    <item>Kotlin</item>
    <item>C++</item>
   </array>

   - ชื่อรีซอร์ส (แอตทริบิวต์ name) นิยมเขียนเป็นตัวพิมพ์เล็กทั้งหมด
   คั่นระหว่างคำด้วย under score (_) เช่น name="app_version"
   ชื่อควรจะสื่อความหมาย อาจต้องนำไปอ้างถึง ในโค้ด Java/Kotlin หรือ
   ไฟล์เลย์เอาต์

   - รีซอร์สชนิด bool กำหนดค่าอย่างใด อย่างหนึ่งระหว่าง true กับ false

   - รีซอร์สชนิด integer เก็บได้เฉพาะจำนวนเต็ม หากเป็นทศนิยมให้เก็บเป็นชนิด string

   - รีซอร์สชนิด color ให้กำหนดค่าเป็น hexadecimal ในแบบ #rgb โดยต้องเขียนด้วยตัว
   พิมพ์เล็ก ทั้งหมด เช่น #0ff หรือ 80ffa9 หรือ กำหนดในแบบ #argb เช่น #55ddcc66

   - รีซอร์สชนิด dimen (มาจาก dimension) กำหนดขนาดเป็นตัวเลขแล้วตามด้วยหน่วย
   (ต้องเขียนติดกัน) ซึ่งในระบบแอนดรอยด์ นิยมกำหนดขนาดดังนี้

    - ระยะหรือขนาดทั่วๆ ไป นิยมกำหนดหน่วยเป็น dp
     <dimen name="button_width">100dp</dimen>

    - ขนาดของฟอนต์ กำหนดเป็นหน่วย sp
     <dimen name="font_size">20sp</dimen>



* */

fun main(args: Array<String>) {

}