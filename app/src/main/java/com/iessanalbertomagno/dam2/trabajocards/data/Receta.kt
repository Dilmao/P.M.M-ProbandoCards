package com.iessanalbertomagno.dam2.trabajocards.data

import com.iessanalbertomagno.dam2.trabajocards.R


data class Receta(
    //Estas variables son para el ejemplo del codigo de mario, cambiar
    var name: String,
    var foto: Int = R.drawable.usuario,
    var puntuacion: String,
    var tiempo: String,
    var descripcion: String
)
