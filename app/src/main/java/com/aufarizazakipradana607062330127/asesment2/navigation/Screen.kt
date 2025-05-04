package com.aufarizazakipradana607062330127.asesment2.navigation

import com.aufarizazakipradana607062330127.asesment2.ui.screen.KEY_ID_KELOLAPRODUK

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_KELOLAPRODUK}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}