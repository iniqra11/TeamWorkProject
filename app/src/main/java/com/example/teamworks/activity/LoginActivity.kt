package com.example.teamworks.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.teamworks.R

class LoginActivity : AppCompatActivity() {
    lateinit var signInButton: Button
    lateinit var signUpButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signInButton = findViewById(R.id.signInButton)
        signUpButton = findViewById(R.id.signUpButton)
        signInButton.setOnClickListener{
            val intent = Intent(this@LoginActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
        signUpButton.setOnClickListener{
            val intent = Intent(this@LoginActivity,
                SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}