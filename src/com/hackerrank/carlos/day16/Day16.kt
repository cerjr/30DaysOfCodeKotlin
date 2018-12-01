package com.hackerrank.carlos.day16

fun main(args: Array<String>) {
    val S:String = "${readLine()}"

    try{
        val result = S.toInt()
        println(result)
    }catch(e:NumberFormatException){
        println("Bad String")
    }

}
