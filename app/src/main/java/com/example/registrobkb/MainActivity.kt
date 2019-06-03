package com.example.registrobkb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Doy funcionalidad de listener a mi text
    val tvBtn1 = findViewById(R.id.tv_nuevopartido) as TextView
    val tvBtn2 = findViewById<TextView>(R.id.tv_partidosguardados)
    val dfs = findViewById<Button>(R.id.id_butttooon)



}
