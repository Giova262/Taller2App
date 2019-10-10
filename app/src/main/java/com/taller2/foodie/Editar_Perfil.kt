package com.taller2.foodie

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.squareup.picasso.Picasso

class Editar_Perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar__perfil)
        val etNombre: EditText
        var etMail: EditText
        var ivfoto: ImageView
        var etNumTel: EditText
        val check_delivery = findViewById<CheckBox>(R.id.checkBox_delivery)
        val radio_button_premium = findViewById<RadioButton>(R.id.radioButtonPremium)
        val radio_button_flat = findViewById<RadioButton>(R.id.radioButtonFlat)



        etNombre = findViewById(R.id.edNombre) as EditText
        val etApellido = findViewById(R.id.edApellido) as EditText
        etMail = findViewById(R.id.edMail) as EditText
        ivfoto = findViewById(R.id.ivFoto) as ImageView
        etNumTel = findViewById(R.id.edTelefono) as EditText


        val sharedPref: SharedPreferences =
            this.getSharedPreferences("Datos_perfil", Context.MODE_PRIVATE)


        val myString = sharedPref.getString("name", "")
        etNombre.setText(myString)
        etMail.setText(sharedPref.getString("email", ""))
        etNumTel.setText(sharedPref.getString("cel_number", ""))
        val photoUrl_string = sharedPref.getString("photo_url", "")
        val imageUri = Uri.parse(photoUrl_string)
        Picasso.get().load(imageUri).into(ivfoto)


        /*Obtener Elementos*/
        val boton_volver = findViewById<Button>(R.id.btn_volver)
        val boton_aceptar = findViewById<Button>(R.id.btn_aceptar)
        //radio_button_prem
        //editor.putBoolean("delivery", es_delibery)
        //editor.putBoolean("es_premium", es_premium)


        boton_volver?.setOnClickListener {

            val intent: Intent = Intent(this, Menu_Usuario::class.java)
            startActivity(intent)

        }
        boton_aceptar?.setOnClickListener {

            if ((etNombre.getText().toString().length == 0) || (etMail.getText().toString().length == 0)
                || (etNumTel.getText().toString().length == 0) || (etApellido.getText().toString().length == 0)
            ) {

                Toast.makeText(this, "Por favor complete todos los campos", Toast.LENGTH_SHORT)
                    .show()

            } else {

                guardar_datos_perfil(etNombre.getText().toString(), etMail.getText().toString(),
                    imageUri, etNumTel.getText().toString(),check_delivery.isChecked
                    , radio_button_premium.isChecked)

                if (check_delivery.isChecked) {
                    val intent: Intent = Intent(this, Menu_Delivery::class.java)
                    startActivity(intent)

                } else {
                    val intent: Intent = Intent(this, Menu_Delivery::class.java)
                    startActivity(intent)


                }

            }


        }


    }

    private fun guardar_datos_perfil(
        nombre: String, mail: String, photoUrl: Uri, num_cel: String, es_delibery: Boolean
        , es_premium: Boolean) {


        val sharedPreference = getSharedPreferences("Datos_perfil", Context.MODE_PRIVATE)

        val editor = sharedPreference.edit()
        editor.putString("name", nombre)
        editor.putString("email", mail)
        editor.putString("photo_url", photoUrl.toString())
        editor.putString("cel_number", num_cel)
        editor.putBoolean("delivery", es_delibery)
        editor.putBoolean("es_premium", es_premium)
        editor.commit()

    }
}
