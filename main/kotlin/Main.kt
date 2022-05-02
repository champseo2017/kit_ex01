/*
    คลาส MainActivity
    class MainActivity: AppCompatActvity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }

    - MainActivity เป็นชื่อคลาสของแอกทิวิตี้หลัก ซึ้งจะถุกเรียกขึ้นมาทำงานเป็นอันดับแรก
    เมื่อเราเปิดแอป และ คลาสนี้สืบทอดมาจาก AppCompatActvity

    - override fun onCreate(savedInstanceState: Bundle?)
       - เป็นการโอเวอร์ไรด์เมธอด onCreate() ของ Superclass
       เพื่อกำหนดวิธีดำเนินการเริ่มแรกเมื่อแอกทิวิตี้ถูกสร้างขึ้น ส่วนพารามิเตอร์
       (savedInstanceState: Bundle?) ใช้ตรวจสอบข้อมูลสถานะบางอย่างสำหรับ
       บางกรณี

    - super.onCreate(savedInstanceState) เรียกเมธอด onCreate()
    ของ Superclass พร้อมส่งค่าสถานะจากพารามิเตอร์ savedInstanceState ไปให้มัน

    - setContentView(R.layout.activity_main)
     - setContentView() เป็นการนำโครงร่างหรือเลย์เอาต์ที่เขียนในแบบ XML มากำหนด
     เป็นเนื้อหาของแอกทิวิตี้

     - R.layout.activity_main
       - คลาส R คือคลาสที่ใช้อ้างถึง Resource ต่างๆ ภายในแอป ซึ้งไฟล์ activity_main.xml
       อยู่ในกลุ่ม res -> layout จึงอ้างไฟล์ดังกล่าวผ่านคลาส R ในแบบ
       R.layout.activity_main


* */

fun main(args: Array<String>) {

}