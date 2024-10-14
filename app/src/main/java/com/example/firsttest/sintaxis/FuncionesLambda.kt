package com.example.firsttest.sintaxis

fun main() {

    mylambda("Dimas", { fullname->
        println("HOLA $fullname") })

}

fun mylambda(name:String, saludar: (fullname:String) -> Unit){
    println("estoy entrando dentro de ti")

    saludar("$name Lopez")

    println("estoy saliendo de ti")




}