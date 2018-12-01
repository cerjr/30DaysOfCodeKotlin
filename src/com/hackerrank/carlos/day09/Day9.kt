package com.hackerrank.carlos.day09

fun factorial(N: Int): Int{
    if (N == 1) {
        return 1
    } else {
        return N * factorial(N - 1)
    }
}
fun main(args: Array<String>) {
    val N = "${readLine()}".toInt()
    println(factorial(N))
}