package com.example.teamworks.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.teamworks.R

class SignUpActivity : AppCompatActivity() {
    lateinit var signUpButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        signUpButton =  findViewById(R.id.signUpButton)
        signUpButton.setOnClickListener{
            val intent = Intent(this@SignUpActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}