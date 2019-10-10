package com.taller2.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu_Usuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu__usuario)

        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver)
        val boton_pedir = findViewById<Button>(R.id.btn_pedir)
        val boton_editar_direccion = findViewById<Button>(R.id.btn_direccion)
        val boton_perfil = findViewById<Button>(R.id.btn_perfil)
        val boton_pedidos_pendientes = findViewById<Button>(R.id.btn_pedidos_pendientes)
        val boton_hisoricos= findViewById<Button>(R.id.btn_historicos)


        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        boton_pedir?.setOnClickListener {

            val intent: Intent = Intent(this,Pedir::class.java)
            startActivity(intent)

        }
        boton_hisoricos?.setOnClickListener {

            val intent: Intent = Intent(this,Historicos::class.java)
            startActivity(intent)

        }


        boton_perfil?.setOnClickListener {

            val intent: Intent = Intent(this,Editar_Perfil::class.java)
            startActivity(intent)

        }
        boton_pedidos_pendientes?.setOnClickListener {

            val intent: Intent = Intent(this,Pedidos_Pendientes::class.java)
            startActivity(intent)

        }
        boton_editar_direccion?.setOnClickListener {

            val intent: Intent = Intent(this,Ingresar_Direccion::class.java)
            startActivity(intent)

        }
    }
}
