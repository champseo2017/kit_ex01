/*

  การใช้ออบเจ็กต์ resources

  การอ้างถึงด้วยคลาส R เฉพาะข้อมูล R.string เท่านั้นจะคืนค่ากลับมาเป็นชนิด string โดยตรง
  ส่วน R.integer, R.bool, R.color จะคืนค่ากลับมาเป็นชนิด Int แม้ว่าค่าที่เราเก็บเอาไว้จะไม่
  ใช้ตัวเลขก็ตาม ออบเจ็กต์ resources ดึงค่าที่แท้จริงออกมาใช้

  string เมธอด getString(R.type.name) รีซอร์สชนิด string ที่กำหนดด้วยแท็ก <string>

  Int เมธอด
  getInteger(R.type.name) รีซอร์สชนิด integer ที่กำหนดด้วยแท็ก <integer>

  Float เมธอด
  getDimension(R.type.name) รีซอร์สชนิด dimen ที่กำหนดด้วยแท็ก <dimen>

  Boolean เมธอด
  getBoolean(R.type.name) รีซอร์สชนิด bool ที่กำหนดด้วยแท็ก <bool>

  Int เมธอด
  getColor(R.type.name, theme) รีซอร์สชนิด color ที่กำหนดด้วยแท็ก <color>

  Array<String> เมธอด
  getStringArray(R.type.name) รีซอร์สชนิด array ที่กำหนดด้วยแท็ก <array>

  Drawable เมธอด
  getDrawable(R.type.name, theme) รีซอร์สชนิด drawable


  เมธอด getColor() และ getDrawable() สามารถกำหนดค่า theme เป็น null ได้

  แนวทางการใช้ ออบเจ็กต์ resources เช่น เก็บข้อมูลไว้ในไฟล์รีซอร์ส

  <resources>
    <string name="title">Android</string>
    <integer name="price">325</integer>
    <bool name="is_valid">true</bool>
    <dimen name="height">100dp</dimen>
    <color name="text_color">#00ff00</color>
    <array>
       <item>One</item>
       <item>Two</item>
       <item>Three</item>
    </array>
  </resources>

  สามารถเข้าถึงค่าในรีซอร์สด้วยโค้ด kotlin ดังนี้

  val title: String = resources.getString(R.string.title)
  val isValid: Boolean = resources.getBoolean(R.bool.is_valid)
  val price: Int = resources.getInteger(R.integer.price)
  val height = resource.getDimension(R.dimen.height)
  val color = resource.getColor(R.color.text_color, null)
  val numText = resources.getStringArray(R.array.num_text)

  ส่วนกรณีของ drawable ใช้แนวทางเดียวกับรีซอร์สชนิดอื่นๆ เช่น
  ไฟล์ภาพชื่อ logo

  val img = resources.getDrawable(R.drawable.logo, null)
  หรือต้องการอ้างถึงในไฟล์ XML ก็ใช้รูปแบบ @drawable/ชื่อภาพ เช่น หากไฟล์ภาพชื่อ brid
  ก็กำหนดเป็น @drawable/brid

* */

fun main(args: Array<String>) {

}