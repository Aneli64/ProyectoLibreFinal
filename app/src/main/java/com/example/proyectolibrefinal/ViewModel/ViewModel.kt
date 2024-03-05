package com.example.proyectolibrefinal.ViewModel

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import com.example.proyectolibrefinal.Model.MenuModel

/**
 * Clase ViewModel en dodne gestionaremos la lógica necesaria en nuestro programa
 * @param app aplicacion a la que hacemos referencia
 */
class ViewModel(app: Application) : AndroidViewModel(app) {

    //Boolean que gestionan si es solicitado o no, un menú determinado
    private var menu1Pedido: Boolean = false
    private var menu2Pedido: Boolean = false
    private var menu3Pedido: Boolean = false
    private var menu4Pedido: Boolean = false
    private var menu5Pedido: Boolean = false

    val menu1content = listOf("Timbal de patatas, huevos y jamón", "12,50€")
    val menu2content = listOf("Merluza rellena de gambas", "14,70€")
    val menu3content = listOf("Salmorejo con mejillón frito", "8,65€")
    val menu4content = listOf("Sardinillas en aceite, oliva y tallarín", "11,50€")
    val menu5content = listOf("Crema de calabaza con vieiras", "6,50€")

    //carrito en donde almacenaremos los menus solicitados
    var carrito = mutableListOf<Int>()
    var pedido = mutableListOf<MenuModel>()

    var realizarPedidoClicked: Boolean = false
    var limpiarPedidoClicked: Boolean = false

    /**
     * Método por el cual añadiremos un menu a nuestro carrito personal
     * @param context Contexto en donde se realizan las operaciones
     * @param idMenu Menu al que hacemos referencia
     */
    fun pedirMenu(context: Context, idMenu: Int) {

        when (idMenu) {
            1 -> {
                menu1Pedido = true
                carrito.add(1)
                pedido.add(MenuModel(menu1content[0], menu1content[1]))
                Toast.makeText(context, "Menu 1 añadido al carrito", Toast.LENGTH_SHORT).show()
                menu1Pedido = false
            }

            2 -> {
                menu2Pedido = true
                carrito.add(2)
                pedido.add(MenuModel(menu2content[0], menu2content[1]))
                Toast.makeText(context, "Menu 2 añadido al carrito", Toast.LENGTH_SHORT).show()
                menu2Pedido = false
            }

            3 -> {
                menu3Pedido = true
                carrito.add(3)
                pedido.add(MenuModel(menu3content[0], menu3content[1]))
                Toast.makeText(context, "Menu 3 añadido al carrito", Toast.LENGTH_SHORT).show()
                menu3Pedido = false
            }

            4 -> {
                menu4Pedido = true
                carrito.add(4)
                pedido.add(MenuModel(menu4content[0], menu4content[1]))
                Toast.makeText(context, "Menu 4 añadido al carrito", Toast.LENGTH_SHORT).show()
                menu4Pedido = false
            }

            5 -> {
                menu5Pedido = true
                carrito.add(5)
                pedido.add(MenuModel(menu5content[0], menu5content[1]))
                Toast.makeText(context, "Menu 5 añadido al carrito", Toast.LENGTH_SHORT).show()
                menu5Pedido = false
            }
        }
    }

    fun deletePedidoPostCompra() {
        if (realizarPedidoClicked) {
            carrito.clear()
            pedido.clear()
            realizarPedidoClicked = false
        }
    }

    fun limpiarPedido(){
        if (!limpiarPedidoClicked && pedido.isNotEmpty()) {
            carrito.clear()
            pedido.clear()
            limpiarPedidoClicked = true
        }
    }

    fun boolSeguirComprando(){
        if (limpiarPedidoClicked) {
            limpiarPedidoClicked = false
        }
    }
}