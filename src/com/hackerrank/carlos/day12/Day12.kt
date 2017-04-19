package com.hackerrank.carlos.day12

import java.util.*

/**
 * Objective
 * Today, we're delving into Inheritance. Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class.
 * Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student
 * inherits all the properties of Person.
 *
 * Complete the Student class by writing the following:
 *
 * - A Student class constructor, which has 4 parameters:
 *      1. A string, firstName.
 *      2. A string, lastName.
 *      3. An integer, id.
 *      4. An integer array (or vector) of test scores, scores.
 * - A char calculate() method that calculates a Student object's average and returns the grade character
 * representative of their calculated average:
 *
 *      Gradding Scale
 *      Letter | Average (a)
 *           O | 90 <= a <= 100
 *           E | 80 <= a < 90
 *           A | 70 <= a < 80
 *           P | 55 <= a < 70
 *           D | 40 <= a < 55
 *           T | a < 40
 *
 * Input Format
 * The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It
 * also calls the calculate method (which takes no arguments).
 *
 * You are not responsible for reading the following input from stdin:
 * The first line contains firstName, lastName, and id, respectively. The second line contains the number of
 * test scores. The third line of space-separated integers describes scores.
 *
 * Constraints
 *  4 <= |firstName|, |lastName|<=10
 *  |id| =_ 7
 *  0 <= score, average <= 100
 *
 * Output Format
 * This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor
 * and calculate() method are properly implemented.
 *
 * Sample Input
 * Heraldo Memelli 8135627
 * 2
 * 100 80
 *
 * Sample Output
 * Name: Memelli, Heraldo
 * ID: 8135627
 * Grade: O
 *
 * Explanation
 * This student had  scores to average:  and . The student's average grade is (100+80)/2. An average
 * grade of 90 corresponds to the letter grade O, so our calculate() method should return the character'O'.
 */

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
        scores.add(tmpScore);
    }

    val s:Student = Student(firstName, lastName, id, scores);
    s.printPerson();
    println("Grade: ${s.calculate()}\n")
}
