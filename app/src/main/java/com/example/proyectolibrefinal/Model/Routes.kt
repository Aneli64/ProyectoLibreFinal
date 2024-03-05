package com.example.proyectolibrefinal.Model

/**
 * Routas con las que cuenta nuestra app para navegar
 * @param route ruta a la que hacemos referencia
 */
sealed class Routes(val route: String) {

    object Screen_Inic : Routes("pantalla icono 1 (inicio)")
    object Screen_FoodMenu : Routes("pantalla icono 2 (menu)")
    object Screen_Contact : Routes("pantalla icono 3 (contacto)")
    object Screen_Carrito : Routes("pantalla icono 4 (carrito)")
    object Screen_Login : Routes("pantalla de login")
    object Screen_Registro : Routes("pantalla de registro")
}