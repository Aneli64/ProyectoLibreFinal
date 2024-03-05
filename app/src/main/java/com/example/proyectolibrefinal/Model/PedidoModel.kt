package com.example.proyectolibrefinal.Model

/**
 * Clase que almacena nuestro pedido completo listo para ser solicitado
 * @param idPedido id de nuestro pedido
 * @param listaMenusPedido menus que incluye nuestro pedido
 */
data class PedidoModel(
    val idPedido: String,
    val listaMenusPedido: MutableList<MenuModel>
)
