package com.example.firsttest.sintaxis

fun main() {

    val dimas : Usuario = Usuario("Dimas",
        21,
        "montalcoarturo@gmail.com",
        "21393126")
    val marfil : Usuario = Usuario("marfil",
        22,
        "marfilvelazquez@gmail.com",
        "21393125")
    val airan : Usuario = Usuario("Airan",
        23,
        "cerdancerdojandro@gmail.com",
        "21393129")

    dimas.addFriend(marfil)
    dimas.addFriend(airan)
    marfil.addFriend(airan)
    marfil.addFriend(dimas)
    airan.addFriend(dimas)
    airan.addFriend(marfil)

    dimas.getFriends()
    marfil.getFriends()
    airan.getFriends()

}