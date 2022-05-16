/*

  การเข้าถึง Resource จากคลาส R

  การเข้าถึงข้อมูลในรีซอร์ส หากเป็นการใช้งานในส่วนของโค้ด Kotlin จะต้องทำผ่านคลาส R
  ถ้าสร้างโปรเจ็กต์ใหม่ Android Studio จะสร้างคลาสนี้ขึ้นมาให้โดยอัตโนมัติ

  รูปแบบการอ้างถึงข้อมูลในรีซอร์สคือ
  R.tag_name.attribute_name

  - tag_name คือ ชื่อของแท็กที่เราใช้กำหนดข้อมูลของรีซอร์ส เช่น string, color, dimen
  - attribute_name ชื่อข้อมูลที่เรากำหนดด้วยแอตทริบิวต์ name

  การอ้างถึงดังกล่าวจะคืนค่ากลับมาเป็นข้อมูลชนิด Int เกือบทั้งหมด ยกเว้น <string>
  เช่น เก็บข้อมูลในรีซอร์ส ดังนี้

  <resources>
    <string name="title">Android</string>
    <string name="author">Andy</string>
    <integer name="price">380</integer>
  </resources>

  นำข้อมูล resources มาใช้ใน kotlin

  val title: Int = R.string.title
  val author = R.string.author
  val price = R.integer.price

  การอ้างถึงรีซอร์สด้วยคลาส R นั้น เราไม่ได้นำชื่อไฟล์มาเกี่ยวข้องเลย เพราะคลาส R
  ไม่ขึ้นอยู่กับไฟล์ หากไฟล์นั้นอยู่ในโฟล์เดอร์ res/values ก็สามารถอ้างถึงด้วยรูปแบบ
  R.tag_name.attribute_name เหมือนกันหมด

  R.id ใช้ในการอ้างถึงค่า id หรือ ชื่อวิวนั่นเอง เนื่องจากเรากำหนดค่า id ในแบบ @+id
  ซึ้งเครื่องหมาย + จะทำให้ค่า id ถูกเพิ่มลงในรีซอร์สให้ด้วย ดังนั้น จึงสามารถอ้างถึงค่า
  id ผ่านคลาส R ได้

  R.layout ใช้ในการอ้างถึงไฟล์เลย์เอาต์ (ไม่ต้องระบุส่วนขยายของไฟล์) เช่น

  setContentView(R.layout.activity_main)




* */

fun main(args: Array<String>) {

}