package com.taller2.foodie
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class Menu_Delivery : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_delivery)


        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver)
        val boton_demanda_pedidos = findViewById<Button>(R.id.btn_demanda_pedidos)
        val boton_perfil = findViewById<Button>(R.id.btn_perfil)
        val boton_pedidos_pendientes = findViewById<Button>(R.id.btn_pedidos_pendientes)
        val boton_hisoricos= findViewById<Button>(R.id.btn_historicos)
        val boton_saldo= findViewById<Button>(R.id.btn_saldo)


        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        boton_saldo?.setOnClickListener {

            val intent: Intent = Intent(this,Saldo_delivery::class.java)
            startActivity(intent)

        }
        boton_hisoricos?.setOnClickListener {

            val intent: Intent = Intent(this,Historicos_delivery::class.java)
            startActivity(intent)

        }


        boton_perfil?.setOnClickListener {

            val intent: Intent = Intent(this,Perfil::class.java)
            startActivity(intent)

        }
        boton_pedidos_pendientes?.setOnClickListener {

            val intent: Intent = Intent(this,Pedido_activo_delivery::class.java)
            startActivity(intent)

        }
        boton_demanda_pedidos?.setOnClickListener {

            val intent: Intent = Intent(this,Demanda_de_pedidos::class.java)
            startActivity(intent)

        }


    }
}