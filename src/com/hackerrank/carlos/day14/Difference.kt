package com.hackerrank.carlos.day14

/**
 * private:
vector<int> elements;

public:
int maximumDifference;

// Add your code here
Difference(vector<int> elements){
this->elements = elements;
}

void computeDifference(){
int min = 100;
int max = 0;
for(int element : this->elements){
if(element < min){
min = element;
}

if (element > max){
max = element;
}
}

maximumDifference = max - min;
}
 */

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

