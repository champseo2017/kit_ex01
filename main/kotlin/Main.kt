import java.awt.Shape

/*

    การใช้วิธี Not Null Assertion Operator
    - ถ้ามั่นใจว่าตัวแปรไม่เป็น null อย่างแน่นอน สามารถจัดการด้วยโอเปอเรเตอร์
      Not Null Assertion (!!) แต่ต้องมั่นใจจริงๆ ว่าไม่เป็น null
      มิฉะนั้นอาจเกิดข้อผิดพลาดได้

     - วางตัวแปร !! ไว้หลังตัวแปรแบบ Nullable สามารถใช้งานได้เหมือนกับตัวแปรทั่วไปได้เลย
     ไม่ต้องตรวจสอบอีก


* */


fun main(args: Array<String>) {

  val a: Int? = 10
  val b: Int? = 20
  val c: Int = a!! + b!!

  // ใช้โอเปอเรเตอร์ !! ร่วมกับ . ในการเรียกเมธอดของตัวแปรนั้นแทนการใช้ ?. Safe
  // Call เช่น
  val str: String? = "123"
  val x: Int = str!!.toInt()
  println(x)


}