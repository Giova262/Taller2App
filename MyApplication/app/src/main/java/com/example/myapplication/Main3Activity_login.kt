package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.CheckBox

class Main3Activity_login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3_login)

        /*Obtener Elementos*/
        val boton_entrar = findViewById<Button>(R.id.button_entrar)
        val checkbox_cliente = findViewById<CheckBox>(R.id.checkBox_cliente)
        val checkbox_delivery = findViewById<CheckBox>(R.id.checkBox_delivery)

        /*Escena entrar*/
        boton_entrar?.setOnClickListener {


            if ( checkbox_cliente.isChecked && !checkbox_delivery.isChecked ){

                val intent:Intent = Intent(this,Main4Activity_usuarioView::class.java)
                startActivity(intent)
            }

            if ( !checkbox_cliente.isChecked && checkbox_delivery.isChecked ){

                val intent:Intent = Intent(this,Main10Activity_deliveryView::class.java)
                startActivity(intent)
            }


         }
    }
}
