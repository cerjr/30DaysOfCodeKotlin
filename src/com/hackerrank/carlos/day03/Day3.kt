package com.hackerrank.carlos.day03

fun main(args: Array<String>){

    val number = "${readLine()}".toInt()
    val sayWeird: String = "Weird";
    val sayNotWeird: String = "Not Weird";

    if (number % 2 == 0) {
        if (number > 20) {
            println(sayNotWeird)
        } else if (number > 6) {
            println(sayWeird)
        } else {
            println(sayNotWeird)
        }
    } else {
        println(sayWeird)
    }
}