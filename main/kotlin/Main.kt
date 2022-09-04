/*
    โอเปอร์เรเตอร์การกำหนดช่วงข้อมูล

    .. Range Operator (2 จุด) สำหรับกำหนดช่วงข้อมูล
    จากน้อยไปมาก โดยนับค่าสุดท้ายด้วย

    until ฟังก์ชันสำหรับกำหนดช่วงข้อมูลจากน้อยไปมาก แต่ไม่นับค่าสุดท้าย

    downTo ฟังก์ชันสำหรับกำหนดช่วงข้อมูลจากมากไปน้อย

    Rage Operator ใช้ 2 จุด (..)
    ค่าแรก..ค่าสุดท้าย [step]

    - ค่าแรก ต้องน้อยกว่าหรือเท่ากับ ค่าสุดท้าย
    - Range จะเพิ่มทีละ 1 หากต้องการเพิ่มค่าต่างจากนี้ ให้ทำที่ step เป็นเลข
    จำนวนเต็มบวก

    - หากกำหนดค่าแรก มากกว่าค่าสุดท้ายภายใน range จะมีเฉพาะค่าแรกและค่าสุดท้าย แต่
    ไม่มีข้อมูลภายในช่วงนั้น เป็น Empty range
    - คำสั่งตรวจสอบค่าของตัวแปร range ได้คือ first, last, step, isEmpty()
    ใช้โอเปอร์เรเตอร์ in


* */

fun main(args: Array<String>) {

    val a = 1..20
    println(a.first)
    println(a.last)

    val b =20
    val c = 10..b step 3
    println(c.first)
    println(c.last)
    println(c.step)
    println(c.isEmpty())

    val d = 100..50
    println(d.first)
    println(d.last)
    println(d.isEmpty())

}