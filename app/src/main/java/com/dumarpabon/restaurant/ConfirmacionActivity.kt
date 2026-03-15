package com.dumarpabon.restaurant

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmacionActivity : AppCompatActivity() {

    // Pantalla 3: Confirmación de datos recibidos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)

        // Vincular TextViews del XML
        val tvNombre = findViewById<TextView>(R.id.tvResumenNombre)
        val tvEmail = findViewById<TextView>(R.id.tvResumenEmail)
        val tvTelefono = findViewById<TextView>(R.id.tvResumenTelefono)
        val tvComida = findViewById<TextView>(R.id.tvResumenComida)
        val btnSalir = findViewById<Button>(R.id.btnSalir)

        // Recuperar datos enviados por el Intent
        val nombre = intent.getStringExtra("EXTRA_NOMBRE")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val telefono = intent.getStringExtra("EXTRA_TELEFONO")
        val comida = intent.getStringExtra("EXTRA_COMIDA")

        // Mostrar los datos en la pantalla
        tvNombre.text = "Nombre: $nombre"
        tvEmail.text = "Correo: $email"
        tvTelefono.text = "Teléfono: $telefono"
        tvComida.text = "Comida favorita: $comida"

        // Botón para cerrar completamente la aplicación
        btnSalir.setOnClickListener {
            finishAffinity() // Cierra todas las actividades
        }
    }
}
