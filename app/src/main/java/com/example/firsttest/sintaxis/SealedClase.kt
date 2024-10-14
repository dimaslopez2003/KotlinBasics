package com.example.firsttest.sintaxis

fun main() {

    val dimas = Person("Dimas", "Montalvo", civilStatus = CivilStatus.Married)
    val marfil = Person("Marfil", "Velazquez", civilStatus = CivilStatus.Single)
    val airan = Person("Airan", "Cerda", civilStatus = CivilStatus.Single)

    if (marfil.civilStatus == airan.civilStatus){
        println("Tienen el mismo estado civil")
        }else{
        println("Tienen estados civiles diferentes")
    }

}