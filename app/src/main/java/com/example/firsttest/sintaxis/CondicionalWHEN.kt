package com.example.firsttest.sintaxis

fun main() {
    val name = "Dimas Lopez"
    val age = 21
    val role = "android developer"

    when {
        age > 60 -> println("$name eres don" )
        age > 30 -> println("$name eres adulto" )
        age > 18 -> println("$name eres mayor de edad" )
        else -> println("$name eres menor de edad" )
    }
    when (role){
        "android developer" -> println("eres un desarrollador")
        "designer" -> println("eres un diseñador")
        else -> println("no eres un desarrollador ni un diseñador")
    }
}