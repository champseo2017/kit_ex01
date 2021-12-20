fun main(args: Array<String>) {
// in !in
 val range = 1..10 step 2
 var b = 1 in range
b = 10 in range
 b = 5 !in range
 b = 11 in 10..12
}