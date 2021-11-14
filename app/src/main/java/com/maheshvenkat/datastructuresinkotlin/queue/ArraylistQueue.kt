package com.maheshvenkat.datastructuresinkotlin.queue

class ArraylistQueue<T : Any> : Queue<T> {
    private val storage = arrayListOf<T>()

    override val count : Int
        get() = storage.size

    @ExperimentalStdlibApi
    override fun dequeue() : T? {
        return storage.removeFirstOrNull()
    }

    override fun enqueue(element : T) {
        storage.add(element)
    }

    override fun peek() : T? {
        return storage.firstOrNull()
    }

}