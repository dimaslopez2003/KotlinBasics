package com.example.firsttest.sintaxis

//ciclo infinito
fun main() {
    var listOfFriends = listOf<String>("Vianney", "Dimas", "Marfil", "Yamileth", "Simphuich", "Topogigio")
    var index = 0
    while (index < listOfFriends.size){
        println(listOfFriends[index])
        //index = index + 4
        index += 1
        //index++
    }
}