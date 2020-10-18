package com.example.tugaspemrogramanmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        var txtRegistrasi :Button = findViewById<Button>(R.id.txtRegistrasi)
        txtRegistrasi.setOnClickListener(View.OnClickListener { var intent = Intent( this, Register::class.java)
            startActivity(intent)})
    }

}