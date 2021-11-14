package com.maheshvenkat.datastructuresinkotlin.linkedlist

data class Node<T: Any>(val value: T, var next: Node<T> ? = null) {

    override fun toString() : String {
        return if (next != null) {
                "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}
