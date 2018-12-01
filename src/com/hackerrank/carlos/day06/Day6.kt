package com.hackerrank.carlos.day06

fun main(args: Array<String>) {
    val T: Int
    T = "${readLine()}".toInt()

    val results = mutableListOf<String>()
    for(i in 0..T -1){
        var evens = ""
        var odds = ""
        val S = readLine()
        S!!.toCharArray().forEachIndexed {index, value ->
            if (index % 2 == 0){
                odds += value;
            } else {
                evens += value;
            }
        }

        results.add("$odds $evens")
    }

    results.forEach {text->
        println(text)
    }
}