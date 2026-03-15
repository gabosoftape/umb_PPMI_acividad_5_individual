package com.dumarpabon.restaurant

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Pantalla 1: Presentación de la aplicación "FoodExpress"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vincular el botón del XML
        val btnRealizarRegistro = findViewById<Button>(R.id.btnRealizarRegistro)

        // Configurar el evento click para ir a la Pantalla 2
        btnRealizarRegistro.setOnClickListener {
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }
    }
}