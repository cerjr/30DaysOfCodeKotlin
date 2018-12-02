package com.hackerrank.carlos.day18

class Solution() {

    var stack = mutableListOf<Char>()
    val queue = mutableListOf<Char>()

    fun pushCharacter(c: Char) {
        stack.add(c)
    }

    fun enqueueCharacter(c: Char) {
        queue.add(c)
    }

    fun popCharacter(): Char {
        val lastIndex = stack.size -1
        val c = stack.get(lastIndex)
        stack.removeAt(lastIndex)
        return c
    }

    fun dequeueCharacter(): Char {
        val c = queue.get(0)
        queue.removeAt(0)
        return c
    }

}