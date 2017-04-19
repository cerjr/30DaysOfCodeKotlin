package com.hackerrank.carlos.day12

open class Person(protected open val firstName: String, protected  open val lastName: String, protected open val id: Int){

    fun printPerson(){
        println("Name: $lastName, $firstName\nID: $id")
    }

}