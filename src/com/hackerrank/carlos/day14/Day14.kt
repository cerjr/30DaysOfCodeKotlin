package com.hackerrank.carlos.day14

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt()

    val a = mutableListOf<Int>()
    (1..N).forEach {
        val e = input.nextInt()
        a.add(e);
    }

    val d: Difference = Difference(a);

    d.computeDifference();

    println(d.maximumDifference)

    input.close()
}
