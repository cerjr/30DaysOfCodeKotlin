package com.hackerrank.carlos.day17

class Calculator(){
    fun power(n:Int, p:Int):Int{
        if (n < 0 || p < 0) {
            throw IllegalArgumentException("n and p should be non-negative");
        } else {
            return Math.pow(n.toDouble(), p.toDouble()).toInt();
        }
    }
}
