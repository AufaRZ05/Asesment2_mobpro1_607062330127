package com.aufarizazakipradana607062330127.asesment2.ui.screen

import androidx.lifecycle.ViewModel
import com.aufarizazakipradana607062330127.asesment2.model.KelolaProduk

class MainViewModel : ViewModel(){

    val data = listOf(
        KelolaProduk(
            1,
            "Hannochs 10W",
            15000,
            5,
            "Lampu"
        ),
        KelolaProduk(
            2,
            "Philips 20W",
            25000,
            3,
            "Lampu"
        ),
        KelolaProduk(
            3,
            "Luminous 50W",
            35000,
            10,
            "Lampu"
        ),
        KelolaProduk(
            4,
            "Panasonic 30W",
            20000,
            7,
            "Lampu"
        ),
        KelolaProduk(
            5,
            "Midea Kipas Angin",
            100000,
            12,
            "Kipas angin"
        ),
        KelolaProduk(
            6,
            "Sharp Kipas Angin",
            125000,
            8,
            "Kipas angin"
        ),
        KelolaProduk(
            7,
            "LG Kipas Angin",
            110000,
            4,
            "Kipas angin"
        ),
        KelolaProduk(
            8,
            "JBL Bluetooth Speaker",
            500000,
            3,
            "Speaker"
        ),
        KelolaProduk(
            9,
            "Sony Speaker",
            450000,
            6,
            "Speaker"
        ),
        KelolaProduk(
            10,
            "Harman Kardon Speaker",
            800000,
            2,
            "Speaker"
        )
    )

    fun getProduk(id: Long): KelolaProduk? {
        return data.find { it.id == id}
    }
}