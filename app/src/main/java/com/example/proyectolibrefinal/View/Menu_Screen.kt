package com.example.proyectolibrefinal.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectolibrefinal.ViewModel
import com.example.proyectolibrefinal.framecartacompleta.FrameCartaCompleta
import com.example.proyectolibrefinal.vistainicio.VistaInicio

//@Preview
@Composable
fun menu_screen(viewModel: ViewModel, navController: NavController) {
    //Fondo de pantalla
    VistaInicio()

    Column (modifier = Modifier.padding(start = 20.dp)) {
         Row (modifier = Modifier.height(800.dp)){
             FrameCartaCompleta(
                 menu1Button = {viewModel.pedirMenu(1)},
                 menu2Button = {viewModel.pedirMenu(2)},
                 menu3Button = {viewModel.pedirMenu(3)},
                 menu4Button = {viewModel.pedirMenu(4)},
                 menu5Button = {viewModel.pedirMenu(5)},
                 menu6Button = {viewModel.pedirMenu(6)}
             )
         }

    }

}