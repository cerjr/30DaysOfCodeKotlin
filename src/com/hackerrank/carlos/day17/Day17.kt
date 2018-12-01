package com.hackerrank.carlos.day17

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val myCalculator:Calculator = Calculator()
    var T = input.nextInt()
    var n:Int
    var p:Int

    while(T-- > 0){
        n = input.nextInt()
        p = input.nextInt()

        try{
            val ans:Int = myCalculator.power(n,p);
            println(ans);
        }catch(e:Exception){
            println(e.message)
        }
    }

    input.close()
}
