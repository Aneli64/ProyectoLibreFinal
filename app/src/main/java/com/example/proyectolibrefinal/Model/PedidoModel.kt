package com.example.proyectolibrefinal.Model

data class PedidoModel(
    val idPedido: String,
    val listaMenusPedido: MutableList<MenuModel>
)
