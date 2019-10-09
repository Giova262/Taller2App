package com.taller2.foodie
import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class Menu_Delivery : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_consultas)


        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver)
        val boton_consulta_pedidos = findViewById<Button>(R.id.btn_consulta_pedidos)
        val boton_perfil = findViewById<Button>(R.id.btn_perfil)
        val boton_pedir = findViewById<Button>(R.id.btn_pedir)


        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


        boton_perfil?.setOnClickListener {

            val intent: Intent = Intent(this,Perfil::class.java)
            startActivity(intent)

        }
        boton_pedir?.setOnClickListener {

            val intent: Intent = Intent(this,Pedir::class.java)
            startActivity(intent)

        }
        boton_consulta_pedidos?.setOnClickListener {

            val intent: Intent = Intent(this,Consulta_todos_pedidos::class.java)
            startActivity(intent)

        }


    }
}