/*

    อินสแตนซ์และตัวแปรที่ต้องใช้ร่วมกัน

    ภายในคลาสของแอกทีวิตี้ เช่น MainActivity หรือ คลาสอื่นๆ ก็ตาม
    หากมีอินสแตนซ์ของวิว หรือ คลาส หรือตัวแปรที่ต้องใช้ร่วมกันระหว่างเมธอด
    ต้องกำหนดตัวแปรดังกล่าวในแบบพร็อปเพอร์ตี้ (หรือฟิลด์)

    - หากเป็นอินสแตนซ์ของวิว (หรือคลาส) เราจะเรียกเมธอด findViewById()
    ในขั้นตอนนี้ไม่ได้ ต้องสร้างตัวแปรแบบ Reference ขึ้นมาก่อนเราต้องกำหนดค่าเริ่มต้น
    ให้แก่พร็อปเพอร์ตี้เสมอ

    - ใช้คีย์เวิร์ด lateinit ซึ้งมีข้อดีคือ ไม่ต้องกำหนดค่าล่วงหน้า และ จะเรียกใช้สมาชิก
    ของวิวหรือของคลาส ก็ไม่จำเป็นต้องใช้วิธีการแบบ Nullable อีกด้วย แต่จะใช้กับชนิดข้อมูล
    พื้นฐาน หรือ Primitive Type ไม่ได้ (เช่น Int, Double, Boolean)

    class MainActivity: AppCompatActivity() {
        private lateinit var btnOK: Button
        private lateinit var txtData: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            btnOK = findViewById(R.id.button)
            txtData = findViewById(R.id.textView)
        }

        private fun test() {
           btnOK.text = "Hello" // เรียกสมาชิกแบบปกติ ไม่ต้องใช้วิธี Nullable
           btnOK.performclick() // เรียกสมาชิกแบบปกติ ไม่ต้องใช้วิธี Nullable
           val str = txtData.text // เรียกสมาชิกแบบปกติ ไม่ต้องใช้วิธี Nullable
        }
    }

    หากเป็นตัวแปรของชนิดข้อมูลพื้นฐาน เช่น Int, Double, Boolean ยกเว้นชนิด String
    ไม่สามารถใช้ lateinit ได้ ต้องกำหนดค่าดีฟอลต์ให้กับมัน หรือใช้วิธีการแบบ Nullable

    class MainActivity: AppCompatActivity() {
        private var intNumber: Int = 0
        private var floatNumber: Float? = null
        private var bool: Boolean = false

        override fun onCreate(savedInstanceState: Bundle?) {
        }
    }


* */

fun main(args: Array<String>) {

}