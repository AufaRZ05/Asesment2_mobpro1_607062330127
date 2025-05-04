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

    suspend fun getProduk(id: Long): KelolaProduk? {
        return dao.getProdukById(id)
    }

    fun update(id: Long, namaMerek: String, harga: Int, stok: Int, kategori: String) {
        val kelolaProduk = KelolaProduk(
            id = id,
            namaMerek = namaMerek,
            harga = harga,
            stok = stok,
            kategori = kategori
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.update(kelolaProduk)
        }
    }
}