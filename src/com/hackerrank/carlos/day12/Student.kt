package com.hackerrank.carlos.day12

class Student(override val firstName: String, override val lastName: String, override val id: Int, var testScores: MutableList<Int>) :
        Person(firstName, lastName, id){

    fun calculate(): Char{
        var sum:Int = 0;

        testScores.forEach{ value ->
            sum += value
        }

        val med:Int = sum/testScores.size;

        if (med >= 90 && med <= 100) {
            return 'O';
        } else if (med >= 80) {
            return 'E';
        } else if (med >= 70) {
            return 'A';
        } else if (med >= 55) {
            return 'P';
        } else if (med >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}