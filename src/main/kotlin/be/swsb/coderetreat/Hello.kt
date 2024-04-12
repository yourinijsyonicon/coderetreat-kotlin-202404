package be.swsb.coderetreat

class Hello(private val name: String? = null) {
    fun greet(): String {
        val subject = name ?: "World"
        return "Hello, $subject!"
    }
}

fun main() {
    println(Hello("banaan"))
}