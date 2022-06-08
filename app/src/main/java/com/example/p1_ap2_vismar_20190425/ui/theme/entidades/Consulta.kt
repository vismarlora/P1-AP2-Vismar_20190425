package com.example.p1_ap2_vismar_20190425.ui.theme.entidades

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun Consulta(navHostController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Consulta") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { navHostController.navigate("NavegarRegistro") }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)

            }
        },
    ){

    }
}