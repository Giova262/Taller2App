package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.toolbox.Volley

import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Obtener elementos */
        val boton_consultarId = findViewById<Button>(R.id.button_consultarID)
        val boton_consultarAll = findViewById<Button>(R.id.button_consultarAll)
        val boton_registrar = findViewById<Button>(R.id.button_registrar)



        /*Escena consultar ALL*/
        boton_consultarAll?.setOnClickListener {

            val intent:Intent = Intent(this,MainActivity_consultarAll::class.java)
            startActivity(intent)

        }

        /*Escena Consulta por ID */
        boton_consultarId?.setOnClickListener {

            val intent:Intent = Intent(this,MainActivity_consultarPorID::class.java)
            startActivity(intent)

        }

        /*Escena Registrar*/
        boton_registrar?.setOnClickListener {

            val intent:Intent = Intent(this,MainActivity_registrar::class.java)
            startActivity(intent)

        }

    }
}
