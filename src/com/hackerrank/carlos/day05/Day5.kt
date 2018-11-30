package com.hackerrank.carlos.day05

fun main(args: Array<String>) {
    val n:Int = "${readLine()}".toInt()
    (1..10).forEach {value ->
        println("$n x $value = ${n * value}")
    }
}
