package com.hackerrank.carlos.day10

fun main(args: Array<String>) {
    val n = "${readLine()}".toInt()

    var div:Int = n
    var sequence = 0
    var mod:Int
    var max1InSequence = 0
    var previous:Int = -1

    do {
        mod = div%2

        if (previous == -1){
            previous = mod
        }

        if (mod == 1) {
            sequence++
        }

        div /= 2

        if((mod != 1 && previous == 1) || div <= 0){
            if(sequence > max1InSequence) {
                max1InSequence = sequence
            }
            sequence = 0
        }

        previous = mod
    } while(div > 0)

    println(max1InSequence)
}
