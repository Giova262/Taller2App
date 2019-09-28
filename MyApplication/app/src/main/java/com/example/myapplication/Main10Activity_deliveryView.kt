package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main10Activity_deliveryView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10_delivery_view)

        /*Obtener Elementos*/
        val boton_verPedidosPendientes = findViewById<Button>(R.id.button_verPedidosPendientes)
        val boton_pedidosTomados = findViewById<Button>(R.id.button_pedidosTomados)

        /*Escena ver pedidos pendientes*/
        boton_verPedidosPendientes?.setOnClickListener {

            val intent: Intent = Intent(this,Main11Activity_pedidosPendientes::class.java)
            startActivity(intent)

        }

        /*Escena pedidos tomados*/
        boton_pedidosTomados?.setOnClickListener {

            val intent: Intent = Intent(this,Main13Activity_pedidosTomados::class.java)
            startActivity(intent)

        }
    }
}
