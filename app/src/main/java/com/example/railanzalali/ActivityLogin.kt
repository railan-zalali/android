package com.example.railanzalali

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        untuk memanggil view atau mengentukan layout mana yang akan di panggil
//        setContentView(R.layout.nama file)
        setContentView(R.layout.activity_login)
        var username = findViewById<EditText>(R.id.edUsername)
        var password = findViewById<EditText>(R.id.edPassword)

        var btnLogin = findViewById<Button>(R.id.btLogin);
        btnLogin.setOnClickListener(){
            Log.e("Pesan", "Mhehe");
            Toast.makeText(this, "Button Berhasil di click", Toast.LENGTH_LONG).show()

            var activityMain = Intent(this, MainActivity::class.java)
//            membuat parsing atau pelemparan data
            activityMain.putExtra("duser", username.text.toString())
            activityMain.putExtra("dpass", password.text.toString())

            startActivity(activityMain)
        }


    }
}