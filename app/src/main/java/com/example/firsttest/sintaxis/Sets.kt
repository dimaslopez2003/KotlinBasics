package com.example.firsttest.sintaxis

fun main(){
    val listOfPokemons = mutableListOf<String>("Pikachu", "Charmander", "Squirtle")
    listOfPokemons.add("Bulbasaur")
    listOfPokemons.add("Mew")
    listOfPokemons.add("Pikachu")

    println("Lista de pokemones:")
    println(listOfPokemons)


    val setOfPokemons = mutableSetOf<String>("Pikachu", "Charmander", "Squirtle")
    setOfPokemons.add("Bulbasaur")
    setOfPokemons.add("Mew")
    setOfPokemons.add("Pikachu")

    println("Set de pokemones:")
    println(setOfPokemons) //el set no permite duplicados, no son valores ordenados ni indexados

}