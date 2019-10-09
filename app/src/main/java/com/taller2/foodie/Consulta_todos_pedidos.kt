package com.taller2.foodie

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class Consulta_todos_pedidos : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.consultas_pedidos)


        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver2)
        val tv_todos_pedidos = findViewById(R.id.tvTodosPedidos) as TextView


        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,Menu_Delivery::class.java)
            startActivity(intent)

        }




        val queue = Volley.newRequestQueue( this )
       val url = "http://192.168.56.1:8000/api/user"
        //  val url="https://polar-stream-82449.herokuapp.com/api/user"

        val jsonObjectRequest = JsonObjectRequest(url, null,

            Response.Listener { response ->

                tv_todos_pedidos.setText( response.toString() )

            },
            Response.ErrorListener { error ->
                Log.e("",error.message)
                Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
            }
        )

        queue.add( jsonObjectRequest )

        Toast.makeText(this, "Consultar All.", Toast.LENGTH_LONG).show()


    }
}
