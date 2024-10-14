package com.example.firsttest.sintaxis

fun main(){
    //red social lista de amigos
    var friends = listOf<String>("Vianney", "Dimas", "Marfil")
    var ages = listOf<Int>(21, 21, 22)

    //println(friends[0])
    //println(ages[0])

    //println(friends.first())
    //println(ages.last())
    //println (friends.size)

    //GET
    //println( friends[0])
    //println(friends.get(0))

    //SET
    //friends.set(0, "Vianney") No se puede editar una lista
    //println(friends[0])

    var newFriends = mutableListOf("Vianney", "Dimas", "Marfil")
    newFriends.set(0, "Yamileth")
    println(newFriends[0])

    newFriends.add("simphuich")
    println (newFriends)


}