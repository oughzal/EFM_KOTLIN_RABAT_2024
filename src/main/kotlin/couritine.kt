import kotlinx.coroutines.*

suspend fun fn() {
    delay(200)
}

fun main()=runBlocking {
    GlobalScope.launch(Dispatchers.Default) {
        for (i in 1..100) {
            println(i)
            delay(20)
        }
    }
}

}