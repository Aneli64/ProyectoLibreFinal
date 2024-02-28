package com.example.proyectolibrefinal.View

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.ViewModel
import com.example.proyectolibrefinal.apartadocarrito.ApartadoCarrito
import com.example.proyectolibrefinal.framebotonesapp.FrameBotonesApp
import com.example.proyectolibrefinal.framecartacompleta.FrameCartaCompleta
import com.example.proyectolibrefinal.vistainicio.VistaInicio

//@Preview
@Composable
fun menu_screen(viewModel: ViewModel, navController: NavController) {
    var context = LocalContext.current

    //Fondo de pantalla
    VistaInicio()

    Column(
        modifier = Modifier
            .padding(start = 20.dp)
    ) {
        Box {
            FrameCartaCompleta(
                menu1Button = { viewModel.pedirMenu(context, 1) },
                menu2Button = { viewModel.pedirMenu(context, 2) },
                menu3Button = { viewModel.pedirMenu(context, 3) },
                menu4Button = { viewModel.pedirMenu(context, 4) },
                menu5Button = { viewModel.pedirMenu(context, 5) }
            )
            Row(
                modifier = Modifier
                    .padding(top = 731.dp)
                    .padding(bottom = 16.dp)
                    .padding(end = 20.dp)
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