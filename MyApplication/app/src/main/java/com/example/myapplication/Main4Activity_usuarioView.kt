package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main4Activity_usuarioView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4_usuario_view)

        /*Obtener Elementos*/
        val boton_hacerPedido = findViewById<Button>(R.id.button_hacerPedido)
        val boton_misPedidos = findViewById<Button>(R.id.button_misPedidos)

        /*Escena consultar ALL*/
        boton_hacerPedido?.setOnClickListener {

            val intent: Intent = Intent(this,Main5Activity_listaProductos::class.java)
            startActivity(intent)

        }

        /*Escena mis pedidos*/
        boton_misPedidos?.setOnClickListener {

            val intent: Intent = Intent(this,Main7Activity_misPedidos::class.java)
            startActivity(intent)

        }
    }


}
