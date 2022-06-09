package com.example.p1_ap2_vismar_20190425.ui.theme.prestamo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.p1_ap2_vismar_20190425.model.Prestamo

@Composable
fun Consulta(
    navHostController: NavHostController,
    viewModel: PrestamoViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Consulta") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { navHostController.navigate("NavegarRegistro") }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ){

        Column(modifier = Modifier.padding(it).padding(8.dp)) {

            val lis = viewModel.listado.collectAsState(initial = emptyList()).value
            LazyColumn(modifier = Modifier.fillMaxWidth()){
                items(lis){prestamos->
                    RowP(prestamos)
                }
            }
        }
    }
}

@Composable
fun RowP(prest: Prestamo) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "Deudor: ${prest.deudor}")
        Text(text = "Concepto: ${prest.deudor}")
        Text(text = "Monto: ${prest.monto}")

    }
}