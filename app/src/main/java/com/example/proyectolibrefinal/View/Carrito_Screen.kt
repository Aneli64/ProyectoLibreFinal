package com.example.proyectolibrefinal.View

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dam2_23_24.ejemplofirebase.viewModels.LoginViewModel
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.ViewModel.ViewModel
import com.example.proyectolibrefinal.Model.chooseMenu
import com.example.proyectolibrefinal.apartadocarrito.ApartadoCarrito
import com.example.proyectolibrefinal.framebotonesapp.FrameBotonesApp
import com.example.proyectolibrefinal.vistainicio.VistaInicio
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

/**
 * Pantalla que nos muestra el carrito de nuestra app
 * @param viewModel Viewmodel en el que se basa nuestra app
 * @param loginViewModel Viewmodel necesario para la insercción de los datos en la bd Firebase
 * @param navController Navegador que utilizaremos para dirigirnos a su pantalla
 */
@Composable
fun carrito_screen(
    viewModel: ViewModel,
    loginViewModel: LoginViewModel,
    navController: NavController
) {
    VistaInicio()
    encabezado()

    val context = LocalContext.current

    Column {
        Row(
            modifier = Modifier
                .padding(top = 140.dp)
                .padding(end = 165.dp)
        ) {
            ApartadoCarrito()

        }
        Box {
            LazyColumn(modifier = Modifier.fillMaxHeight(0.7f)) {
                items(viewModel.carrito) { item ->
                    chooseMenu(id = item, viewModel)
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 310.dp)
                    .padding(bottom = 16.dp)
                    .padding(end = 200.dp)
            ) {
                aceptarPedidoButton(
                    realizarPedidoButton = {
                        if (viewModel.pedido.isEmpty()) Toast.makeText(
                            context,
                            "¡Debe elegir sus menús!",
                            Toast.LENGTH_SHORT
                        ).show()
                        else {
                            loginViewModel.saveMenu(context, viewModel)
                            navController.navigate(Routes.Screen_Carrito.route)
                        }
                    },
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 310.dp)
                    .padding(bottom = 16.dp)
                    .padding(start = 200.dp)
            ) {
                deleteMenuButton(deleteMenusButton = {
                    viewModel.limpiarPedido()
                    Toast.makeText(
                        context,
                        "Pedido eliminado",
                        Toast.LENGTH_SHORT
                    ).show()
                    navController.navigate(Routes.Screen_Carrito.route)
                }
                )

            }
            Row(
                modifier = Modifier
                    .padding(top = 481.dp)
                    .padding(bottom = 16.dp)
            ) {
                FrameBotonesApp(
                    menuButton = {
                        navController.navigate(Routes.Screen_FoodMenu.route)
                        viewModel.deletePedidoPostCompra()
                        viewModel.boolSeguirComprando()
                    },
                    contactoButton = {
                        navController.navigate(Routes.Screen_Contact.route)
                        viewModel.deletePedidoPostCompra()
                        viewModel.boolSeguirComprando()
                    },
                    carritoButton = {
                        navController.navigate(Routes.Screen_Carrito.route)
                        viewModel.deletePedidoPostCompra()
                        viewModel.boolSeguirComprando()
                    },
                    homeButton = {
                        navController.navigate(Routes.Screen_Inic.route)
                        viewModel.deletePedidoPostCompra()
                        viewModel.boolSeguirComprando()
                    }
                )
            }

        }

    }
}

