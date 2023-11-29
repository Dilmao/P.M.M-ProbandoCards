package com.iessanalbertomagno.dam2.trabajocards.data

import com.iessanalbertomagno.dam2.trabajocards.R

//De nuevo, este codigo es ejemplo de mario, cambiar a recetas
val Macarrones : Receta = Receta(
    name = "Macarrones",
    foto = R.drawable.macarrones,
    puntuacion = "★★★★★",
    tiempo = "30 min",
    descripcion = "Esta muy rico"
)
val ArrozConHuevo : Receta = Receta(
    name = "Arroz con huevo",
    foto = R.drawable.arroz,
    puntuacion = "★★★★☆",
    tiempo = "40 min",
    descripcion = "Esta muy rico"
)
val Ensalada : Receta = Receta(
    name = "Ensalada",
    foto = R.drawable.ensalada,
    puntuacion = "★★★★☆",
    tiempo = "10 min",
    descripcion = "Esta muy rico"
)
val Tortilla : Receta = Receta(
    name = "Tortilla francesa",
    foto = R.drawable.tortilla,
    puntuacion = "★★★☆☆",
    tiempo = "10 min",
    descripcion = "Esta muy rico"
)
val Migas : Receta = Receta(
    name = "Migas",
    foto = R.drawable.migas,
    puntuacion = "★★★★★",
    tiempo = "60 min",
    descripcion = "Esta muy rico"
)

val listaRecetas : List<Receta> = listOf(
    Macarrones,
    ArrozConHuevo,
    Ensalada,
    Tortilla,
    Migas
)