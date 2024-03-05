package com.example.proyectolibrefinal.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dam2_23_24.ejemplofirebase.viewModels.LoginViewModel
import com.example.proyectolibrefinal.Model.Routes
import com.example.proyectolibrefinal.vistainicio.VistaInicio

/**
 * Screen en donde realizamos el registro de un nuevo usuario
 * @param navController Navegador que utilizaremos para dirigirnos a su pantalla
 * @param loginViewModel Viewmodel necesario para la insercción de los datos en la bd Firebase
 */
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
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
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
    LlamadaShowAlertRegistro(loginViewModel = loginViewModel)
}

/**
 * Alerta que mostraremos en caso de error al registrarnos
 * @param confirmText Texto de confirmacion
 * @param onAcceptClick Lamba para nuestro logeo
 * @param OnDissmisClicl Lambda en caso de error de logeo
 */
@Composable
fun ShowAlertRegistro(
    confirmText: String,
    onAcceptClick: () -> Unit,
    OnDissmisClicl: () -> Unit
) {

    AlertDialog(onDismissRequest = { OnDissmisClicl() },
        title = { Text(text = "Error") },
        text = {
            Text(
                text = "Datos no válidos (Recuerde que el usuario debe de ser un correo, y la contraseña contener" +
                        " como mínimo una mayúscula, numero y carácter especial)",
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

/**
 * Metodo que nos lanza nuestro alerta de registro
 * @param loginViewModel Viewmodel necesario para la conexion de los datos con Firebase
 */
@Composable
fun LlamadaShowAlertRegistro(loginViewModel: LoginViewModel) {
    if (loginViewModel.showAlert) {
        ShowAlertRegistro(confirmText = "aceptar", onAcceptClick = { loginViewModel.closeAlert() }) {
        }
    }
}
