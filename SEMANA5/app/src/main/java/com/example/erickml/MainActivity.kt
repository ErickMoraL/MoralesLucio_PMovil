package com.example.erickml

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccept: Button
    private lateinit var nombre: EditText
    private lateinit var apellido: EditText
    private lateinit var telefono: EditText
    private lateinit var email: EditText
    private lateinit var palomita: ImageView
    private lateinit var tache: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nombre = findViewById(R.id.nombre)
        apellido = findViewById(R.id.apellido)
        telefono = findViewById(R.id.telefono)
        email = findViewById(R.id.email)
        btnAccept = findViewById(R.id.btnAccept)
        palomita = findViewById(R.id.palomita)
        tache = findViewById(R.id.tache)


        palomita.visibility = View.INVISIBLE
        tache.visibility = View.INVISIBLE


        btnAccept.setOnClickListener {
            val nombreText = nombre.text.toString()
            val apellidoText = apellido.text.toString()
            val telefonoText = telefono.text.toString()
            val emailText = email.text.toString()

            if (nombreText.isNotEmpty() && apellidoText.isNotEmpty() && telefonoText.isNotEmpty() && emailText.isNotEmpty()) {

                palomita.visibility = View.VISIBLE
                tache.visibility = View.INVISIBLE
            } else {

                palomita.visibility = View.INVISIBLE
                tache.visibility = View.VISIBLE
            }
        }
    }
}
