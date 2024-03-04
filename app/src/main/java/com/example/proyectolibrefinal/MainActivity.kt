package com.example.proyectolibrefinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dam2_23_24.ejemplofirebase.viewModels.LoginViewModel
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.ViewModel.ViewModel
import com.example.proyectolibrefinal.View.carrito_screen
import com.example.proyectolibrefinal.View.contacto_screen
import com.example.proyectolibrefinal.View.inicio_screen
import com.example.proyectolibrefinal.View.menu_screen
import com.example.proyectolibrefinal.View.pantalla_login
import com.example.proyectolibrefinal.View.pantalla_registro
import com.example.proyectolibrefinal.ui.theme.ProyectoLibreFinalTheme

class MainActivity : ComponentActivity() {

    private val viewModel: ViewModel by viewModels()
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoLibreFinalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController, startDestination = Routes.Screen_Login.route
                    ) {
                        composable(Routes.Screen_Inic.route) { inicio_screen(viewModel, navController) }
                        composable(Routes.Screen_FoodMenu.route) { menu_screen(viewModel, navController, loginViewModel) }
                        composable(Routes.Screen_Contact.route) { contacto_screen(viewModel, navController) }
                        composable(Routes.Screen_Carrito.route) { carrito_screen(viewModel, navController) }
                        composable(Routes.Screen_Login.route) { pantalla_login(navController, loginViewModel) }
                        composable(Routes.Screen_Registro.route) { pantalla_registro(navController, loginViewModel) }
                    }
                }
            }
        }
    }
}
