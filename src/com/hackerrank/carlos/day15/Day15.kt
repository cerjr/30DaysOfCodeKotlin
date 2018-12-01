package com.hackerrank.carlos.day15

fun main(args: Array<String>) {
    var head:Node? = null
    val mylist = Solution()
    val T:Int = readLine()!!.toInt()
    var data:Int

    for(i in T downTo 1){
        data = readLine()!!.toInt()
        head = mylist.insert(head,data)
    }
    mylist.display(head)
}
