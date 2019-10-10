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

class Login : AppCompatActivity() {
    lateinit var providers : List<AuthUI.IdpConfig>
    val MY_REQUEST_CODE: Int = 7117 // cualquier numero
    val es_usuario =true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // variable para harcoedear el elegir menu usaurio o
        // menu usuario o delivery



        //init
        providers= Arrays.asList<AuthUI.IdpConfig>(
            AuthUI.IdpConfig.EmailBuilder().build(),
            AuthUI.IdpConfig.FacebookBuilder().build(),
            AuthUI.IdpConfig.GoogleBuilder().build(),
            AuthUI.IdpConfig.PhoneBuilder().build()

        )
        showSignInOptions()
        //eventos
        /*
        btn_sign_out.setOnClickListener {
            AuthUI.getInstance().signOut(this@MainActivity)
                .addOnCompleteListener {
                    btn_sign_out.isEnabled=false
                    showSignInOptions()
                }
                .addOnFailureListener {
                    e->Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_SHORT).show()
                }

        }

*/

    }

    private fun showSignInOptions() {



        startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder()
            .setAvailableProviders(providers)
            // .setTheme(R.style.MyTheme)
            .setTheme(R.style.CustomTheme)
            .setLogo(R.drawable.foodielogo)
            .build(), MY_REQUEST_CODE)
    }

    private fun mostrar_menu(){
        if (es_usuario) {
            val intent: Intent = Intent(this, Menu_Usuario::class.java)
            startActivity(intent)
        }else{
            val intent: Intent = Intent(this, Menu_Delivery::class.java)
            startActivity(intent)
        }


    }
    private fun guardar_datos_perfil(nombre: String?, mail: String?, photoUrl: Uri?, num_cel: String?){




        val sharedPreference =  getSharedPreferences("Datos_perfil", Context.MODE_PRIVATE)

        val editor = sharedPreference.edit()
        editor.putString("name",nombre)
        editor.putString("email",mail)
        editor.putString("photo_url",photoUrl.toString())
        editor.putString("cel_number",num_cel)
        editor.commit()

    }
    private fun mostrar_formulario_registro(nombre: String?, mail: String?, photoUrl: Uri?, num_cel: String?) {
        setContentView(R.layout.perfil)
        var etNombre: EditText
        var etMail: EditText
        var ivfoto: ImageView
        var etNumTel: EditText
        var boton_aceptar: Button

        etNombre = findViewById(R.id.edNombre) as EditText
        etMail = findViewById(R.id.edMail) as EditText
        ivfoto = findViewById(R.id.ivFoto) as ImageView
        etNumTel = findViewById(R.id.edTelefono) as EditText


        etNombre.setText(nombre)
        etMail.setText(mail)
        etNumTel.setText(num_cel)
        Picasso.get().load( photoUrl).into(ivfoto)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // val profilePic = findViewById<ImageView>(R.id.imageView2)
        if (requestCode==MY_REQUEST_CODE)
        {
            val response=IdpResponse.fromResultIntent(data)
            if (resultCode==Activity.RESULT_OK)
            {
                val user=FirebaseAuth.getInstance().currentUser //get curren t user
                Toast.makeText(this, "" +user!!.displayName,Toast.LENGTH_SHORT).show()




                //btn_sign_out.isEnabled=true
                //  mostrar_formulario_registro(user!!.displayName, user!!.email, user!!.photoUrl,user!!.phoneNumber)
                guardar_datos_perfil(user!!.displayName, user!!.email, user!!.photoUrl,user!!.phoneNumber)

                mostrar_menu()
            }
            else
            {
                Toast.makeText(this,"" + response!!.error!!.message, Toast.LENGTH_SHORT).show()
            }
        }

    }
}
