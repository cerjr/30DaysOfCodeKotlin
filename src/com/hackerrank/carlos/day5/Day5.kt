package com.hackerrank.carlos.day5

/**
 * Created by Carlos on 09/04/2017.
 */
fun main(args: Array<String>) {
    val n:Int = "${readLine()}".toInt()
    (1..10).forEach {value ->
        println("$n x $value = ${n * value}")
    }
}