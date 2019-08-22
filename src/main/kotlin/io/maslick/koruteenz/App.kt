package io.maslick.koruteenz

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.math.BigInteger
import java.util.*


fun main() = runBlocking {
    launch {
        println(findBigPrime())
    }
    println("helloworld")
}


suspend fun findBigPrime() = withContext(Dispatchers.Default) {
    BigInteger.probablePrime(4096, Random())
}