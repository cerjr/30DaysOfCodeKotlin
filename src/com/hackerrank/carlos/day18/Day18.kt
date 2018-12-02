package com.hackerrank.carlos.day18

fun main(args: Array<String>) {
    // read the string s.
    val s = "${readLine()}"

    // create the Solution class object p.
    val obj = Solution()

    // push/enqueue all the characters of string s to stack.
    (0 until s.length).forEach {i ->
        obj.pushCharacter(s[i])
        obj.enqueueCharacter(s[i])
    }

    var isPalindrome = true

    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (i in 0 until s.length / 2) {
        if (obj.popCharacter() !== obj.dequeueCharacter()) {
            isPalindrome = false

            break
        }
    }

    // finally print whether string s is palindrome or not.
    if (isPalindrome) {
        println("The word, $s is a palindrome.")
    } else {
        println("The word, $s is not a palindrome.")
    }
}