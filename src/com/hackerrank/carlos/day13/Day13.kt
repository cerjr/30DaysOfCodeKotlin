package com.hackerrank.carlos.day13

fun main(args: Array<String>) {
    val title = readLine()!!
    val author = readLine()!!
    val price = readLine()!!.toInt()

    val novel = MyBook(title,author,price)
    novel.display()
}