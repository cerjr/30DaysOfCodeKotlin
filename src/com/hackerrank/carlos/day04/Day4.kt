package com.hackerrank.carlos.day04

fun main(args: Array<String>){
    val t  = "${readLine()}".toInt()
    var age: Int

    for(i in 1..t) {
        age = "${readLine()}".toInt()
        val p = Person(age)
        p.amIOld()
        for(j in 1..3) {
            p.yearPasses()
        }
        p.amIOld()

        println()
    }
}