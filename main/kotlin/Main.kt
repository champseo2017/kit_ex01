/*

    อินสแตนซ์และตัวแปรที่ต้องใช้ร่วมกัน

   ใช้ m พิมพ์เล็ก นำหน้าชื่อพร็อปเพอร์ตี้หรือตัวแปรที่ใช้ร่วมกันระหว่างเมธอด
   และ กำหนดโมดิฟายเออร์เป็น private เช่น

   class MainActivity: AppCompatActivity() {
    private lateinit var mBtnOK: Button
    private lateinit var mTxtData: TextView
    private var mIntNumber: Int = 0
    private var mFloatNumber: Float? = null
    private var mBool: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtnOK = findViewById(R.id.button)
        mTxtData = findViewById(R.id.textView)
    }

    private fun test() {
       mBtnOK.text = "Hello"
       mBtnOK.performClick()
       val str = mTxtData.text
       mIntNumber = 100
       mFloatNumber = 123.45f
       mBool = true
    }

   }


* */

fun main(args: Array<String>) {

}