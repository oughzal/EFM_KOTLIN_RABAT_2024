package coroutines

import kotlinx.coroutines.*

suspend fun fn() {
    delay(200)
}

fun main() :Unit =runBlocking {
    launch{
        for (i in 1..100) {
            println(i)
            delay(20)
        }
    }
}
