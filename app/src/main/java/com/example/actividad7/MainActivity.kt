package com.example.actividad7

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() { //Eliminado la implementacion de la interfaz ActionListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonSaludo : Button = findViewById(R.id.saludar)
        val botonNoSaludo : Button = findViewById(R.id.noSaludar)
        val botonSaludoClase : Button = findViewById(R.id.saludarClase)

        botonSaludo.setOnClickListener {
            Toast.makeText(this, "Hola a todos", Toast.LENGTH_SHORT).show()
        }
        botonNoSaludo.setOnClickListener {
            Toast.makeText(this, "No saludo a NADIE", Toast.LENGTH_SHORT).show()
        }
        botonSaludoClase.setOnClickListener {
            Toast.makeText(this, "Como estan los máquinas?", Toast.LENGTH_SHORT).show()
        }
        //PARTE DE LA SEGUNDA MANERA DE HACERLO:
        //botonSaludo.setOnClickListener(this)
        //botonNoSaludo.setOnClickListener(this)
        //botonSaludoClase.setOnClickListener(this)


    }
    /* ---SEGUNDA MANERA DE HACERLO---
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.saludar -> {
                Toast.makeText(this, "Hola a todos", Toast.LENGTH_SHORT).show()
            }
            R.id.noSaludar -> {
                Toast.makeText(this, "No saludo a NADIE", Toast.LENGTH_SHORT).show()
            }
            R.id.saludarClase -> {
                Toast.makeText(this, "Como estan los máquinas?", Toast.LENGTH_SHORT).show()
            }
        }
    }*/
    /** ---PRIMERA FORMA DE HACERLO---
    fun capturarEvento(view: View) {
        when (view.id) {
            R.id.saludar -> {
                Toast.makeText(this, "Hola a todos", Toast.LENGTH_SHORT).show()
            }
            R.id.noSaludar -> {
                Toast.makeText(this, "No saludo a NADIE", Toast.LENGTH_SHORT).show()
            }
            R.id.saludarClase -> {
                Toast.makeText(this, "Como estan los máquinas?", Toast.LENGTH_SHORT).show()
            }
        }
    }*/
}