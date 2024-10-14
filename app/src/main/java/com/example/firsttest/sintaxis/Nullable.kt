package com.example.firsttest.sintaxis

fun main() {
    var name = "Misael"
    var course: String? = null

    course = "Android Developer"

    if (course == null) {
        println("$name no esta estudiando nada")
    }else{
        println("$name esta estudiando $course")
    }

    var num1: Int? = null
    var result = num1!! + 5

    println(result)


}