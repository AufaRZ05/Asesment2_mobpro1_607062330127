package com.aufarizazakipradana607062330127.asesment2.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.aufarizazakipradana607062330127.asesment2.model.KelolaProduk
import kotlinx.coroutines.flow.Flow

@Dao
interface KelolaProdukDao {

    @Insert
    suspend fun insert(kelolaProduk: KelolaProduk)

    @Update
    suspend fun update(kelolaProduk: KelolaProduk)

    @Query("SELECT * FROM kelolaProduk ORDER BY namaMerek ASC")
    fun getProduk(): Flow<List<KelolaProduk>>

    @Query("SELECT * FROM kelolaProduk WHERE id = :id")
    suspend fun getProdukById(id: Long): KelolaProduk?
}