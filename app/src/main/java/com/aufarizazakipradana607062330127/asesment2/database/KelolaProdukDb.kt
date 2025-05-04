package com.aufarizazakipradana607062330127.asesment2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aufarizazakipradana607062330127.asesment2.model.KelolaProduk

@Database(entities = [KelolaProduk::class], version = 1, exportSchema = false)
abstract class KelolaProdukDb : RoomDatabase() {

    abstract val dao: KelolaProdukDao

    companion object {

        @Volatile
        private var INSTANCE: KelolaProdukDb? = null

        fun getInstance(context: Context): KelolaProdukDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        KelolaProdukDb::class.java,
                        "kelolaProduk.db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}