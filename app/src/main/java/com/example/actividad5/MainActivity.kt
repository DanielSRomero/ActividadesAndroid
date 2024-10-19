package com.example.actividad5

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


private const val TAG = "---ACTIVITY---"
private var estado : String = ""
private var contador : Int = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        estado = "ONCREATE"
        contador++
        Log.d(TAG, "$estado $contador")
    }
    override fun onStart() {
        super.onStart()
        estado = "ONSTART"
        contador++
        Log.d(TAG, "$estado $contador")

        val objetoClaseA = ClaseA()
        objetoClaseA.atributo1 = "Hola a todos"
        objetoClaseA.atributo2 = 123
        objetoClaseA.isAtributo3 = true
        Toast.makeText(this, objetoClaseA.toString(), Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        estado = "ONRESUME"
        contador++
        Log.d(TAG, "$estado $contador")
    }
    override fun onPause() {
        super.onPause()
        estado = "ONPAUSE"
        contador++
        Log.d(TAG, "$estado $contador")
    }
    override fun onRestart() {
        super.onRestart()
        estado = "ONRESTART"
        contador++
        Log.d(TAG, "$estado $contador")
    }
    override fun onStop() {
        super.onStop()
        estado = "ONSTOP"
        contador++
        Log.d(TAG, "$estado $contador")
    }
    override fun onDestroy() {
        super.onDestroy()
        estado = "ONDESTROY"
        contador++
        Log.d(TAG, "$estado $contador")
    }
}