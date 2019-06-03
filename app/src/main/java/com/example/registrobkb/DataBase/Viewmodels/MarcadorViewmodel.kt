package com.example.registrobkb.DataBase.Viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.registrobkb.DataBase.Entities.TablaMarcador
import com.example.registrobkb.DataBase.Repositories.MarcadorRepositorie
import com.example.registrobkb.DataBase.RoomDB

class MarcadorViewmodel(private val app: Application) : AndroidViewModel(app) {

    private val repositorio: MarcadorRepositorie

    init {
        val marDao = RoomDB.getInstance(app).marcadorDao()
        repositorio = MarcadorRepositorie(marDao)
    }

    private suspend fun insert(marcador: TablaMarcador) = repositorio.insert(marcador)

    fun getAll():LiveData<ArrayList<TablaMarcador>>{
        return repositorio.getAll()
    }

}