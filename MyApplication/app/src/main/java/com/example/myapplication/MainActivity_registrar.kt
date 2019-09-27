package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class MainActivity_registrar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registrar)

        /*Obetener Elementos*/
        val editTex_nombre = findViewById<EditText>( R.id.editText_nombreRegistrar )
        val editTex_mail = findViewById<EditText>( R.id.editText_mailRegistrar )
        val editTex_pass = findViewById<EditText>( R.id.editText_passRegistrar )
        val boton_resp = findViewById<Button>(R.id.button_enviarRegistro)
        val textView_resp = findViewById<TextView>(R.id.textView_respuestaRegistrar)

        /*Enviar datos*/
        boton_resp?.setOnClickListener {

            val nombreTemp =editTex_nombre.text
            val mailTemp =editTex_mail.text
            val passTemp =editTex_pass.text


            val jsonObject = JSONObject()
            jsonObject.put("nombre",nombreTemp)
            jsonObject.put("mail",mailTemp)
            jsonObject.put("pass",passTemp)

            val queue = Volley.newRequestQueue( this )
            val url = "http://192.168.0.4:3000/api/user/register"



            val jsonObjectRequest = JsonObjectRequest(url, jsonObject,

                Response.Listener { response ->

                    /* Parseo respuesta json*/
                    var strResp = response.toString()
                    val jsonob: JSONObject = JSONObject(strResp)

                    val mensaje = jsonob.getString("message")

                    textView_resp.setText( "Status: $mensaje " )


                },
                Response.ErrorListener { error ->

                    error.printStackTrace()
                }
            )

            queue.add( jsonObjectRequest )


        }


    }
}
