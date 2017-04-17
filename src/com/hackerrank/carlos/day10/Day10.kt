package com.hackerrank.carlos.day10

/**
 * Objective
 * Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional
 * video!
 *
 * Task
 * Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the
 * maximum number of consecutive 1's in n's binary representation.
 *
 * Input Format
 * A single integer, n.
 *
 * Constraints
 *  1 <= n <= 10^6
 *
 *  Output Format
 *  Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.
 *
 * Sample Input 1
 * 5
 *
 * Sample Output 1
 * 1
 *
 * Sample Input 2
 * 13
 *
 * Sample Output 2
 * 2
 *
 * Explanation
 * Sample Case 1:
 * The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.
 *
 * Sample Case 2:
 * The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.
 */
fun main(args: Array<String>) {
    val n = "${readLine()}".toInt()

    var div:Int
    var sequence:Int = 0
    var mod:Int
    var max1InSequence:Int = 0
    var previous:Int = -1

    div = n
    do {
        mod = div%2;

        if (previous == -1){
            previous = mod;
        }

        if (mod == 1) {
            sequence++;
        }

        div /= 2;

        if((mod != 1 && previous == 1) || div <= 0){
            if(sequence > max1InSequence) {
                max1InSequence = sequence;
            }
            sequence = 0;
        }

        previous = mod;
    } while(div > 0);

    println(max1InSequence);
}

