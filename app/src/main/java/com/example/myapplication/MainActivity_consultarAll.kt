package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class MainActivity_consultarAll : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_consultar_all)

        val respuestaText = findViewById<TextView>(R.id.textView_respuesta2)


        val queue = Volley.newRequestQueue( this )
        val url = "http://192.168.0.4:3000/api/user"


        val jsonObjectRequest = JsonObjectRequest(url, null,

            Response.Listener { response ->

                respuestaText.setText( response.toString() )

            },
            Response.ErrorListener { error ->

                error.printStackTrace()
            }
        )

        queue.add( jsonObjectRequest )

        Toast.makeText(this@MainActivity_consultarAll, "Consultar All.", Toast.LENGTH_LONG).show()
    }
}
