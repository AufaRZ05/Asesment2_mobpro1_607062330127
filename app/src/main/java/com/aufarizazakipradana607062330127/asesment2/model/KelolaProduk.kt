package com.aufarizazakipradana607062330127.asesment2.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kelolaProduk")
data class KelolaProduk(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val namaMerek: String,
    val harga: Int,
    val stok: Int,
    val kategori: String
)
