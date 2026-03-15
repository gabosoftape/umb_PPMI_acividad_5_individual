package com.dumarpabon.restaurant

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {

    // Pantalla 2: Formulario de Registro
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        // Vincular componentes del XML
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val rgComida = findViewById<RadioGroup>(R.id.rgComida)
        val btnEnviar = findViewById<Button>(R.id.btnEnviarRegistro)

        btnEnviar.setOnClickListener {
            // Recoger los datos ingresados
            val nombre = etNombre.text.toString()
            val email = etEmail.text.toString()
            val telefono = etTelefono.text.toString()

            // Obtener el RadioButton seleccionado
            val selectedId = rgComida.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedId)
            val tipoComida = radioButton.text.toString()

            // VALIDACIÓN: Mostrar Toast si algún campo está vacío
            if (nombre.isEmpty() || email.isEmpty() || telefono.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Crear Intent para enviar datos a la Pantalla 3 (Confirmación)
            val intent = Intent(this, ConfirmacionActivity::class.java).apply {
                putExtra("EXTRA_NOMBRE", nombre)
                putExtra("EXTRA_EMAIL", email)
                putExtra("EXTRA_TELEFONO", telefono)
                putExtra("EXTRA_COMIDA", tipoComida)
            }
            startActivity(intent)
        }
    }
}
