package com.example.practica1

import JflexyCup.Ejecutar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("-----------")
        setContentView(R.layout.activity_main)
        println("Entra")
        Ejecutar()

    }
}