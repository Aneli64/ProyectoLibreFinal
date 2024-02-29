package com.example.proyectolibrefinal.View

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.ViewModel.ViewModel
import com.example.proyectolibrefinal.Model.chooseMenu
import com.example.proyectolibrefinal.apartadocarrito.ApartadoCarrito
import com.example.proyectolibrefinal.framebotonesapp.FrameBotonesApp
import com.example.proyectolibrefinal.vistainicio.VistaInicio

/**
 * Pantalla que nos muestra el carrito de nuestra app
 * @param viewModel Viewmodel en el que se basa nuestra app
 * @param navController Navegador que utilizaremos para dirigirnos a su pantalla
 */
@Composable
fun carrito_screen(viewModel: ViewModel, navController: NavController) {
    VistaInicio()
    encabezado()

    Column {
        Row(
            modifier = Modifier
                .padding(top = 140.dp)
                .padding(end = 165.dp)
        ) {
            ApartadoCarrito()
        }

        Box {
            LazyColumn {
                items(viewModel.carrito) { item ->
                    chooseMenu(id = item)
                }
            }

            Row(
                modifier = Modifier
                    .padding(top = 481.dp)
                    .padding(bottom = 16.dp)
            ) {
                FrameBotonesApp(
                    menuButton = { navController.navigate(Routes.Screen_FoodMenu.route) },
                    contactoButton = { navController.navigate(Routes.Screen_Contact.route) },
                    carritoButton = { navController.navigate(Routes.Screen_Carrito.route) },
                    homeButton = { navController.navigate(Routes.Screen_Inic.route) }
                )
            }
        }
    }
}

