package com.hackerrank.carlos.day07

fun main(args: Array<String>) {
    val n = "${readLine()}".toInt()
    val arr = mutableListOf<Int>()

    (0..n -1).forEach{
        arr.add("${readLine()}".toInt())
    }

    arr.reversed().forEach{text ->
        print("$text ")
    }
}
