package com.maheshvenkat.datastructuresinkotlin.stacks

class StackImpl<T : Any>() : Stack<T> {
    private val storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    @ExperimentalStdlibApi
    override fun pop(): T? {
        return storage.removeLastOrNull()
    }

    override fun push(element: T) {
        storage.add(element)
    }
}

@ExperimentalStdlibApi
fun String.validParanthesis(): Boolean {
    val stack = StackImpl<Char>()

    for (char in this) {
        when (char) {
            '(' -> stack.push(char)
            ')' -> if (stack.isEmpty)
                return false
            else
                stack.pop()
        }
    }

    return stack.isEmpty
}