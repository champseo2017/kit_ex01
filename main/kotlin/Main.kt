/*
    การใช้แลมบ์ดากับคอลเล็กชัน

    - forEach(action: (T) -> Unit) สำหรับ List และ Set
    - forEach(action: Map.Entry(k, v) -> Unit) สำหรับ Map
* */

fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val set = mutableSetOf(1.2, 3.4, 5.6, 7.8, 9.0)
    val map = mutableMapOf<Int, String>(66 to "Thailand", 81 to "Japan"
    , 61 to "Australia")

    list.forEach {
        if (it % 2 == 0) println(it)
    }

    set.forEach { println(it * 10) }

    map.forEach {
        if (it.key < 80) {
            println(it.key.toString() + " : " + it.value)
        }
    }


}