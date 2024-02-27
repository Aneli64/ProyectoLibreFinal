package com.example.proyectolibrefinal.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.proyectolibrefinal.R
import com.example.proyectolibrefinal.apartadocarrito.ApartadoCarrito
import com.example.proyectolibrefinal.apartadoinicio1.ApartadoInicio1
import com.example.proyectolibrefinal.apartadoinicio2.ApartadoInicio2
import com.example.proyectolibrefinal.framebotonesapp.FrameBotonesApp
import com.example.proyectolibrefinal.framecartacompleta.FrameCartaCompleta
import com.example.proyectolibrefinal.framecartacompleta.Image3
import com.example.proyectolibrefinal.framecartacompleta.Image4
import com.example.proyectolibrefinal.framecartacompleta.Image7
import com.example.proyectolibrefinal.framecartacompleta.Line10
import com.example.proyectolibrefinal.framecartacompleta.Line11
import com.example.proyectolibrefinal.framecartacompleta.Line13
import com.example.proyectolibrefinal.framecartacompleta.Menu1
import com.example.proyectolibrefinal.framecartacompleta.Menu2
import com.example.proyectolibrefinal.framecartacompleta.Menu3
import com.example.proyectolibrefinal.framecartacompleta.Precio1
import com.example.proyectolibrefinal.framecartacompleta.Precio2
import com.example.proyectolibrefinal.framecartacompleta.Precio3
import com.example.proyectolibrefinal.framecartacompleta.Text1
import com.example.proyectolibrefinal.framecartacompleta.Text2
import com.example.proyectolibrefinal.framecartacompleta.Text3
import com.example.proyectolibrefinal.vistainicio.VistaInicio

class Screen1 {

    @Composable
    fun encabezado() {
        val encabezado: Painter = painterResource(id = R.drawable.frame_encabezado_preview)
        Column {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 670.dp)
                    .padding(start = 5.dp)
            ) {
                Image(
                    painter = encabezado,
                    contentDescription = "imagen encabezado",
                    Modifier.size(400.dp)
                )
            }
        }
    }

    @Composable
    fun lineaDiv() {
        val linea: Painter = painterResource(id = R.drawable.apartado_inicio_1_line_9)

        Image(
            painter = linea,
            contentDescription = "linea",
            Modifier.size(400.dp)
        )
    }

    @Composable
    fun menu1View(menu1Button: () -> Unit = {}) {
        Menu1(menu1Button = menu1Button) {
            Line13(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -12.0.dp,
                        y = -60.99999999999987.dp
                    )
                )
            )
            Image3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -149.0.dp,
                        y = -3.5.dp
                    )
                )
            )
            Text1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 25.5.dp,
                        y = -3.5.dp
                    )
                )
            )
            Precio1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 39.5.dp
                    )
                )
            )
        }
    }

    @Composable
    fun menu2View(menu2Button: () -> Unit = {}) {
        Menu2(menu2Button = menu2Button) {
            Precio2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 55.5.dp
                    )
                )
            )
            Text2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 57.0.dp,
                        y = 5.5.dp
                    )
                )
            )
            Image4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -124.5.dp,
                        y = -7.0.dp
                    )
                )
            )
            Line10(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -12.0.dp,
                        y = -76.99999999999987.dp
                    )
                )
            )
        }
    }

    @Composable
    fun menu3View(menu3Button: () -> Unit = {}) {
        Menu3(menu3Button = menu3Button) {
            Line11(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -12.0.dp,
                        y = -67.49999999999987.dp
                    )
                )
            )
            Precio3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 46.0.dp
                    )
                )
            )
            Text3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 57.0.dp,
                        y = 5.0.dp
                    )
                )
            )
            Image7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -127.0.dp,
                        y = -3.0.dp
                    )
                )
            )
        }
    }

    @Preview
    @Composable
    fun inicio() {
        //Fondo de pantalla y encabezado
        VistaInicio()
        encabezado()

        Column {
            Row(Modifier.padding(top = 150.dp)) {
                ApartadoInicio1()
            }
            Row(modifier = Modifier
                .height(60.dp)
                .padding(start = 30.dp)) {
                menu1View()
            }

            Row (modifier = Modifier.padding(start = 30.dp)){
                menu2View()
            }

            Row(modifier = Modifier
                .height(35.dp)
                .padding(start = 25.dp)
                .padding(end = 25.dp)) {
                lineaDiv()
            }
            Row(modifier = Modifier.height(60.dp)) {
                ApartadoInicio2()
            }
            Row (modifier = Modifier.padding(start = 30.dp)){
                menu3View()
            }

            Row (modifier = Modifier.padding(top = 30.dp)){
                FrameBotonesApp(
                    menuButton = {},
                    contactoButton = {},
                    carritoButton = {}
                )
            }

        }

    }
}