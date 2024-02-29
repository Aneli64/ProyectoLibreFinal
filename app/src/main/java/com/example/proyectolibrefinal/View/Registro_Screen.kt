package com.example.proyectolibrefinal.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dam2_23_24.ejemplofirebase.viewModels.LoginViewModel
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.vistainicio.VistaInicio


@Composable
fun pantalla_registro(navController: NavController, loginViewModel: LoginViewModel) {
    VistaInicio()

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (Modifier.padding(end = 240.dp)){
            Text(text = "REGISTRO")
        }

        Row {
            TextField(
                value = loginViewModel.email,
                onValueChange = { loginViewModel.changeEmail(it) },
                label = { Text("Usuario")}
            )
        }

        Row {
            TextField(
                value = loginViewModel.password,
                onValueChange = { loginViewModel.changePassword(it) },
                label = { Text("Contraseña") }
            )
        }

        Row(Modifier.padding(10.dp)) {
            Button(onClick = { loginViewModel.createUser { navController.navigate(Routes.Screen_Login.route) }}
                ,
                colors = ButtonDefaults.textButtonColors(Color.White)
            ) {
                Text(
                    text = "Registrarse",
                    modifier = Modifier.padding(20.dp),
                    color = Color.Black,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }
        }
    }
    LlamadaShowAlert(loginViewModel = loginViewModel)
}
