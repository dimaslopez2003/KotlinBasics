package com.example.firsttest.sintaxis

fun main() {
    val name = "Vianney"
    val role = "TURISTOLOGA SEXY"
    val age = 31

    if (age > 62) {
        println("$name hazme el amor")
    } else if (age > 30) {
        println("$name no puedes hacerme el amor eres anciana")
    }else if (age > 18) {
        println("$name no puedes hacerme el amor eres jovena")
    }else{
        println("$name eres una ardilla")
    }

    if (role == "TURISTOLOGA SEXY") {
        println("tienes acceso a mi cuarto")
    }
    if (role == "admin") {
        println("eres virgen")
    }
    if (role == "quest") {
        println("no pasas")

    }
}