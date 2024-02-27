package com.example.proyectolibrefinal.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.ViewModel
import com.example.proyectolibrefinal.apartadoscontacto.ApartadosContacto
import com.example.proyectolibrefinal.framebotonesapp.FrameBotonesApp
import com.example.proyectolibrefinal.vistainicio.VistaInicio


@Composable
fun contacto_screen(viewModel: ViewModel, navController: NavController) {
    VistaInicio()
    encabezado()

    Column {
        Row(modifier = Modifier.padding(top = 100.dp)) {
            ApartadosContacto()
        }
        Row(modifier = Modifier.padding(top = 112.dp)) {
            FrameBotonesApp(
                menuButton = { navController.navigate(Routes.Screen_FoodMenu.route) },
                contactoButton = { navController.navigate(Routes.Screen_Contact.route) },
                carritoButton = { navController.navigate(Routes.Screen_Carrito.route) },
                homeButton = { navController.navigate(Routes.Screen_Inic.route) }
            )
        }
    }

}

