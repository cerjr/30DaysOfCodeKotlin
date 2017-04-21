package com.hackerrank.carlos.day15

class Solution{

    fun insert(head:Node?, data:Int):Node{
        var firstNode:Node? = head
        if (firstNode == null){
            firstNode = Node(data);
        } else {
            var nextNode:Node? = firstNode;
            while(nextNode != null ){
                if (nextNode.next == null){
                    nextNode.next = Node(data)
                    break;
                }

                nextNode = nextNode.next
            }
        }

        return firstNode;
    }

    fun display(head:Node?){
        var nextNode = head
        while(nextNode != null){
            print("${nextNode.data} ")
            nextNode = nextNode.next
        }
    }
}