package com.maheshvenkat.datastructuresinkotlin.queue

interface Queue<T: Any> {
    fun enqueue(element : T)

    fun dequeue() : T?

    fun peek() : T?

    val count : Int

    val isEmpty : Boolean
        get() = (count == 0)
}