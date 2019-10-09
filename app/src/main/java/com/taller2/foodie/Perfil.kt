package com.taller2.foodie

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class Perfil : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil)
        mostrar_datos_perfil()


        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver3)
        val boton_aceptar = findViewById<Button>(R.id.btn_aceptar)



        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this,Menu_Delivery::class.java)
            startActivity(intent)

        }
        boton_aceptar?.setOnClickListener {

           // falta

        }


    }
    private fun mostrar_datos_perfil() {


        val sharedPref: SharedPreferences = this.getSharedPreferences("Datos_perfil",Context.MODE_PRIVATE)
        var etNombre: EditText
        var etMail: EditText
        var ivfoto: ImageView
        var etNumTel: EditText


        etNombre = findViewById(R.id.edNombre) as EditText
        etMail = findViewById(R.id.edMail) as EditText
        ivfoto = findViewById(R.id.ivFoto) as ImageView
        etNumTel = findViewById(R.id.edTelefono) as EditText

        val myString = sharedPref.getString("name", "")
        etNombre.setText(myString)
        etMail.setText(sharedPref.getString("email", ""))
        etNumTel.setText(sharedPref.getString("cel_number", ""))
        val photoUrl_string=sharedPref.getString("photo_url", "")
        val imageUri = Uri.parse(photoUrl_string)
        Picasso.get().load( imageUri).into(ivfoto)

    }
}