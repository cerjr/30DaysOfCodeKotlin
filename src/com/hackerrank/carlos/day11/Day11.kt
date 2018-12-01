package com.hackerrank.carlos.day11

fun sumHourGlasses(arr: Array<IntArray>, i: Int, j: Int): Int {
    var sum = 0
    for (k in i..i + 2) {
        for (l in j..j + 2) {
            if (k == i) {
                sum += arr[k][l]!!
            } else if (k == i + 1 && l == j + 1) {
                sum += arr[k][l]!!
            } else if (k == i + 2) {
                sum += arr[k][l]!!
            }
        }
    }

    return sum
}

fun main(args: Array<String>) {

    var arr = Array(6) {
        IntArray(6)
    }
    (0..5).forEach { arr_i ->
        (0..5).forEach { arr_j ->
            arr[arr_i][arr_j] = "${readLine()}".toInt()
        }
    }

    //calculate the lower number as the initial max value
    var max: Int = -9 * 7
    (0..3).forEach { arr_i ->
        (0..3).forEach { arr_j ->
            val sum = sumHourGlasses(arr, arr_i, arr_j)
            if (sum > max) {
                max = sum
            }
        }
    }

    println(max)
}
