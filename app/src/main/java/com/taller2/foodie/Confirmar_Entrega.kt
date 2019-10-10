package com.taller2.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Confirmar_Entrega : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar__entrega)

        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver)
        val boton_confirmar_entrega = findViewById<Button>(R.id.btn_confirmar_entrega)
        val text_view_entrega= findViewById<TextView>(R.id.tv_pedido)



        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,Menu_Usuario::class.java)
            startActivity(intent)

        }

        boton_confirmar_entrega?.setOnClickListener {

            val intent: Intent = Intent(this,Menu_Usuario::class.java)
            startActivity(intent)
            text_view_entrega.setText("Pedido entregado!!!")


        }
    }
}
