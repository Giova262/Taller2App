package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class MainActivity_consultarPorID : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_consultar_por_id)

        /*Obetener Elementos*/
        val editTex_id = findViewById( R.id.editText_id ) as EditText
        val botonResp = findViewById<Button>(R.id.button_enviar)
        val textView_id = findViewById<TextView>(R.id.textView_respuestaID)
        val textView_nombre = findViewById<TextView>(R.id.textView_respuestaNombre)
        val textView_mail = findViewById<TextView>(R.id.textView_respuestaMail)
        val textView_pass = findViewById<TextView>(R.id.textView_respuestaPass)

        botonResp?.setOnClickListener {

            /*Query*/
            val c =editTex_id.text

            val queue = Volley.newRequestQueue( this )
            val url = "http://192.168.0.4:3000/api/user/$c"

            val jsonObjectRequest = JsonObjectRequest(url, null,

                Response.Listener { response ->

                    /* Parseo respuesta json*/
                    var strResp = response.toString()
                    val jsonob: JSONObject = JSONObject(strResp)

                    val id = jsonob.getInt("id")
                    val nombre = jsonob.getString("nombre")
                    val mail = jsonob.getString("mail")
                    val pass = jsonob.getString("pass")

                    textView_id.setText( "Id: $id " )
                    textView_nombre.setText( "Nombre_ $nombre " )
                    textView_mail.setText( "Mail: $mail " )
                    textView_pass.setText( "Password: $pass " )

                    //respuestaText.setText( "$id ,$nombre,$mail,$pass " )

                },
                Response.ErrorListener { error ->
                    println("Ocurrio un Error al recibir el mensaje del servidor")
                    error.printStackTrace()
                }
            )

            queue.add( jsonObjectRequest )

        }



    }
}
