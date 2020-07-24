package com.example.teamworks.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.teamworks.R

class SignInActivity : AppCompatActivity() {
    lateinit var signInButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        signInButton = findViewById(R.id.signInButton)
        signInButton.setOnClickListener{
            val intent = Intent(this@SignInActivity,
                HomeActivity::class.java)
            startActivity(intent)
        }
    }
}