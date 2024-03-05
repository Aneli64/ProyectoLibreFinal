package com.example.proyectolibrefinal.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dam2_23_24.ejemplofirebase.viewModels.LoginViewModel
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.ViewModel.ViewModel
import com.example.proyectolibrefinal.vistainicio.VistaInicio


@Composable
fun pantalla_login(navController: NavController, loginViewModel: LoginViewModel) {
    VistaInicio()

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(Modifier.padding(end = 240.dp)) {
            Text(text = "LOGIN")
        }

        Row {
            TextField(
                value = loginViewModel.email,
                onValueChange = { loginViewModel.changeEmail(it) },
                label = { Text("Usuario") }
            )
        }

        Row {
            TextField(
                value = loginViewModel.password,
                onValueChange = { loginViewModel.changePassword(it) },
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
            )
        }

        Row(Modifier.padding(10.dp)) {
            Button(onClick = { navController.navigate(Routes.Screen_Registro.route) },
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

        Row(Modifier.padding(10.dp)) {
            Button(onClick = { loginViewModel.login { navController.navigate(Routes.Screen_Inic.route) } },
                colors = ButtonDefaults.textButtonColors(Color.White)
            ) {
                Text(
                    text = "Aceptar",
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

@Composable
fun ShowAlert(
    confirmText: String,
    onAcceptClick: () -> Unit,
    OnDissmisClicl: () -> Unit
) {

    AlertDialog(onDismissRequest = { OnDissmisClicl() },
        title = { Text(text = "Error") },
        text = {
            Text(
                text = "Usuario y/o Contraseña no válida",
                textAlign = TextAlign.Justify
            )
        },
        confirmButton = {
            Button(onClick = { onAcceptClick() }) {
                Text(text = confirmText)
            }
        }
    )

}


@Composable
fun LlamadaShowAlert(loginViewModel: LoginViewModel) {
    if (loginViewModel.showAlert) {
        ShowAlert(confirmText = "aceptar", onAcceptClick = { loginViewModel.closeAlert() }) {
        }
    }
}
