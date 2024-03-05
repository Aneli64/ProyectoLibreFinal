package com.dam2_23_24.ejemplofirebase.viewModels

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectolibrefinal.Model.PedidoModel
import com.example.proyectolibrefinal.Model.UserModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {

    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore

    var showAlert by mutableStateOf(false)
        private set
    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var userName by mutableStateOf("")
        private set
    var selectedTab by mutableIntStateOf(0)
        private set

    /**
     * Metdo que nos realiza el login siempre u caudno se cumplan las condiciones necesarias
     * @param onSuccess Lamda que se ejecuta al realizarse correctamente la operacion de login
     */
    fun login(onSuccess: () -> Unit){
        viewModelScope.launch {
            try {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            onSuccess()
                        } else {
                            Log.d("ERROR EN FIREBASE","Usuario y/o contrasena incorrectos")
                            showAlert = true
                        }
                    }
            } catch (e: Exception){
                Log.d("ERROR EN JETPACK", "ERROR: ${e.localizedMessage}")
            }
        }
    }

    /**
     * Metodo que crea un numero usuario en base a un email y password
     * @param onSuccess Lamda que se ejecuta al realizarse correctamente la operacion de create
     */
    fun createUser(onSuccess: () -> Unit){
        viewModelScope.launch {
            try {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            saveUser(userName)
                            onSuccess()
                        } else {
                            Log.d("ERROR EN FIREBASE","Error al crear usuario")
                            showAlert = true
                        }
                    }
            } catch (e: Exception){
                Log.d("ERROR CREAR USUARIO", "ERROR: ${e.localizedMessage}")
            }
        }
    }

    /**
     * Metodo que almacena nuestro usuario en Firebase
     * @param username Nombre de usuario a guardar.
     */
    private fun saveUser(username: String){
        val id = auth.currentUser?.uid
        val email = auth.currentUser?.email

        viewModelScope.launch(Dispatchers.IO) {
            val user = UserModel(
                userID = id.toString(),
                email = email.toString(),
                passw = password
            )
            firestore.collection("Users")
                .add(user)
                .addOnSuccessListener { Log.d("GUARDAR OK", "Se guardó el usuario correctamente en Firestore") }
                .addOnFailureListener { Log.d("ERROR AL GUARDAR", "ERROR al guardar en Firestore") }
        }
    }

    fun saveMenu(context: Context, viewModel: com.example.proyectolibrefinal.ViewModel.ViewModel) {
        println(viewModel.pedido)
        val id = auth.currentUser?.uid
        if (id != null) {
            viewModelScope.launch(Dispatchers.IO) {
                firestore.collection("Menus")
                    .add(PedidoModel(id, viewModel.pedido))
            }
        } else {
            Log.e("ERROR EN FIREBASE", "ID de usuario es nulo")
            // Manejar el caso en el que el ID de usuario es nulo, si es necesario
        }

        viewModel.realizarPedidoClicked = true
        Toast.makeText(context, "¡Pedido realizado con éxito!", Toast.LENGTH_SHORT).show()
    }


    /**
     * Cierra el diálogo de alerta de error mostrada en la UI.
     */
    fun closeAlert(){
        showAlert = false
    }

    /**
     * Actualiza el email del usuario.
     * @param email Nuevo email a establecer.
     */
    fun changeEmail(email: String) {
        this.email = email
    }

    /**
     * Actualiza la contraseña del usuario.
     * @param password Nueva contraseña a establecer.
     */
    fun changePassword(password: String) {
        this.password = password
    }

    /**
     * Actualiza el nombre de usuario.
     * @param userName Nuevo nombre de usuario a establecer.
     */
    fun changeUserName(userName: String) {
        this.userName = userName
    }

    /**
     * Cambia la pestaña seleccionada en la UI.
     * @param selectedTab Índice de la nueva pestaña seleccionada.
     */
    fun changeSelectedTab(selectedTab: Int) {
        this.selectedTab = selectedTab
    }
}