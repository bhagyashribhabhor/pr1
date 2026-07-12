fun main() {
    val a1 = arrayOf('a', 'b', 'c')
    println(a1.joinToString())
    val a = Array<Int>(size = 10) { 0 }
    val b = Array<Int>(size = 10) { i -> i * 2 }
    println(a.joinToString(separator = ","))
    println(b.joinToString(separator = ","))
    b.shuffle()
    println(b.joinToString())
    b.sort()
    println(b.joinToString())
}