package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main12Activity_datosDePedido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12_datos_de_pedido)

        /*Obtener Elementos*/
        val boton_tomarPedido = findViewById<Button>(R.id.button_tomarElPedido)

        /*Escena tomar pedido*/
        boton_tomarPedido?.setOnClickListener {

            val intent: Intent = Intent(this,Main10Activity_deliveryView::class.java)
            startActivity(intent)

        }
    }
}
