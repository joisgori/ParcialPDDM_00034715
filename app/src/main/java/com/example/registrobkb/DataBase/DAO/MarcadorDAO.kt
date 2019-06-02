package com.example.registrobkb.DataBase.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.registrobkb.DataBase.Entities.TablaMarcador

@Dao
interface MarcadorDAO {

    @Query("SELECT * FROM marcador")
    fun getAllMarcadores():LiveData<ArrayList<TablaMarcador>>

    //Inserto algo del TablaMarcador
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(lisMarcador: TablaMarcador)
}