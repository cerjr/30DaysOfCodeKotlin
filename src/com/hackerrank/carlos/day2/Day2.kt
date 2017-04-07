package com.hackerrank.carlos.day2

/**
 * Created by Carlos on 06/04/2017.
 */
fun main(args:Array<String>){
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    val mealCost: Double =  "${readLine()}".toDouble()
    val tipPercent: Int = "${readLine()}".toInt()
    val taxPercent: Int = "${readLine()}".toInt()

    val totalCost: Double = mealCost + mealCost * (tipPercent/100.0) + mealCost * (taxPercent/100.0);

    // round  to the nearest dollar (integer) and print the result
    println("The total meal cost is ${Math.round(totalCost)} dollars.")
}