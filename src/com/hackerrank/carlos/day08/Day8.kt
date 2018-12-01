package com.hackerrank.carlos.day08

fun main(args: Array<String>){
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    val n = "${readLine()}".toInt()

    val phoneBook = mutableMapOf<String,String>();
    (0 until n).forEach {
        val sentence = readLine()

        val tokens = sentence!!.split(' ')

        phoneBook[tokens[0]] = tokens[1]
    }

    var query:String? = ""
    while({query = readLine()
           !(query?:"").isEmpty()}.invoke()) {
        if (phoneBook[query] != null) {
            println("$query=${phoneBook[query]}")
        } else {
            println("Not found")
        }
    }
}