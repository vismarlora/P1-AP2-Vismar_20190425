package com.example.p1_ap2_vismar_20190425

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.p1_ap2_vismar_20190425.ui.theme.P1AP2Vismar_20190425Theme
import com.example.p1_ap2_vismar_20190425.ui.theme.entidades.Consulta
import com.example.p1_ap2_vismar_20190425.ui.theme.entidades.Registro

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            P1AP2Vismar_20190425Theme {
                // A surface container using the 'background' color from the theme

                MyApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        //Navegacion

        val navHostController = rememberNavController( )

        NavHost(navController = navHostController, startDestination = "NavegarRegistro") {

            composable(route = "NavegarConsulta"){
                Consulta(navHostController)
            }
            composable(route = "NavegarRegistro"){
                Registro(navHostController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    P1AP2Vismar_20190425Theme {
        MyApp()
    }
}