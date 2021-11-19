package com.faidur.praktikumandroidh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val noHandphoneEditText= findViewById<EditText>(R.id.noHandphoneEditText)
        val tglLahirEditText= findViewById<EditText>(R.id.tglLahirEditText)
        val jarakEditText= findViewById<EditText>(R.id.jarakEditText)

        simpanButton.setOnClickListener{
            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            val noHP = noHandphoneEditText.text.toString()
            val tglLahir = tglLahirEditText.text.toString()
            var jarak = jarakEditText.text.toString().toInt()
            jarak *= 1000

            Toast.makeText(this, "Halo $nama !\nEmail : $email\nNo HP : $noHP\nTanggal Lahir : $tglLahir\nJaraknya adalah $jarak M", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("noHP", noHP)
            intent.putExtra("tglLahir", tglLahir)
            intent.putExtra("jarak", jarak)
            startActivity(intent)
        }

        batalButton.setOnClickListener{
            finish()
        }
    }
}