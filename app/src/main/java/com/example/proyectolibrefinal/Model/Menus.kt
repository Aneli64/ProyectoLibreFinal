package com.example.proyectolibrefinal.Model

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
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
 * Metodo por el cual en base a un id, elegiremos mostrar los diferentes menus que apareceŕan en
 * nuestro carrito
 * @param id ID del menú a mostrar
 */
@Composable
fun chooseMenu(id: Int){
    when(id){
        1 -> menu1View()
        2 -> menu2View()
        3 -> menu3View()
        4 -> menu4view()
        5 -> menu5view()
    }
}

/**
 * Vista del menú 1
 * @param menu1Button Botón clickable que añade nuestro menú 1
 */
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

/**
 * Vista del menú 2
 * @param menu2Button Botón clickable que añade nuestro menú 2
 */
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

/**
 * Vista del menú 3
 * @param menu3Button Botón clickable que añade nuestro menú 3
 */
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

/**
 * Vista del menú 4
 * @param menu4Button Botón clickable que añade nuestro menú 4
 */
@Composable
fun menu4view(menu4Button: () -> Unit = {}){
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
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 144.0.dp,
                    y = 43.0.dp
                )
            )
        )
        Text4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 57.0.dp,
                    y = 1.0.dp
                )
            )
        )
        Image8(
            modifier = Modifier.boxAlign(
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
 */
@Composable
fun menu5view(menu5Button: () -> Unit = {}){
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
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -141.0.dp,
                    y = -3.5.dp
                )
            )
        )
        Text5(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 45.5.dp,
                    y = -3.5.dp
                )
            )
        )
        Precio5(
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