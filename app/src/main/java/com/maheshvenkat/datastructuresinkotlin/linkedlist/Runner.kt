package com.maheshvenkat.datastructuresinkotlin.linkedlist

fun main() {
    // Run this when you just have a Node
//    val node1 = Node(value = 1)
//    val node2 = Node(value = 2)
//    val node3 = Node(value = 3)
//    node1.next = node2
//    node2.next = node3
//
//    print(node1)

    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    list.push(7)
    list.push(9)
    list.push(10)
    println(list)


//    val list = LinkedList<Int>()
//    list.push(3).push(2).push(1)
//
//    println(list)

    // Test For Append list.push(3)
//    list.append(5)
//    list.append(6)
//    println(list)
//
//    //println("Before inserting: $list")
//    var middleNode = list.nodeAt(1)!!
//    for (i in 1..3) {
//        middleNode = list.insert(-1 * i, middleNode)
//    }
//    println("After inserting: $list")
//
//
//    println("Before popping list: $list")
//    val poppedValue = list.pop()
//    println("After popping list: $list")
//    println("Popped value: $poppedValue")
//
//
//    println("Before removing last node: $list")
//    val removedValueFromLast = list.removeLast()
//
//    println("After removing last node: $list")
//    println("Removed value: $removedValueFromLast")
//
//    val index = 1
//    val node = list.nodeAt(index - 1)!!
//    val removedValue = list.removeAfter(node)
//
//    println("After removing at index $index: $list")
//    println("Removed value: $removedValue")
//
//    print(list.reverse())

    val valueFromKthNode = list.KthNodeFromEnd(3)
    print("Kth node from end is : $valueFromKthNode")
}
