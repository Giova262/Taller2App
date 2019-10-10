package com.taller2.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Chat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)


        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver)



        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,Menu_Usuario::class.java)
            startActivity(intent)

        }
    }

}
