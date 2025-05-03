package com.aufarizazakipradana607062330127.asesment2.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
}