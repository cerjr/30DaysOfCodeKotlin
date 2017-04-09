package com.hackerrank.carlos.day4

class Person(var age: Int){

    init{
        if (age < 0) {
            println("Age is not valid, setting age to 0." )
            age = 0;
        }
    }

    fun amIOld(){
        // Do some computations in here and print out the correct statement to the console
        if (age < 13) {
            println("You are young.")
        } else if (age < 18) {
            println("You are a teenager.")
        } else {
            println("You are old.")
        }
    }

    fun yearPasses(){
        // Increment the age of the person in here
        age++;
    }
}

fun main(args: Array<String>){
    val t  = "${readLine()}".toInt()
    var age: Int

    for(i in 1..t) {
        age = "${readLine()}".toInt()
        val p = Person(age);
        p.amIOld();
        for(j in 1..3) {
            p.yearPasses();
        }
        p.amIOld();

        println();
    }
}
