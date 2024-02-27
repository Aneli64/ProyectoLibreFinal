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
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.View.carrito_screen
import com.example.proyectolibrefinal.View.contacto_screen
import com.example.proyectolibrefinal.View.inicio_screen
import com.example.proyectolibrefinal.View.menu_screen
import com.example.proyectolibrefinal.ui.theme.ProyectoLibreFinalTheme

class MainActivity : ComponentActivity() {

    private val viewModel: ViewModel by viewModels()

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
                        navController = navController, startDestination = Routes.Screen_Inic.route
                    ) {
                        composable(Routes.Screen_Inic.route) { inicio_screen(viewModel, navController) }
                        composable(Routes.Screen_FoodMenu.route) { menu_screen(viewModel, navController) }
                        composable(Routes.Screen_Contact.route) { contacto_screen(viewModel, navController) }
                        composable(Routes.Screen_Carrito.route) { carrito_screen(viewModel, navController) }
                    }
                }
            }
        }
    }
}
