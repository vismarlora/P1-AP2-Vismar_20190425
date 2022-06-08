package com.example.p1_ap2_vismar_20190425.ui.theme.prestamo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Registro(navHostController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Prestamo") })
        },
    ){


        Column(Modifier.padding(16.dp)) {

            OutlinedButton(onClick = { navHostController.navigate("NavegarConsulta") }) {
                Text(text = "Guardar")
            }
        }
    }
}