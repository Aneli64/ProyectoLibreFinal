package com.example.proyectolibrefinal.Model

sealed class Routes(val route: String) {

    object Screen_Inic : Routes("pantalla icono 1 (inicio)")
    object Screen_FoodMenu : Routes("pantalla icono 2 (menu)")
    object Screen_Contact : Routes("pantalla icono 3 (contacto)")
    object Screen_Carrito : Routes("pantalla icono 4 (carrito)")
    object Screen_Login : Routes("pantalla de login")
}