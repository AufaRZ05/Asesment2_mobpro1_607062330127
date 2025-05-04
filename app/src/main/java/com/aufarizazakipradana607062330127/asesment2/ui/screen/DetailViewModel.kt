package com.aufarizazakipradana607062330127.asesment2.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aufarizazakipradana607062330127.asesment2.database.KelolaProdukDao
import com.aufarizazakipradana607062330127.asesment2.model.KelolaProduk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: KelolaProdukDao) : ViewModel() {

    fun insert(namaMerek: String, harga: Int, stok: Int, kategori: String) {
        val kelolaProduk = KelolaProduk(
            namaMerek = namaMerek,
            harga = harga,
            stok = stok,
            kategori = kategori
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(kelolaProduk)
        }
    }

    fun getProduk(id: Long): KelolaProduk? {
        return null
    }
}