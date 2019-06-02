package com.example.registrobkb.DataBase.Repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.registrobkb.DataBase.DAO.MarcadorDAO
import com.example.registrobkb.DataBase.Entities.TablaMarcador

class MarcadorRepositorie (private val marcadorDAO: MarcadorDAO){

    @WorkerThread
    suspend fun insert(lisMarcador: TablaMarcador){
        marcadorDAO.insert(lisMarcador)
    }

    fun getAll():LiveData<ArrayList<TablaMarcador>>{
        return marcadorDAO.getAllMarcadores()
    }
}