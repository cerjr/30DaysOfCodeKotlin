package com.hackerrank.carlos.day14

class Difference(val elements: MutableList<Int>){

    var maximumDifference:Int = 0

    fun computeDifference(){
        var min:Int = 100
        var max:Int = 0

        this.elements.forEach {element->
            if(element < min){
                min = element;
            }

            if (element > max){
                max = element;
            }
        }

        maximumDifference = max - min
    }
}

