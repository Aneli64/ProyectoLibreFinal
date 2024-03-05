package com.example.proyectolibrefinal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectolibrefinal.realizarpedidobutton.Group1
import com.example.proyectolibrefinal.realizarpedidobutton.Rectangle3
import com.example.proyectolibrefinal.realizarpedidobutton.TituloTextInf
import com.example.proyectolibrefinal.realizarpedidobutton.TopLevel
import com.example.proyectolibrefinal.realizarpedidobutton.sansitaSwashed
import com.google.relay.compose.RelayText

@Composable
fun TextDeleteButton(modifier: Modifier = Modifier) {
    RelayText(
        content = "Eliminar",
        fontSize = 20.0.sp,
        fontFamily = sansitaSwashed,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun deleteMenuButton(
    modifier: Modifier = Modifier,
    realizarPedidoButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Group1 {
            Rectangle3(
                realizarPedidoButton = realizarPedidoButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                ).background(Color.Black)
            )
            TextDeleteButton(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 11.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Composable
fun aceptarPedidoButton(
    modifier: Modifier = Modifier,
    realizarPedidoButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Group1 {
            Rectangle3(
                realizarPedidoButton = realizarPedidoButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                ).background(Color.Black)
            )
            TituloTextInf(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 11.0.dp,
                        y = 0.0.dp
                    )
                )
            )

        }
    }
}