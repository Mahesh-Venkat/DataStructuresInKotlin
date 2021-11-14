package com.maheshvenkat.datastructuresinkotlin.linkedlist

import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

class LinkedList<T : Any> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    private var size: Int = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) return "Empty List" else head.toString()
    }

    //O(1) Complexity
    fun push(element: T) {
        head = Node(value = element, next = head)

        if (tail == null) {
            tail = head
        }

        size++
    }

    //O(1) Complexity
    fun append(element: T) {
        // Step 1 check if the lsit is empty, if it is just push the node
        // using push method above
        if (isEmpty()) {
            push(element)
        }

        tail?.next = Node(value = element)
        tail = tail?.next

        size++
    }

    //O(i) Complexity
    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentIndex < index && currentNode != null) {
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

    //O(1) Complexity
    fun insert(element: T, afterNode: Node<T>): Node<T> {
        if (afterNode == tail) {
            append(element)
            return tail!!
        }

        val newNode = Node(value = element, next = afterNode.next)
        afterNode.next = newNode

        size++

        return newNode
    }

    fun pop(): T? {
        if (!isEmpty()) size--
        var result = head?.value
        head = head?.next

        if (isEmpty())
            tail = null

        return result
    }

    fun removeLast(): T? {
        // 1
        val head = head ?: return null
        // 2
        if (head.next == null) return pop()
        // 3
        size--

        // 4
        var prev = head
        var current = head
        var next = current.next

        while (next != null) {
            prev = current
            current = next
            next = current.next
        }

        prev.next == null
        tail = prev

        return current.value
    }

    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value

        if (node.next == tail)
            tail = node

        if (node.next != null)
            size--

        node.next = node.next?.next

        return result
    }

    fun reverse(): LinkedList<T>? {

        if (isEmpty()) return LinkedList()
        var prev = head
        var current = prev?.next

        while (current != null) {
            var next = current?.next
            current.next = prev
            prev = current
            current = next
        }

        //Do this at the end, assign the tail to the head and also do reset the still
        // hanging link of head.next to null
        tail = head
        tail?.next = null

        // Once you go through the list, you can assign head to the prev value
        head = prev
        return this
    }


    // Create two pointers, 1 starting at head and the other one goes at k-1 nodes
    // move them through the linked list, until k-1 pointer reaches the end, in the mean time
    //your first pointer may have find the node
    fun KthNodeFromEnd(k: Int): T? {

        if(isEmpty())
            throw IllegalStateException()

        var a = head
        var b = head

        //Change the b to k-1 pointer address
        for (i in 0 until k) {
            b = b?.next

            // This means the k is larger than the size of the list
            if(b == null)
                throw IllegalArgumentException()
        }

        //Check until b becomes tail, then a will be pointing at the kth node
        while(b != tail) {
            a= a?.next
            b=b?.next
        }

        return a?.value
    }
    // More optimal as you can return the Linked List itself here
//    fun push(element: T) : LinkedList<T> {
//        head = Node( value = element, next = head)
//        if(tail == null)
//            tail = head
//
//        size++
//        return this
//    }
}