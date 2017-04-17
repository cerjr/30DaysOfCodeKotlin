package com.hackerrank.carlos.day11

/**
 * Objective
 * Today, we're building on our knowledge of Arrays by adding another dimension. Check out the Tutorial tab for
 * learning materials and an instructional video!
 *
 * Context
 * Given a 6 x 6 2D Array, A:
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical
 * representation:
 *
 * a b c
 *   d
 * e f g
 *
 * There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
 *
 * Task
 * Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 *
 * Input Format
 * There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in
 * A will be in the inclusive range of -9 to 9.
 *
 * Constraints
 *  -9 <= A[i][j] <= 9
 *  0 <= i, j <= 5
 *
 * Output Format
 * Print the largest (maximum) hourglass sum found in A.
 *
 * Sample Input
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 *
 * Sample Output
 * 19
 *
 * Explanation
 *
 * A contains the following hourglasses:
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *   1       0       0       0
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *
 * 0 1 0   1 0 0   0 0 0   0 0 0
 *   1       1       0       0
 * 0 0 2   0 2 4   2 4 4   4 4 0
 *
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *   0       2       4       4
 * 0 0 0   0 0 2   0 2 0   2 0 0
 *
 * 0 0 2   0 2 4   2 4 4   4 4 0
 *   0       0       2       0
 * 0 0 1   0 1 2   1 2 4   2 4 0
 *
 * The hourglass with the maximum sum (19) is:
 * 2 4 4
 *   2
 * 1 2 4
 */
class Array2D<T> (val xSize: Int, val ySize: Int, val array: Array<Array<T>>) {

    companion object {

        inline operator fun <reified T> invoke() = Array2D(0, 0, Array(0, { emptyArray<T>() }))

        inline operator fun <reified T> invoke(xWidth: Int, yWidth: Int) =
                Array2D(xWidth, yWidth, Array(xWidth, { arrayOfNulls<T>(yWidth) }))

        inline operator fun <reified T> invoke(xWidth: Int, yWidth: Int, operator: (Int, Int) -> (T)): Array2D<T> {
            val array = Array(xWidth, {
                val x = it
                Array(yWidth, {operator(x, it)})})
            return Array2D(xWidth, yWidth, array)
        }
    }

    operator fun get(x: Int, y: Int): T {
        return array[x][y]
    }

    operator fun set(x: Int, y: Int, t: T) {
        array[x][y] = t
    }

    inline fun forEach(operation: (T) -> Unit) {
        array.forEach { it.forEach { operation.invoke(it) } }
    }

    inline fun forEachIndexed(operation: (x: Int, y: Int, T) -> Unit) {
        array.forEachIndexed { x, p -> p.forEachIndexed { y, t -> operation.invoke(x, y, t) } }
    }
}

fun sumHourGlasses(arr:Array2D<Int?>, i:Int, j:Int): Int{
    var sum:Int = 0;
    for (k in i..i+2) {
        for (l in j..j+2) {
            if(k == i){
                sum += arr[k,l]!!
            } else if (k == i + 1 && l == j + 1){
                sum += arr[k,l]!!
            } else if(k == i + 2){
                sum += arr[k,l]!!
            }
        }
    }

    return sum;
}

fun main(args: Array<String>) {
    val arr = Array2D<Int?>(xWidth = 6, yWidth = 6)

    (0..5).forEach {arr_i ->
        (0..5).forEach {arr_j ->
            arr[arr_i, arr_j] = "${readLine()}".toInt()
        }
    }

    //calculate the lower number as the initial max value
    var max:Int = -9 * 7
    (0..3).forEach {arr_i ->
        (0..3).forEach {arr_j ->
            val sum = sumHourGlasses(arr, arr_i, arr_j);
            if (sum > max) {
                max = sum;
            }
        }
    }

    println(max);
}
