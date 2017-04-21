package com.hackerrank.carlos.day13

class MyBook(override val title: String, override val author: String, val price: Int) :
        Book(title, author){

    override fun display() {
        println("Title: $title")
        println("Author: $author")
        println("Price: $price")
    }

}