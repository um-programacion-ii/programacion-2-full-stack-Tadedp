package ar.edu.um.programacion2

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import ar.edu.um.programacion2.screens.MainNavigationScreen
import cafe.adriel.voyager.navigator.Navigator

@Composable
fun App() {
    MaterialTheme {
        Navigator(
            screen = MainNavigationScreen()
        )
    }
}