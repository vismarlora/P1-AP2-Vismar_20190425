package com.example.p1_ap2_vismar_20190425.ui.theme.prestamo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.NotAccessible
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroPrestamo(
    navHostController: NavHostController,
    viewModel: PrestamoViewModel = hiltViewModel()
) {

    val scaffoldState = rememberScaffoldState()
    var deudor by rememberSaveable() {
        mutableStateOf("")
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Prestamo") })
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                  viewModel.Guardar()  
                }
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ){
        Column(Modifier.padding(16.dp)) {

            OutlinedTextField(
                value = viewModel.deudor,
                label = { Text(text = "Deudor") },
                onValueChange = { viewModel.deudor = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                }
            )
            OutlinedTextField(
                value = viewModel.concepto,
                label = { Text(text = "Concepto") },
                onValueChange = { viewModel.concepto = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.NotAccessible, contentDescription = null)
                }
            )

            OutlinedTextField(
                value = viewModel.monto.toString(),
                label = { Text(text = "Monto") },
                onValueChange = {viewModel.monto = it.toFloat()},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
                }
            )


        }
    }
}