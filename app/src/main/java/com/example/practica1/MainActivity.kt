package com.example.practica1

import JflexyCup.Ejecutar
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Request code for selecting a PDF document.
    val PICK_PDF_FILE = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("-----------")
        setContentView(R.layout.activity_main)


    }


    fun openFile(pickerInitialUri: Uri) {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "application/pdf"

            // Optionally, specify a URI for the file that should appear in the
            // system file picker when it loads.
            putExtra(DocumentsContract.EXTRA_INITIAL_URI, pickerInitialUri)
        }

        startActivityForResult(intent, PICK_PDF_FILE)
    }
    @SuppressLint("ResourceType")
    fun accion(view : View){
        var texto: TextView = findViewById(R.id.CajaTexto)
        var entrada: String = texto.text.toString()
        Ejecutar(entrada)
    }
}