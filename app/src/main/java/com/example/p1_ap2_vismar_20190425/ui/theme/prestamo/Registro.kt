package com.example.p1_ap2_vismar_20190425.ui.theme.prestamo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroPrestamo(navHostController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Prestamo") })
        },
    ){
        Column(Modifier.padding(16.dp)) {

            OutlinedTextField(
                value = ViewModel.deudor,
                label = { Text(text = "Deudor") },
                onValueChange = { ViewModel.deudor = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                }
            )
            OutlinedTextField(
                value = ViewModel.concepto,
                label = { Text(text = "Concepto") },
                onValueChange = { ViewModel.concepto = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Concepto, contentDescription = null)
                }
            )

            OutlinedTextField(
                value = ViewModel.monto.toString(),
                label = { Text(text = "Monto") },
                onValueChange = {ViewModel.monto = it.toFloat()},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
                }
            )

            OutlinedButton(onClick = { navHostController.navigate("NavegarConsulta") }) {
                Text(text = "Guardar")
            }
        }
    }
}