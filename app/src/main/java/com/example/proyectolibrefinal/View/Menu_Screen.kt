package com.example.proyectolibrefinal.View

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dam2_23_24.ejemplofirebase.viewModels.LoginViewModel
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.ViewModel.ViewModel
import com.example.proyectolibrefinal.framebotonesapp.FrameBotonesApp
import com.example.proyectolibrefinal.framecartacompleta.FrameCartaCompleta
import com.example.proyectolibrefinal.vistainicio.VistaInicio

/**
 * Pantalla que nos muestra el menú completo de nuestra app
 * @param viewModel Viewmodel en el que se basa nuestra app
 * @param navController Navegador que utilizaremos para dirigirnos a su pantalla
 */
@Composable
fun menu_screen(
    viewModel: ViewModel,
    navController: NavController,
    loginViewModel: LoginViewModel
) {
    //Fondo de pantalla
    VistaInicio()

    var context = LocalContext.current


    Column(
        modifier = Modifier
            .padding(start = 20.dp)
    ) {
        Box {
            FrameCartaCompleta(
                menu1Button = {
                    viewModel.pedirMenu(context, 1)
                    loginViewModel.saveMenu(1, viewModel)
                },
                menu2Button = {
                    viewModel.pedirMenu(context, 2)
                    loginViewModel.saveMenu(2, viewModel)
                },
                menu3Button = {
                    viewModel.pedirMenu(context, 3)
                    loginViewModel.saveMenu(3, viewModel)
                },
                menu4Button = {
                    viewModel.pedirMenu(context, 4)
                    loginViewModel.saveMenu(4, viewModel)
                },
                menu5Button = {
                    viewModel.pedirMenu(context, 5)
                    loginViewModel.saveMenu(5, viewModel)
                },
                nombreMenu1 = viewModel.menu1content[0],
                precioMenu1 = viewModel.menu1content[1],
                precioMenu2 = viewModel.menu2content[1],
                nombreMenu2 = viewModel.menu2content[0],
                precioMenu3 = viewModel.menu3content[1],
                nombreMenu3 = viewModel.menu3content[0],
                precioMenu4 = viewModel.menu4content[1],
                nombreMenu4 = viewModel.menu4content[0],
                nombreMenu5 = viewModel.menu5content[0],
                precioMenu5 = viewModel.menu5content[1]
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