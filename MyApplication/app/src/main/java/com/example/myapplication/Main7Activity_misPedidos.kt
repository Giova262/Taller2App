package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main7Activity_misPedidos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7_mis_pedidos)

        /*Obtener Elementos*/
        val boton_chat = findViewById<Button>(R.id.button_chat)
        val boton_mapa = findViewById<Button>(R.id.button_mapa)
        val boton_recibido = findViewById<Button>(R.id.button_recibido)

        /*Escena chat*/
        boton_chat?.setOnClickListener {

            val intent: Intent = Intent(this,Main8Activity_chat::class.java)
            startActivity(intent)

        }

        /*Escena mapa*/
        boton_mapa?.setOnClickListener {

            val intent: Intent = Intent(this,Main9Activity_mapa::class.java)
            startActivity(intent)

        }

        /*Escena recibido*/
        boton_recibido?.setOnClickListener {

            val intent: Intent = Intent(this,Main4Activity_usuarioView::class.java)
            startActivity(intent)

        }
    }
}
