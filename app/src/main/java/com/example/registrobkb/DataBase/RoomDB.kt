package com.example.registrobkb.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.registrobkb.DataBase.DAO.MarcadorDAO
import com.example.registrobkb.DataBase.Entities.TablaMarcador

@Database(entities = [TablaMarcador::class], version = 1, exportSchema = false)
abstract class RoomDB : RoomDatabase() {

    abstract fun marcadorDao():MarcadorDAO

    companion object{
        @Volatile
        private var INSTANCE: RoomDB? = null

        fun getInstance(
            context: Context
        ): RoomDB {
            //val tempInstance = INSTANCE
            if (INSTANCE != null) {
                return INSTANCE!!
            } else {
                synchronized(this) {
                    INSTANCE = Room
                        .databaseBuilder(context, RoomDB::class.java, "Juegos_GuardadosDB")
                        .build()
                    return INSTANCE!!
                }
            }
        }
    }
}