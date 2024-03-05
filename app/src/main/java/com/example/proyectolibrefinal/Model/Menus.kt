package com.example.proyectolibrefinal.Model

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.proyectolibrefinal.ViewModel.ViewModel
import com.example.proyectolibrefinal.framecartacompleta.Image3
import com.example.proyectolibrefinal.framecartacompleta.Image4
import com.example.proyectolibrefinal.framecartacompleta.Image5
import com.example.proyectolibrefinal.framecartacompleta.Image7
import com.example.proyectolibrefinal.framecartacompleta.Image8
import com.example.proyectolibrefinal.framecartacompleta.Line10
import com.example.proyectolibrefinal.framecartacompleta.Line11
import com.example.proyectolibrefinal.framecartacompleta.Line12
import com.example.proyectolibrefinal.framecartacompleta.Line13
import com.example.proyectolibrefinal.framecartacompleta.Line14
import com.example.proyectolibrefinal.framecartacompleta.Menu1
import com.example.proyectolibrefinal.framecartacompleta.Menu2
import com.example.proyectolibrefinal.framecartacompleta.Menu3
import com.example.proyectolibrefinal.framecartacompleta.Menu4
import com.example.proyectolibrefinal.framecartacompleta.Menu5
import com.example.proyectolibrefinal.framecartacompleta.Precio1
import com.example.proyectolibrefinal.framecartacompleta.Precio2
import com.example.proyectolibrefinal.framecartacompleta.Precio3
import com.example.proyectolibrefinal.framecartacompleta.Precio4
import com.example.proyectolibrefinal.framecartacompleta.Precio5
import com.example.proyectolibrefinal.framecartacompleta.Text1
import com.example.proyectolibrefinal.framecartacompleta.Text2
import com.example.proyectolibrefinal.framecartacompleta.Text3
import com.example.proyectolibrefinal.framecartacompleta.Text4
import com.example.proyectolibrefinal.framecartacompleta.Text5

/**
 * Metodo por el cual en base a un id, elegiremos mostrar los diferentes menus que se añadirán a
 * nuestro carrito
 * @param id ID del menú a mostrar
 * @param viewModel Viewmodel en el que se basa nuestra app
 */
@Composable
fun chooseMenu(id: Int, viewModel: ViewModel) {
    when (id) {
        1 -> menu1View({}, viewModel.menu1content[0], viewModel.menu1content[1])
        2 -> menu2View({}, viewModel.menu2content[0], viewModel.menu2content[1])
        3 -> menu3View({}, viewModel.menu3content[0], viewModel.menu3content[1])
        4 -> menu4View({}, viewModel.menu4content[0], viewModel.menu4content[1])
        5 -> menu5View({}, viewModel.menu5content[0], viewModel.menu5content[1])
    }
}

/**
 * Vista del menú 1
 * @param menu1Button Botón clickable que añade nuestro menú 1
 * @param nombreMenu1 Nombre completo de nuestro menu 1
 * @param precioMenu1 Precio completo de nuestro menu 1
 */
@Composable
fun menu1View(menu1Button: () -> Unit = {}, nombreMenu1: String, precioMenu1: String) {
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
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -149.0.dp,
                        y = -3.5.dp
                    )
                )
                .border(width = 5.dp, color = Color.White)
        )
        Text1(
            nombreMenu1 = nombreMenu1,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 20.5.dp,
                    y = -3.5.dp
                )
            ).border(width = 5.dp, color = Color.White)
        )
        Precio1(
            precioMenu1 = precioMenu1,
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 39.5.dp
                    )
                )
                .graphicsLayer(
                    translationX = 20.0F,
                    translationY = 50.0F
                )
        )
    }
}

/**
 * Vista del menú 2
 * @param menu2Button Botón clickable que añade nuestro menú 2
 * @param nombreMenu2 Nombre completo de nuestro menu 2
 * @param precioMenu2 Precio completo de nuestro menu 2
 */
@Composable
fun menu2View(menu2Button: () -> Unit = {}, nombreMenu2: String, precioMenu2: String) {
    Menu2(menu2Button = menu2Button) {
        Precio2(
            precioMenu2 = precioMenu2,
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 55.5.dp
                    )
                )
                .graphicsLayer(
                    translationX = 20.0F,
                    translationY = 50.0F
                )
        )
        Text2(
            nombreMenu2 = nombreMenu2,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 55.0.dp,
                    y = -8.5.dp
                )
            ).border(width = 5.dp, color = Color.White)
        )
        Image4(
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -124.5.dp,
                        y = -7.0.dp
                    )
                )
                .border(width = 5.dp, color = Color.White)
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

/**
 * Vista del menú 3
 * @param menu3Button Botón clickable que añade nuestro menú 3
 * @param nombreMenu3 Nombre completo de nuestro menu 3
 * @param precioMenu3 Precio completo de nuestro menu 3
 */
@Composable
fun menu3View(menu3Button: () -> Unit = {}, nombreMenu3: String, precioMenu3: String) {
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
            precioMenu3 = precioMenu3,
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 62.5.dp
                    )
                )
                .graphicsLayer(
                    translationX = 20.0F,
                    translationY = 30.0F
                )
        )
        Text3(
            nombreMenu3 = nombreMenu3,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 50.0.dp,
                    y = 2.5.dp
                )
            ).border(width = 5.dp, color = Color.White)
        )
        Image7(
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -127.0.dp,
                        y = -3.0.dp
                    )
                )
                .border(width = 5.dp, color = Color.White)
        )
    }
}

/**
 * Vista del menú 4
 * @param menu4Button Botón clickable que añade nuestro menú 4
 * @param nombreMenu4 Nombre completo de nuestro menu 4
 * @param precioMenu4 Precio completo de nuestro menu 4
 */
@Composable
fun menu4View(menu4Button: () -> Unit = {}, nombreMenu4: String, precioMenu4: String) {
    Menu4(menu4Button = menu4Button) {
        Line12(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -12.0.dp,
                    y = -64.49999999999987.dp
                )
            )
        )
        Precio4(
            precioMenu4 = precioMenu4,
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 60.5.dp
                    )
                )
                .graphicsLayer(
                    translationX = 20.0F,
                    translationY = 30.0F
                )
        )
        Text4(
            nombreMenu4 = nombreMenu4,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 50.0.dp,
                    y = 2.0.dp
                )
            ).border(width = 5.dp, color = Color.White)
        )
        Image8(
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -127.0.dp,
                        y = 2.5.dp
                    )
                )
        )
    }
}

/**
 * Vista del menú 5
 * @param menu5Button Botón clickable que añade nuestro menú 5
 * @param nombreMenu5 Nombre completo de nuestro menu 5
 * @param precioMenu5 Precio completo de nuestro menu 5
 */
@Composable
fun menu5View(menu5Button: () -> Unit = {}, nombreMenu5: String, precioMenu5: String) {
    Menu5(menu5Button = menu5Button) {
        Line14(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -12.0.dp,
                    y = -60.999999999999844.dp
                )
            )
        )
        Image5(
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -141.0.dp,
                        y = -3.5.dp
                    )
                )
                .border(width = 5.dp, color = Color.White)
        )
        Text5(
            nombreMenu5 = nombreMenu5,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 40.5.dp,
                    y = -3.5.dp
                )
            ).border(width = 5.dp, color = Color.White)
        )
        Precio5(
            precioMenu5 = precioMenu5,
            modifier = Modifier
                .boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 144.0.dp,
                        y = 58.5.dp
                    )
                )
                .graphicsLayer(
                    translationX = 20.0F,
                    translationY = 30.0F
                )
        )
    }
}