package com.faidur.praktikumandroidh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val noHP = intent.getStringExtra("noHP")
        val tglLahir = intent.getStringExtra("tglLahir")
        val jarak = intent.getIntExtra("jarak", 0   )

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val noHPTextView = findViewById<TextView>(R.id.noHPTextView)
        val tglLahirTextView = findViewById<TextView>(R.id.tglLahirTextView)
        val jarakTextView = findViewById<TextView>(R.id.jarakTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        noHPTextView.setText(noHP)
        tglLahirTextView.setText(tglLahir)
        jarakTextView.setText(jarak.toString())
    }
}