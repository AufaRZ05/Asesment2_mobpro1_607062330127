package com.aufarizazakipradana607062330127.asesment2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.aufarizazakipradana607062330127.asesment2.ui.screen.DetailScreen
import com.aufarizazakipradana607062330127.asesment2.ui.screen.KEY_ID_KELOLAPRODUK
import com.aufarizazakipradana607062330127.asesment2.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.FormBaru.route) {
            DetailScreen(navController)
        }
        composable(
            route = Screen.FormUbah.route,
            arguments = listOf(
                navArgument(KEY_ID_KELOLAPRODUK) { type = NavType.LongType}
            )
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong(KEY_ID_KELOLAPRODUK)
            DetailScreen(navController, id)
        }
    }
}