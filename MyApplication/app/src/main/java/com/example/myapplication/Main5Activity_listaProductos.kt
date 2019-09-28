package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main5Activity_listaProductos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5_lista_productos)

        /*Obtener Elementos*/
        val boton_hacerPedido = findViewById<Button>(R.id.button_Pedir_1)

        /*Escena consultar ALL*/
        boton_hacerPedido?.setOnClickListener {

            val intent: Intent = Intent(this,Main6Activity_producto::class.java)
            startActivity(intent)

        }

    }
}
