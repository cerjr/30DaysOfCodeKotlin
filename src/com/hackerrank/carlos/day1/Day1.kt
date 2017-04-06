package com.hackerrank.carlos.day1

/**
 * Created by carlos.rodrigues on 05/04/2017.
 */
fun main(args:Array<String>){
    val i = 4;
    val d = 4.0;
    val s = "HackerRank ";

    // Declare second integer, double, and String variables.
    val myInt: Int;
    val myDouble: Double;
    val myString: String;

    // Read and save an integer, double, and String to your variables.
    // Note: If you have trouble reading the entire string, please go back and review the Tutorial closely.
    myInt = "${readLine()}".toInt()
    myDouble =  "${readLine()}".toDouble()
    myString = readLine().toString()

    // Print the sum of both integer variables on a new line.
    println(i + myInt)
    // Print the sum of the double variables on a new line.
    println(d + myDouble)
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    println("$s$myString")
}