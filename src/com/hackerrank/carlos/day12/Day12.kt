package com.hackerrank.carlos.day12

import java.util.*

fun main(args: Array<String>) {
    val firstName:String
    val lastName:String
    val id:Int
    val numScores:Int

    val input = Scanner(System.`in`)
    firstName = input.next()
    lastName = input.next()
    id = input.nextInt()
    numScores = input.nextInt()

    val scores:MutableList<Int> = mutableListOf()
    (1..numScores).forEach {
        val tmpScore = input.nextInt()
        scores.add(tmpScore)
    }

    val s = Student(firstName, lastName, id, scores)
    s.printPerson()
    println("Grade: ${s.calculate()}\n")

    input.close()
}
