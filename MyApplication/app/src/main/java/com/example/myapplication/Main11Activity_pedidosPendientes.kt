package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main11Activity_pedidosPendientes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11_pedidos_pendientes)

        /*Obtener Elementos*/
        val boton_verPedido = findViewById<Button>(R.id.button_verPedido)

        /*Escena ver pedido*/
        boton_verPedido?.setOnClickListener {

            val intent: Intent = Intent(this,Main12Activity_datosDePedido::class.java)
            startActivity(intent)

        }
    }
}
