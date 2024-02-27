package com.example.proyectolibrefinal

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ViewModel(app: Application) : AndroidViewModel(app) {

    var menu1Pedido: Boolean = false
    var menu2Pedido: Boolean = false
    var menu3Pedido: Boolean = false
    var menu4Pedido: Boolean = false
    var menu5Pedido: Boolean = false
    var menu6Pedido: Boolean = false

    var carrito = mutableListOf<Int>()

    fun pedirMenu(idMenu: Int) {
        when (idMenu) {
            1 -> {
                menu1Pedido = true
                carrito.add(1)
                menu1Pedido = false
            }

            2 -> {
                menu2Pedido = true
                carrito.add(2)
                menu2Pedido = false
            }

            3 -> {
                menu3Pedido = true
                carrito.add(3)
                menu3Pedido = false
            }

            4 -> {
                menu4Pedido = true
                carrito.add(4)
                menu4Pedido = false
            }

            5 -> {
                menu5Pedido = true
                carrito.add(5)
                menu5Pedido = false
            }

            6 -> {
                menu6Pedido = true
                carrito.add(6)
                menu6Pedido = false
            }
        }
    }
}