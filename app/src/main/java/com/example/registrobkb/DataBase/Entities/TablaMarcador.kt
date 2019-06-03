package com.example.registrobkb.DataBase.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "marcador")
data class TablaMarcador (
    @PrimaryKey
    @ColumnInfo(name = "equipoA")
    var equipoA: String,

    @ColumnInfo(name = "equipoB")
    var equipoB: String,

    @ColumnInfo(name = "puntajeA")
    var puntajeA: String,

    @ColumnInfo(name = "puntajeB")
    var puntajeB: String

    /*
    * No olvidar agregar la fecha y la hora :V
    * */
)