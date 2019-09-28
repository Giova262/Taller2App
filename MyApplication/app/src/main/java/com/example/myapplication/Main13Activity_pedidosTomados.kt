package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main13Activity_pedidosTomados : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13_pedidos_tomados)

        /*Obtener Elementos*/
        val boton_chat = findViewById<Button>(R.id.button_chatdelivery)
        val boton_entregado = findViewById<Button>(R.id.button_entregado)

        /*Escena del chat*/
        boton_chat?.setOnClickListener {

            val intent: Intent = Intent(this,Main8Activity_chat::class.java)
            startActivity(intent)

        }

        /*Escena delivery view*/
        boton_entregado?.setOnClickListener {

            val intent: Intent = Intent(this,Main10Activity_deliveryView::class.java)
            startActivity(intent)

        }
    }
}
