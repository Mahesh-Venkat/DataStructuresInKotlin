package com.maheshvenkat.datastructuresinkotlin.randominterviewQuestions

import java.util.*

fun main(args: Array<String>)
{
    var planets =  TreeSet<String>();

    planets.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter"));

    for(planet in planets)
    {
        println(planet);
    }

}