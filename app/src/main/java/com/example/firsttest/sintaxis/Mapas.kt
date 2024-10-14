package com.example.firsttest.sintaxis

fun main(){
    val mapOfPokemons = mutableMapOf("pikachu" to "electric", "charmander" to "fire")
    println(mapOfPokemons["pikachu"])

    mapOfPokemons.put("squirtle", "water")
    mapOfPokemons["Mew"] = "psychic"
    println(mapOfPokemons)

}