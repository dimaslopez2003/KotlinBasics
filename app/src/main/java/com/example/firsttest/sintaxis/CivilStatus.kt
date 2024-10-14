package com.example.firsttest.sintaxis

sealed class CivilStatus {
    object Single : CivilStatus()
    object Married : CivilStatus()
    object Divorced : CivilStatus()
    object Comprometed : CivilStatus()

}