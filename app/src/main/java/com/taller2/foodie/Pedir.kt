package com.taller2.foodie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pedir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pedir)


        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver2)



        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,Menu_Delivery::class.java)
            startActivity(intent)

        }



    }
}
