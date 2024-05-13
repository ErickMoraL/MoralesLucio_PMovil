package com.example.semana6


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var boton: Button
    private lateinit var encabezado: TextView
    private lateinit var lenguajeSpinner: Spinner

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lenguajeSpinner = findViewById(R.id.lenguaje_spinner)
        encabezado = findViewById(R.id.encabezado)
        boton = findViewById(R.id.boton)


        var seleccionado = 0

        val languajes = resources.getStringArray(R.array.lenguajes)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languajes)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        lenguajeSpinner.adapter = adapter

        lenguajeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                seleccionado = position

                when (position) {
                    0 -> {
                        boton.text = getString(R.string.boton_esp)
                        encabezado.text = getString(R.string.encabezado_esp)
                    }
                    1 -> {
                        boton.text = getString(R.string.boton_ing)
                        encabezado.text = getString(R.string.encabezado_ing)
                    }
                    2 -> {
                        boton.text = getString(R.string.boton_chi)
                        encabezado.text = getString(R.string.encabezado_chi)
                    }
                    3 -> {
                        boton.text = getString(R.string.boton_por)
                        encabezado.text = getString(R.string.encabezado_por)
                    }
                    4 -> {
                        boton.text = getString(R.string.boton_fra)
                        encabezado.text = getString(R.string.encabezado_fra)
                    }
                    5 -> {
                        boton.text = getString(R.string.boton_ita)
                        encabezado.text = getString(R.string.encabezado_ita)
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        boton.setOnClickListener{
            when(seleccionado){
                0-> Toast.makeText(this,getString(R.string.bienvenida_esp),Toast.LENGTH_SHORT).show()
                1-> Toast.makeText(this,getString(R.string.bienvenida_ing),Toast.LENGTH_SHORT).show()
                2-> Toast.makeText(this,getString(R.string.bienvenida_chi),Toast.LENGTH_SHORT).show()
                3-> Toast.makeText(this,getString(R.string.bienvenida_por),Toast.LENGTH_SHORT).show()
                4-> Toast.makeText(this,getString(R.string.bienvenida_fra),Toast.LENGTH_SHORT).show()
                5-> Toast.makeText(this,getString(R.string.bienvenida_ita),Toast.LENGTH_SHORT).show()
            }
        }
    }

}