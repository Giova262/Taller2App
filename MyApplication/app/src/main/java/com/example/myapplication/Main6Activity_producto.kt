package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main6Activity_producto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6_producto)

        /*Obtener Elementos*/
        val boton_confirmarPedido = findViewById<Button>(R.id.button_confirmarPedido)

        /*Escena consultar ALL*/
        boton_confirmarPedido?.setOnClickListener {

            val intent: Intent = Intent(this,Main4Activity_usuarioView::class.java)
            startActivity(intent)

        }
    }
}
