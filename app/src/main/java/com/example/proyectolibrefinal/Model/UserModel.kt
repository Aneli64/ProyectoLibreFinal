package com.example.proyectolibrefinal.Model

/**
 * Clase UserModel que utilizamos para almacenar el usuario
 * @property userID id de nuestro nuevo usuario
 * @property email correo de nuestro nuevo usuario
 * @property passw contraseña de nuestro nuevo usuario
 */
data class UserModel (
    val userID:String,
    val email:String,
    val passw:String
)
