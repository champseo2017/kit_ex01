/*
    การสร้างเลขสุ่ม

    การสร้างเลขสุ่มจะทำผ่านคลาส Random

    1. Kotlin คลาส Random จะอยู่ในแพ็คเกจ kotlin.random.Random
    import kotlin.random.*

    - nextInt()
      - เมื่อเรียกเมธอดนี้ในแต่ละครั้งจะได้เลขสุ่มเป็นตัวเลขชนิด Int

    - nextInt(ขอบเขตบน)
      - จะได้เลขจำนวนเต็มบวกที่ไม่เกิน ขอบเขตบน -1
      nextInt(500) จะได้เลขสุ่มค่าไม่เกิน 499

    - nextInt(ค่าเริ่มต้น, ขอบเขตบน)
      - จะได้เลขจำนวนเต็มที่อยู่ระหว่างค่าเริ่มต้น จนถึง (ขอบเขตบน -1)
      nextInt(10, 20) => 10 - 19

    - nextLong(), nextLong(ขอบเขตบน) , nextLong(ค่าเริ่มต้น, ขอบเขตบน)
    เช่นเดียวกับ nextInt() จะได้เป็นตัวเลขชนิด Long

    nextDouble()
     - เมื่อเรียกใช้จะได้เลขสุ่ม 0 - 1 คล้ายกับ Math.random() ของ Java

    nextBoolean()
     - จะได้ค่า true หรือ false

    nextFloat()
     - เมื่อเรียกใช้จะได้เลขสุ่ม 0 - 1 คล้ายกับ Math.random() ของ Java
       - ได้ตัวเลขเป็นชนิด float

    nextBytes(จำนวน)
     - สร้างเลขสุ่มชนิด Byte(-128 ถึง 127)
       - ได้ผลลัพธ์เป็น Byte Array
       ที่มีจำนวนสมาชิกที่ระบุ

     nextBytes(byte_array)
       กำนหดค่าเป็น byte_array ได้ผลลัพธ์คืนเป็น Bytes ของมัน

* */

import kotlin.random.*

fun main(args: Array<String>) {

    val a = Random.nextInt()
    val b = Random.nextInt(1000)
    val c = Random.nextInt(100, 1000)
    val d = Random.nextDouble()
    val bool = Random.nextBoolean()
    val bytes = Random.nextBytes(3)
    // ได้ผลลัพธ์เป็น Byte Array มีสมาชิก 3 ตัว

    val nums = ByteArray(5)
    Random.nextBytes(nums)
    // เลขสุ่มที่ได้ จะเก็บอยู่ใน Byte Array ตามจำนวนที่กำหนด
    // เช่น nums = byteArrayOf(50, 12, -83, 61, -1167667)


}