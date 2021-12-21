fun main(args: Array<String>) {
/* When
* val ext = ".kt"
    when (ext) {
      ".kt" -> print("Kotlin File")
      ".java" -> print("Java File")
      else -> print("Unknown")
    }
*
* val country = "Mexico"
    when (country) {
        "UK", "USA" -> print("English")
        "Spain", "Mexico" -> print("Spanish")
        "China", "Taiwan" -> print("Chinese")
    }
    * val date = 1
    val month = 10
    when {
        date == 1 && month == 1 -> print("วันขึ้นปีใหม่")
        date == 14 && month == 2 -> print("วันวาเลนไทน์")
        date >= 13 && date <= 15 && month == 4 -> print("วันสงกรานต์")
        date == 1 || date == 16 -> print("วันนี้รวย")
    }
    *
    * val score = 75
    var grade = 'F'
    when (score) {
        in 80..100 -> grade = 'A'
        in 79 downTo 60 -> grade = 'B'
        in 0 until 60 -> grade = 'F'
        !in 0..100 -> {
            grade = ' '
            print("Score Error")
        }
    }
    *
    *  var a: Any = 123.45F
    var result: Int
    when (a) {
        is String -> result = a.toDouble().toInt()
        is Double -> result = a.toInt()
        is Float -> result = a.toInt()
        else -> result = 0
    }
    *
    * val device = "Oppo"
    val os = when (device) {
        "Oppo", "Vivo", "Samsung", "Sony" -> "Android"
        "iPhone" -> "iOS"
        "iPad" -> "iPadOS"
        else -> "Unknown"
    }
    print(os)
* */

}