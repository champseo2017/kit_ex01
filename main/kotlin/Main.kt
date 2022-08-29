/*

    อินสแตนซ์และตัวแปรที่ต้องใช้ร่วมกัน

    ภายในคลาสของแอกทีวิตี้ เช่น MainActivity หรือ คลาสอื่นๆ ก็ตาม
    หากมีอินสแตนซ์ของวิว หรือ คลาส หรือตัวแปรที่ต้องใช้ร่วมกันระหว่างเมธอด
    ต้องกำหนดตัวแปรดังกล่าวในแบบพร็อปเพอร์ตี้ (หรือฟิลด์)

    - หากเป็นอินสแตนซ์ของวิว (หรือคลาส) เราจะเรียกเมธอด findViewById()
    ในขั้นตอนนี้ไม่ได้ ต้องสร้างตัวแปรแบบ Reference ขึ้นมาก่อนเราต้องกำหนดค่าเริ่มต้น
    ให้แก่พร็อปเพอร์ตี้เสมอ

    - ใช้หลักการของ Nullable โดยกำหนดค่าเป็น null ไว้ล่วงหน้า และ หลังจากเรียก
    เมธอด setContentView() แล้ว เราค่อยอ้างถึงวิวด้วย findViewById()
    เราจะเรียกใช้สมาชิกของวิวหรือคลาส ต้องใช้วิธีการแบบ Nullable ด้วย


    class MainActivity: AppCompatActivity() {
        private var btnOK: Button? = null
        private var txtData: TextView? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            btnOK = findViewById(R.id.button)
            txtData = findViewById(R.id.textView)
        }

        private fun test() {
            btnOK?.text = "Hello" // เรียกสมาชิกแบบ Nullable
            btnOK?.performClick() // เรียกสมาชิกแบบ Nullable
            val str = txtData!!.text // เรียกสมาชิกแบบ Nullable
        }

    }


* */

fun main(args: Array<String>) {

}