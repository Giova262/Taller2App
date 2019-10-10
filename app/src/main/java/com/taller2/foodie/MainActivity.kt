package com.taller2.foodie

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso
import java.util.*
import android.content.Context


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Obtener Elementos*/
        val boton_login = findViewById<Button>(R.id.btn_login)
        val boton_register = findViewById<Button>(R.id.btn_register)



        boton_login?.setOnClickListener {

            val intent: Intent = Intent(this,Login::class.java)
            startActivity(intent)

        }
        boton_register?.setOnClickListener {

            val intent: Intent = Intent(this,Perfil::class.java)
            startActivity(intent)

        }



    }
}
